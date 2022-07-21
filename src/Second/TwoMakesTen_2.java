package Second;

public class TwoMakesTen_2 {
    public static boolean makesTen(int a, int b) {
        if ((a + b) == 10 || a == 10 || b == 10) {
            return true;
        } else {
            return false;
        }
    }
}