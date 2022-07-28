package Fourth;

public class TwoMakesTen_4 {
    public static boolean makesTen(int a, int b) {
        if ( (a+b) == 10 || a == 10 || b == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean makesHundred(int x, int y) {
        if ( (x+y) == 100 || x == 100 || y == 100 ) {
            return true;
        } else {
            return false;
        }
    }
}