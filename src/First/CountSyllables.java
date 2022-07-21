package First;

public class CountSyllables {
    public static int numberSyllables(String word) {
        String[] syl = word.split("-");
        return syl.length;
    }
}
