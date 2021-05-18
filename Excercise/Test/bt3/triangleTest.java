package bt3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class triangleTest {

    @Test
    void triangleClassifierTest() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expect = "Tam Giac là tam giác đều";
        String result = triangle.TriangleClassifierTest(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void triangleClassifierTest2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expect = "Tam giác là tam giác cân";
        String result = triangle.TriangleClassifierTest(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void triangleClassifierTest3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expect = "Tam giác là tam giác vuông";
        String result = triangle.TriangleClassifierTest(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void triangleClassifierTest4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expect = "không phải tam giác";
        String result = triangle.TriangleClassifierTest(a,b,c);
        assertEquals(expect,result);
    }

}