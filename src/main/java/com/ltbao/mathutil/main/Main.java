package com.ltbao;

import com.ltbao.mathutil.core.test.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnWell();
        testFactorialGivenRightArgument5ReturnWell();
    }

    //ta sẽ test hàm của ta test ra, gọi là unit testing
    //code cơ bản nhất
    //ta cần test hàm getFactorial() với các bộ data đưa vào -> những test case
    //test case là gì?: những bộ data đưa vào hàm và app và cách thức xài bộ data này,
    // và keèm theo kết quả kỳ vọng app/hàm sẽ trả về

    //Testcase #2

    //Description: to check, to verify the getFactorial() method with corect
    //              given argument, a.g n = 5

    //Steps/procedures: call getFactorial() method with valid arg: getFactorial(5)

    //Expected result (ta hy vọng hàm trả về gì với n = 0)
    //to have number 1 as the result of 0!

    //Status (trạng thái của testcase là gì sau khi app chạy hàm)
    //          Passed, Failed (bug)
    //          chờ xem app, hàm xử lý được số mấy - Actual value
    //          và đi so sánh với expected ở trên để luận đúng sai!!

    //Mlem vì 0! trả về 1 thật

    //Viết code test để test hàm chính getFactorial() chạy đúng với n = 0 hay ko

    static void testFactorialGivenRightArgument5ReturnWell() {
        int n = 5; //dự tính tính 0!
        long expectedResult = 120;
        System.out.println("5! = \n"
                + "expectedResult: 120\n"
                + "actualResult: " + MathUtility.getFactorial(5));
    }

    //Testcase #1

    //Description (mô tả mục đích testcase dùng test điều gì)
    //              to check, to verify the getFactorial() method with corect
    //              given argument, a.g n = 0
    //Steps/procedures (các bước test hàm/app, nhấn gì, nhập gì...)
    //  call getFactorial() method with valid arg: getFactorial(0)

    //Expected result (ta hy vọng hàm trả về gì với n = 0)
    //to have number 1 as the result of 0!

    //Status (trạng thái của testcase là gì sau khi app chạy hàm)
    //          Passed, Failed (bug)
    //          chờ xem app, hàm xử lý được số mấy - Actual value
    //          và đi so sánh với expected ở trên để luận đúng sai!!

    //Mlem vì 0! trả về 1 thật

    //Viết code test để test hàm chính getFactorial() chạy đúng với n = 0 hay ko

    static void testFactorialGivenRightArgument0ReturnWell(){
        int n = 0; //dự tính tính 0!
        long expectedResult = 1; //0! hy vọng là 1
        long actualResult = MathUtility.getFactorial(0); //tính thử 0! bằng hàm

        //so sánh
        System.out.println(n + "! = \n"
        + "expectedResult: " + expectedResult + "\n"
        + "actualResult: " + actualResult);
    }


}