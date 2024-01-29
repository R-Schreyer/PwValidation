package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {



    @Test
    void boolean checkLengthOfPassword_WhenLengthAtLeast8_ThanTrue(Main.pw.length){
    //WHEN
        boolean actual = (pw.length > 7);
        boolean pwLengthAtLeast8 = true;
    }
}
