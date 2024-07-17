package July;
//** EITHER STRING IS IN UPPER CASE OR in small cases : WITHOUT SPACES OR ANY OTHER SPECIAL CHARS
public class PrintAllDuplicatesInString {

//    DAY - 4 :
    static void printDuplicates (String str) {
//        String str = "sinstriiintng";

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++) {
//            System.out.println((int)str.charAt(i));
            counts[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++)
            if (counts[i] > 1)
                System.out.println((char)(i + 'a') + " - " + counts[i]);

    }

    public static void main(String[] args) {
        String s = "helloworld";
        printDuplicates(s);
    }
}
