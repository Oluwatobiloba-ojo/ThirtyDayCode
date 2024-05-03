import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodRatingSystemTest {

    @Test
    public void testThatFoodRatingSystemCanBeCreatedAndNotNull(){
        FoodRatingSystem ratingSystem = new FoodRatingSystem();
        assertNotNull(ratingSystem);
    }

    @Test
    public void testThatFoodRatingSystemCanBeCreatedWithTheFoods_Cuisines_RatingAndHighestRatedCanBeGiven(){
        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] rating = {9, 12, 8, 15, 14, 7};
        FoodRatingSystem foodRatingSystem = new FoodRatingSystem(foods, cuisines, rating);
        String food = foodRatingSystem.highestRated("korean");
        assertEquals("kimchi", food);
    }

    @Test
    public void testThatFoodRatingIsBeenSetUpCanChangeRatingAndCheckLargestReturnTheLargestRating(){
        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] rating = {9, 12, 8, 15, 14, 7};
        FoodRatingSystem foodRatingSystem = new FoodRatingSystem(foods, cuisines, rating);
        String food = foodRatingSystem.highestRated("korean");
        assertEquals("kimchi", food);
        food = foodRatingSystem.highestRated("japanese");
        assertEquals(food, "ramen");
        foodRatingSystem.changeRating("sushi", 16);
        food = foodRatingSystem.highestRated("japanese");
        assertEquals(food, "sushi");
    }
    @Test
    public void testThatFoodRatingIsBeenSetUpCanChangeRatingAndCheckLargestReturnTheLargestRatingButCheckLexicographically(){
        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] rating = {9, 12, 8, 15, 14, 7};
        FoodRatingSystem foodRatingSystem = new FoodRatingSystem(foods, cuisines, rating);
        String food = foodRatingSystem.highestRated("korean");
        assertEquals("kimchi", food);
        food = foodRatingSystem.highestRated("japanese");
        assertEquals(food, "ramen");
        foodRatingSystem.changeRating("sushi", 16);
        food = foodRatingSystem.highestRated("japanese");
        assertEquals(food, "sushi");
        foodRatingSystem.changeRating("ramen", 16);
        food = foodRatingSystem.highestRated("japanese");
        assertEquals(food, "ramen");
    }

}