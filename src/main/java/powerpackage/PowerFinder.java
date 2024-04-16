package powerpackage;

public class PowerFinder {
    public  int getPowerOf(int base, int exponent) {
        int power = 1;
        for (int num = 0; num <exponent; num++) {
            power *= base;
        }
        return power;
    }
}
