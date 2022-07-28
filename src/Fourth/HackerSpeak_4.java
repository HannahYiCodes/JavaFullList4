package Fourth;

public class HackerSpeak_4 {
    public static String hackSpeak(String a) {
        return a
                .replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('o', '0')
                .replace('s', '5');
    }

    public static String hackTranslate(String b) {
        return b
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('1', 'i')
                .replace('0', 'o')
                .replace('5', 's');
    }
}
