public class CalculateMoneyInLeetCode {


    public static int totalMoney(int day) {
        int totalMoney = 0;
        int numberOfDay = 0;
        while (day >= 7){
            totalMoney += 7 * (4 + numberOfDay);
            day -= 7;
            numberOfDay ++;
        }
        if (day != 0) totalMoney += calculateLinearPay(day, numberOfDay);
        return totalMoney;
    }

    private static int calculateLinearPay(int day, int numberOfDay) {
        numberOfDay = numberOfDay + 1;
        int total = numberOfDay;
        for (int index = 1; index < day; index++) {
            total += numberOfDay+index;
        }
        return total;
    }
}
