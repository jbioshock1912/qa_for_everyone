package codewars;

/*Build a function that returns an array of integers from n to 1 where n>0.*/
class Sequence {

    static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = n; i > 0; i--) {
            array[n - i] = i;
        }
        return array;
    }
}
