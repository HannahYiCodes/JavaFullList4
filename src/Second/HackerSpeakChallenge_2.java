package Second;

public class HackerSpeakChallenge_2 {
    public static String hackerSpeak(String b) {
        return b
                .replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('O', '0')
                .replace('s', '5');
    }
}
