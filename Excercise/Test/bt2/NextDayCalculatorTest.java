package bt2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextday() {
        int year = 2020;
        int day = 29;
        int mounth = 2;
        String expect = "Nextday is " + 1 + "/" + 3 + "/" + 2020;
        String result = NextDayCalculator.Nextday(day,mounth,year);
        assertEquals(expect,result);
    }
    @Test
    void nextday1(){
        int year = 2021;
        int day = 31;
        int mounth = 12;
        String expect = "Nextday is " + 1 + "/" + 1 + "/" + 2022;
        String result = NextDayCalculator.Nextday(day,mounth,year);
        assertEquals(expect,result);
    }
    @Test
    void nextday2(){
        int year = 2019;
        int day = 20;
        int mounth = 11;
        String expect = "Next day is " + 21 + "/" + 11 + "/" + 2019;
        String result = NextDayCalculator.Nextday(day,mounth,year);
        assertEquals(expect,result);

    }
    @Test
    void nextday3(){
        int year = 2019;
        int day = 32;
        int mounth = 11;
        String expect = "Số ngày không hợp lệ";
        String result = NextDayCalculator.Nextday(day,mounth,year);
        assertEquals(expect,result);
}}