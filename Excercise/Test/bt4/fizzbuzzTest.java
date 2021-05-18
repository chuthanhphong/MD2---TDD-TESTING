package bt4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzTest {
    @Test
    void Test1(){
        int x = 3;
        String expect = "Fizz";
        String result = fizzbuzz.check(x);
        assertEquals(expect,result);
    }
    @Test
    void Test2(){
        int x = 5;
        String expect = "Buzz";
        String result = fizzbuzz.check(x);
        assertEquals(expect,result);
    }
    @Test
    void Test3(){
        int x = 15;
        String expect = "FizzBuzz";
        String result = fizzbuzz.check(x);
        assertEquals(expect,result);
    }
    @Test
    void Test4(){
        int x = 4;
        String expect = "None";
        String result = fizzbuzz.check(x);
        assertEquals(expect,result);
    }


}