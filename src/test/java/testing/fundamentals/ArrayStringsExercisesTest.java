package testing.fundamentals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayStringsExercisesTest {
    @Test
    void shoudReplaceSpaceInString() {
        //Given
        String inputText = "Textul pe care testam";
        String expactedResult = "Textul:pe:care:testam";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();

        //When
        String actualResult = arrayStringsExercises.changeSpaceInString(inputText);

        //Then
        assertEquals(expactedResult, actualResult);
    }

    @Test
    void shoudAppendLenght() {
        // Given
        String inputText = "Characters";
        String expactedRezult = "Characters10";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();

        // When
        String actualResult = arrayStringsExercises.appendsLenght(inputText);
        System.out.println(" Actual result = " + actualResult);

        // Then
        assertEquals(expactedRezult, actualResult);
        assertThat(actualResult).endsWith("10");
    }

    @Test
    void shoudReplaceEvenNumbers() {
        // Given
        int[] array = {1, 2, 4, 5, 6};
        int[] expectedArray = {1, 1, 2, 5, 3};
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();

        // When
        int[] resultArray = arrayStringsExercises.replaceEvenNumbers(array);

        // Then
        assertArrayEquals(expectedArray, resultArray);
    }

    // Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)

    @Test
    void shoudFindMInElement() {
        //Given

        int[] array = {4, 2, 3, 1, 5, 6};
        int expectedResult = 3;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();

        //When
        int actualResult = arrayStringsExercises.findMinPositionElement(array);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shoudReturnDefaultValueForEmptyArray() {
        //Given

        int[] array = {};
        int expectedRezult = -1;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();

        //When

        int actualResult = arrayStringsExercises.findMinPositionElement(array);

        //Then
        assertEquals(expectedRezult, actualResult);

    }

    //Daca sunt mai multe elemente egale, sa ne returneze ultima pozitie a elementului respectiv !! --> TEMA

}