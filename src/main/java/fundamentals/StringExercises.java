package fundamentals;

public class StringExercises {

    //  Write a Java program to get the character at the given index within the String

    public static void givenIndex() {
        String word = "Original String Index";
        System.out.println("Original String = " + word);
        int index1 = word.charAt(2);
        int index2 = word.charAt(7);

        System.out.println("The character at position 2 is " + (char) index1);
        System.out.println("The character at position 7 is " + (char) index2);
    }

    //  Write a Java program to test if a given string contains the specified sequence of char values (another string).

    public static void givenStringContains() {
        String text = "If given string contains a specified sequence of char values";
        String word = "If";
        System.out.println("Original text : " + text);
        System.out.println("Specified sequence of char values : " + word);
        System.out.println(text.contains((word)));
    }

    //  Write a Java program to replace a specified character with another character in a string.

    public static void replaceSpecifiedCharacter() {
        String myText = "Replace a specified character with another";
        String newString = myText.replace('c', 'a');

        System.out.println("Original text : " + myText);
        System.out.println("New text with replaced characters : " + newString);

    }

    //  Write a Java program to uppercase first letter of every word in a text(string)

    public static void uppercaseFirstLetter() {
        String myText1 = "Write a Java program to uppercase first letter of every word in a text";
        String uppercase = myText1.toUpperCase();

        System.out.println("Original text is : " + myText1);
        System.out.println("Text after uppercase : " + uppercase);

    }

    // Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)

    public static void ignoringCase() {
        String myWord1 = "Dog";
        String myWord2 = "dOG";
        boolean result = myWord1.equalsIgnoreCase(myWord2);

        System.out.println(result);

    }


}
