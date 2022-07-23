package Third;

public class HackerSpeak_3 {
    public static String hackSpeak(String x) {
        return x
                .replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('O', '0')
                .replace('s', '5');
    }
}
