package Fourth;

public class CountSyllables_4 {

    public static int numSyllables(String str) {
        String[] syl = str.split("-");
        return syl.length;
    }
}
