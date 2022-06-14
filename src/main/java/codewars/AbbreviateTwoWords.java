package codewars;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
*/
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] tempArray = name.split(" ");
        return String.format("%s.%s", tempArray[0].substring(0, 1), tempArray[1].substring(0, 1)).toUpperCase();
    }
}
