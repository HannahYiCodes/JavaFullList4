package First;

public class HackerSpeakChallenge {
    public static String hackerSpeak(String theString) {
        return theString
                .replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('O', '0')
                .replace('s', '5');
    }
}
