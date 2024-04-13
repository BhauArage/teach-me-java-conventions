package powerpackage;

public class PowerFinder {
    public static int powerOf(int num, int pow) {
        int p = 1;
        for (int i = 0; i< pow; i++) {
            p *= num;
        }
        return p;
    }
}
