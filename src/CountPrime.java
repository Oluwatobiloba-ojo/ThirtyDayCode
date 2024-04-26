import java.util.ArrayList;
import java.util.List;

public class CountPrime {
    public static int countPrimes(int n) {
        int numberOfPrimes = 0;
        for (int count = 2; count < n; count++) {
            if (getFactors(count).size() == 2){
                numberOfPrimes ++;
            }
        }
        return numberOfPrimes;
    }

    private static List<Integer> getFactors(int count) {
        List<Integer> primes = new ArrayList<>();
        for (int value = 1; value <= count; value++) {
            if (count % value == 0) primes.add(value);
        }
        return primes;
    }

}
