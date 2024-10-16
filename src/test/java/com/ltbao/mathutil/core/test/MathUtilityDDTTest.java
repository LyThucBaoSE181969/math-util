package com.ltbao.mathutil.core.test;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //class này sẽ chứa các hàm kiểm thử code theo style ddt
    //data driven testing, ta tách code kiểm thử (các lệnh assert()) riêng
    //ko gộp chung với bộ data kiểm thử
    //mục tiêu: dễ đọc code kiểm thử, dễ dàng đánh giá đc xem có bao nhiêu test\
    //case đang đc test, đã đủ hay chưa, vì nó rất dễ thấy do data nằm riêng
    //-> giúp nguyên lý pesticide paradox

    //bộ data đưa vào test sẽ để riêng ở 1 hàm public static
    //hàm này trả về 1 mảng các con số âm < 0 or > 20, đó là những n gây ra
    //exception khi ta xài hàm getF(). Ta test xem hàm có ném ra ngoại lệ với
    //data cà chớn hay ko
    public static Integer[] initWrongDataSet() {
        return new Integer[]{-1, -2, -3, -4, -100, 100, 21, 22, 23, 1000, -1000};
    }

    //test case: check if getFactorial() throws IllegalArgumentException
    //if case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    //test case: check getFactorial() with right argument and runs well
    // n = 0 , 1, 2, ...19, 20
    public static Object[][] initRightDataSet() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
        };
    }

    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));

    }
}