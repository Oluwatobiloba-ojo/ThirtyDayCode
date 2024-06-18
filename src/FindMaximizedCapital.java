public class FindMaximizedCapital {


    public static int findMaximizedCapital(int numberOfProject, int capital, int[] profits, int[] capitals) {
        while(numberOfProject != 0){
            int max = 0;
            int removeIndex = -1;
            for (int index = 0; index < capitals.length; index++) {
                if (capitals[index] != -1 && capitals[index] <= capital){
                    if (profits[index] > max){
                        max = profits[index];
                        removeIndex = index;
                    }
                }
            }
            if(removeIndex == -1) break;
            profits[removeIndex] = -1;
            capitals[removeIndex] = -1;
            capital += max;
            numberOfProject--;
        }
        return capital;
    }

}
