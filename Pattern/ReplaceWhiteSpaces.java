public class ReplaceWhiteSpaces {
    public static final String EXAMPLE_TEST = "Occurs zero or more times" + " test pattern";
            

    public static void main(String[] args) {
    	System.out.println(EXAMPLE_TEST);
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 6
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}





