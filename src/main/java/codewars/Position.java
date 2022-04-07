package codewars;

/*When provided with a letter, return its position in the alphabet.
Input :: "a"
Ouput :: "Position of alphabet: 1"*/
public class Position {
    public static String position(char alphabet) {
        String alphabetEng = "abcdefghijklmnopqrstuvwxyz";
        int charPosition = alphabetEng.indexOf(alphabet);
        return String.format("Position of alphabet: %s", charPosition + 1);
    }
}
