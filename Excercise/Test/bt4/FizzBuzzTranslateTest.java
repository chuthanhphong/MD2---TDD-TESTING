package bt4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzbuzzNum() {
        int a = 3;
       String expect = "Fizz";
        String result = FizzBuzzTranslate.FizzbuzzNum(a);
        assertEquals(expect,result);
    }
    @Test
    void fizzbuzzNum2() {
        int a = 5;
        String expect = "Buzz";
        String result = FizzBuzzTranslate.FizzbuzzNum(a);
        assertEquals(expect,result);
    }
    @Test
    void fizzbuzzNum3() {
        int a = 67;
        String expect = "sáubảy";
        String result = FizzBuzzTranslate.FizzbuzzNum(a);
        assertEquals(expect,result);
    }
    @Test
    void fizzbuzznum4(){
        int a = 101;
        String expect = "không có số phù hợp";
        String result = FizzBuzzTranslate.FizzbuzzNum(a);
        assertEquals(expect,result);
    }
    @Test
    void fizzbuzznum5(){
        int a = -1;
        String expect = "không có số phù hợp";
        String result = FizzBuzzTranslate.FizzbuzzNum(a);
        assertEquals(expect,result);
    }
}