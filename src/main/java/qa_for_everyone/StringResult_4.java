package qa_for_everyone;

public class StringResult_4 {

    public static void getSymbol(String myString, char myChar) {
        char[] charArrayMyString = myString.toCharArray();
        for (char c : charArrayMyString) {
            if (c == myChar)
                System.out.print(c);
        }
    }

    public static int getNumberOfSymbol(String myString, char myChar) {
        char[] charArrayMyString = myString.toCharArray();
        int count = 0;
        for (int i = 0; i < charArrayMyString.length; i++) {
            if (charArrayMyString[i] == myChar) {
                count++;
            }
        }
        return count;
    }

    public static void getIndex(String myString, String partOfString) {
        myString = myString.toLowerCase();
        partOfString = partOfString.toLowerCase();
        int index1 =myString.indexOf(partOfString);
        while (index1 != -1){
            System.out.print(index1 + " ");
            int index = myString.indexOf(partOfString, index1 + partOfString.length());
            index1 = index;
        }
    }
}
