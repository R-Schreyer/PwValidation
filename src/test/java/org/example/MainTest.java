package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {



    @Test
    void  checkLengthOfPassword_WhenLengthAtLeast8_ThanTrue(){
    //GIVEN
        boolean expected = true;
        //WHEN
        boolean actual = Main.checkLengthOfPassword("EmilPeter241");
        //Then
        assertEquals(expected, actual);
    }
    @Test
    void  checkLengthOfPassword_WhenFewerThan8_ThanFalse(){
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.checkLengthOfPassword("Emil241");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isDigitInPassword_WhenDigitInPassword_ThenTrue(){
        //GIVEN
        boolean expected = true;
        //WHEN
        boolean actual = Main.isDigitInPassword("EmilPeter241");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isDigitInPassword_WhenNoDigitInPassword_ThenFalse(){
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.isDigitInPassword("EmilPeter");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isUppercaseAndLowercaseInPassword_WhenContainsUppercaseAndLowercase_ThenTrue(){
        //GIVEN
        boolean expected = true;
        //WHEN
        boolean actual = Main.isUppercaseAndLowercaseInPassword("EmilPeter241");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isUppercaseAndLowercaseInPassword_WhenContainsNoUppercase_ThenFalse(){
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.isUppercaseAndLowercaseInPassword("emilpeter241");
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isUppercaseAndLowercaseInPassword_WhenContainsNoLowercase_ThenFalse(){
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.isUppercaseAndLowercaseInPassword("EMILPETER241");
        //THEN
        assertEquals(expected, actual);
    }


}
