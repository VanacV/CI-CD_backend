package com.code_vanac.fullstack_backend.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculate {

    @InjectMocks
    Calculate calculator;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
        void testAdd(){
            int a = 2;
            int b = 6;
            int sumMock = 8;

            int sum = Calculate.sum(a, b);
            assertEquals(sumMock, sum);
    }

    @Test
    void testSubtract(){
        int a = 12;
        int b = 6;
        int subMock = 6;

        int sub = Calculate.sub(a, b);
        assertEquals(subMock, sub);

    }

    @Test
    void testMultiply(){
        int a = 12;
        int b = 3;
        int multiplyMock = 36;

        int result = Calculate.mul(a, b);
        assertEquals(multiplyMock, result);
    }

}
