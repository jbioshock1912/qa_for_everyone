package codewars;

/*Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter,
see example below!
E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"*/
class TripleTrouble {

    static String tripleTrouble(String one, String two, String three) {
        StringBuilder result = new StringBuilder();
        int min = Math.min(one.length(), two.length());
        min = Math.min(min, three.length());
        for (int i = 0; i < min; i++) {
            result.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return result.toString();
    }
}
