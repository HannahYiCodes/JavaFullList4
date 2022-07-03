public class CaseInsensitiveComparison {
    public static boolean match(String strOne, String strTwo) {
        return strOne.equalsIgnoreCase(strTwo);
    }
}

// Other Solution
// str1.toLowerCase().equals(str2.toLowerCase());