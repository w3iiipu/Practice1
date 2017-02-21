import java.util.Scanner;
/*
        Please implement this method to
        return the word count in a given String.
        Assume that the parameter String can only contain spaces and alphanumeric characters.
       */
public class BetterProgrammerTask {

    //counts if there are more then one blank space
    public static int countWords(String s) {
        String[] words=s.split(" ");
        return words.length;
    }

    //ternary...like an if else...only operator to take 3 conditions if trimmed is empty is true =0, else trim split at spaces
    public static int countWords2(String s) {
        String trimmed = s.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        return words;
    }

    //same function as countwords2 but without using ternary operator
    public static int countWords3(String s){
        String[] words= s.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(countWords(s));
//        System.out.println(countWords2(s));
        System.out.println(countWords3(s));





    }
}
