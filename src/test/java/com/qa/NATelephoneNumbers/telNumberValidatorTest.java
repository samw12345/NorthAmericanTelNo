package com.qa.NATelephoneNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class telNumberValidatorTest {
        @Test
        public void test_tel_number_length_is_valid(){

            //arrange
            String telNumber = "+16085551212";
            int expectedResult = 12;
            telNumberValidator cut = new telNumberValidator(telNumber);
            //act
            int result = cut.getTelNumber().length();
            //assert
            assertEquals(expectedResult, result);

        }
    }

