import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaiSuatTest {
    LaiSuat tongTien = new LaiSuat();

//    Test cua kiem thu All-c-uses/some-p-uses
    @Test
    void test1(){
        assertEquals(tongTien.tongTienLai(600000, 0, 20),266.6666666666667 );
    }
    @Test
    void test2(){
        assertEquals(tongTien.tongTienLai(600000, 1, 30),1500.0 );
    }
    @Test
    void test3(){
        assertEquals(tongTien.tongTienLai(700000, 3, 90),7350.000000000001 );
    }
    @Test
    void test4(){
        assertEquals(tongTien.tongTienLai(1000000, 6, 182),27000.0);
    }
    @Test
    void test5(){
        assertEquals(tongTien.tongTienLai(1200000, 12, 368),80300.0 );
    }
    @Test
    void test6(){
        assertEquals(tongTien.tongTienLai(650000, 1, 30),1625.0 );
    }
    @Test
    void test7(){
        assertEquals(tongTien.tongTienLai(770000, 3, 90),8085.000000000001 );
    }
    @Test
    void test8(){
        assertEquals(tongTien.tongTienLai(1000000, 6, 187),27000.0);
    }
    @Test
    void test9(){
    assertEquals(tongTien.tongTienLai(1210000, 12, 368),80969.16666666667 );
}
    @Test
    void test10(){
        assertEquals(tongTien.tongTienLai(600000, 0, 20),266.6666666666667 );
    }
    @Test
    void test11(){
        assertEquals(tongTien.tongTienLai(660000, 0, 20),293.3333333333333);
    }
    @Test
    void test12(){
        assertEquals(tongTien.tongTienLai(650000, 1, 30),1625.0 );
    }
    @Test
    void test13(){
        assertEquals(tongTien.tongTienLai(775000, 3, 90),8137.500000000001 );
    }
    @Test
    void test14(){
        assertEquals(tongTien.tongTienLai(1000000, 6, 188),27000.0 );
    }
    @Test
    void test15(){
        assertEquals(tongTien.tongTienLai(1210000, 12, 362),80969.16666666667 );
    }
    @Test
    void test16(){
        assertEquals(tongTien.tongTienLai(660000, 0, 50),733.3333333333334 );
    }

}