package codewars;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String firstLetter = name.substring(0, 1);
       String secondLetter = "";
       String[] tempArray = name.split("");
        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i].equals(" ")){
                secondLetter = tempArray[i + 1];
                break;
            }
        }
        return String.format("%s.%s", firstLetter, secondLetter).toUpperCase();
    }
}
