public class PowerOfTwo {

    public static boolean isPowerOfTwo(int numb) {
        if (numb == 0) return false;
        while (numb != 1){
            if (numb % 2 != 0) return false;
            numb /= 2;
        }
        return true;
    }
}
