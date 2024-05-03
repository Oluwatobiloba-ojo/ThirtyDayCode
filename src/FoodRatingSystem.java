import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodRatingSystem {

    private HashMap<String, List<String>>cuisine = new HashMap<>();

    private HashMap<String, Integer> foods_rating = new HashMap<>();

    public FoodRatingSystem(){}

    public FoodRatingSystem(String[] foods, String[] cuisines, int[] rating) {
        for (int index = 0; index < cuisines.length; index++) {
            foods_rating.put(foods[index], rating[index]);
            if (this.cuisine.get(cuisines[index]) == null){
                List<String> food = new ArrayList<>();
                food.add(foods[index]);
                cuisine.put(cuisines[index], food);
            }else {
                cuisine.get(cuisines[index]).add(foods[index]);
            }
        }
    }

    public String highestRated(String cuisine) {
        List<String> foods = this.cuisine.get(cuisine);
        int max = 0;
        String result = "";
        for (String food : foods) {
            int currentMax = this.foods_rating.get(food);
            if (currentMax > max){
                max = currentMax;
                result = food;
            } else if (currentMax == max && food.compareTo(result) < 0) result = food;
        }
        return result;
    }

    public void changeRating(String foods, int rating) {
        this.foods_rating.replace(foods, rating);
    }
}
