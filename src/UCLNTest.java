import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UCLNTest {
    UCLN ucln = new UCLN();

    // Test UCLN theo do do C2
    @Test
    void test1(){
        assertEquals(ucln.UCLN(-5, -2), 1);
    }
    @Test
    void test2(){
        assertEquals(ucln.UCLN(0, 5), 5);
    }
    @Test
    void test3(){
        assertEquals(ucln.UCLN(3, 0), 3);
    }
    @Test
    void test4(){
        assertEquals(ucln.UCLN(1, 1), 1);
    }
    @Test
    void test5(){
        assertEquals(ucln.UCLN(2, 4), 2);
    }
    @Test
    void test6(){
        assertEquals(ucln.UCLN(6, 3), 3);
    }

    // test UCLN theo do do all-def coverage
    @Test
    void test7(){
        assertEquals(ucln.UCLN(3, 0), 3);
    }
    @Test
    void test8(){
        assertEquals(ucln.UCLN(-2, 0), 2);
    }
    @Test
    void test9(){
        assertEquals(ucln.UCLN(8, 4), 4);
    }
    @Test
    void test10(){
        assertEquals(ucln.UCLN(6, 2), 2);
    }
    @Test
    void test11(){
        assertEquals(ucln.UCLN(0, -1), 1);
    }
    @Test
    void test12(){
        assertEquals(ucln.UCLN(3, 6), 3);
    }
}