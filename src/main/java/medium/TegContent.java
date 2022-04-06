package medium;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TegContent {

    private static final Pattern REMOVE_TAGS = Pattern.compile("<.+?>");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            String[] lineArray = line.split("<[^?>]*>");
            for (int i = 0; i < lineArray.length; i++) {
                if (!lineArray[i].isEmpty()) {
                    System.out.println(lineArray[i]);
                }
            }
            testCases--;
        }
        in.close();
    }
}