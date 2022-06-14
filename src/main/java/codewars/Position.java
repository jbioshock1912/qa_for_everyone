package codewars;

/*When provided with a letter, return its position in the alphabet.
Input :: "a"
Ouput :: "Position of alphabet: 1"*/
class Position {

    private static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static String position(char alphabet) {
        int charPosition = ALPHABET.indexOf(alphabet);
        return String.format("Position of alphabet: %s", charPosition + 1);
    }
}
