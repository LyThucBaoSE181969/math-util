package com.ltbao.mathutil.core.test;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //test case structure: ID, Description, Steps/Procedures
    //                     Expected Result, Status (Passed, Failed)
    //                     Bug ID (Bugzilla, Jira)

    //test case 4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {


//        MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ hay ko
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(50);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(150);});

    }

    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {

//        MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ hay ko
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});

    }// thấy ngoại lệ mừng
    // vì hàm thiết kế đưa ra n < 0 hoặc n > 20 thi fngoaij lệ phải đc ném ra
    //vậy nếu hàm ném ngoại lệ khi n = -5 rõ ràng hàm đúng, hàm đúng thì phải xanh
    //xanh vì phải trả về ngoại lệ đúng như kì vọng

    //test case 3 (gop): check getFactorial() with n = 2 3 4 5 6...
    @Test
    public void testFactorialGivenRightArgumentsReturnsWell() {

        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        //bad smells = đoạn code bốc mùi( Robbert C. Martin - Clean Code)
        // Code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
        // ta cần tinh chỉnh , tối ưu code -REFACTOR, RÈACTORING
    }


    //                    Bug ID(BugZilla,Jira)
    //Test case #1: check getFactorial() with n = 0
    //..
    //test case #2:check getFactorial() with n =1


    @Test
    public void testFactorialGivenRightArgument1ReturnsWell() {

        assertEquals(1, MathUtility.getFactorial(1));

    }

    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expectedValue = 1; // hy vọng 0! trả ề 1
        long actualValue = MathUtility.getFactorial(0); // giả bộ hàm chạy sai hàm trả về 10

        //so sánh 2 thăằng EXPECTED VS. ACTUAL
        assertEquals(expectedValue, actualValue);
    }
}