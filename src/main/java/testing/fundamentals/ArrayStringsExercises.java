package testing.fundamentals;

public class ArrayStringsExercises {

    // Replaces all the spaces in a text with “:”

    public String changeSpaceInString(String text) {
        String textChanged;
        // 1. Apply split on String and concatened words with ' : '
        // 2. Iterate over the sting and copy all the character  until " " and than add ":" in a new string
        // 3. Iterate over string and change the string directly
        // 4. User replace

        return text.replace(' ', ':');
    }

    //  Ads in a text, after every “a” letter the length of the text read until then.

    public String insertLenghtAfterLetterA(String text) {
        return "";
    }

    public String appendsLenght(String text) {
        return text + text.length();
    }

    // Replaces all the even number in an array with their half

    public int[] replaceEvenNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
        return array;
    }

    // Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)

    public int findMinPositionElement(int[] array) {

        if (array.length == 0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        // int[] a = { 1, 9999, 110}
        // int min = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <min) {
                min = array[i];
                position = i;
            }
        }
        return position;

    }
}
