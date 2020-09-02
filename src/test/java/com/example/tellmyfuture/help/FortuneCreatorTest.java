package com.example.tellmyfuture.help;

import com.example.tellmyfuture.request.PersonInfoRequestModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FortuneCreatorTest {

    @BeforeEach
    void before(){
        System.out.println("running a test");
    }

    @Test
    void testIfFiveYearsOldChildWillHaveAColorfulDay() {
        PersonInfoRequestModel personInfoRequestModel = new PersonInfoRequestModel("Kening", 5, "Male");
        FortuneCreator fortuneCreator = new FortuneCreator();
        String message = fortuneCreator.getResult(personInfoRequestModel);
        String rightMessage = "You will have a colorful day!";
        assertEquals(message, rightMessage);
    }

    @Test
    void testIf13YearsOldChildWillHaveAPlayfulDay() {
        PersonInfoRequestModel personInfoRequestModel = new PersonInfoRequestModel("Lolo", 13, "Male");
        FortuneCreator fortuneCreator = new FortuneCreator();
        String message = fortuneCreator.getResult(personInfoRequestModel);
        String rightMessage = "You will have a playful day!";
        assertEquals(message, rightMessage);
    }

    @Test
    void testIf20YearsOldChildWillHaveAHardworkingDay() {
        PersonInfoRequestModel personInfoRequestModel = new PersonInfoRequestModel("Mimmi", 20, "Female");
        FortuneCreator fortuneCreator = new FortuneCreator();
        String message = fortuneCreator.getResult(personInfoRequestModel);
        String rightMessage = "You will have a hardworking day!";
        assertEquals(message, rightMessage);
    }

    @Test
    void testIfAgeIsNegetiveWillGetError() {
        PersonInfoRequestModel personInfoRequestModel = new PersonInfoRequestModel("Haha", -9, "Male");
        FortuneCreator fortuneCreator = new FortuneCreator();
        String message = fortuneCreator.getResult(personInfoRequestModel);
        String rightMessage = "error";
        assertEquals(message, rightMessage);
    }


}