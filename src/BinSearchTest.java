import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinSearchTest {
    BinSearch binSearch = new BinSearch();
    int v1[] = null;
    int v2[] = {6};
    int v3[] = {3};
    int v4[] = {4};
    int v6[] = {1, 2, 3, 4};

    @Test
    void test1(){
        assertEquals(binSearch.Binsearch(3, v1, 0), -1);
    }
    @Test
    void test2(){
        assertEquals(binSearch.Binsearch(6, v2, 1), 0);
    }
    @Test
    void test3(){
        assertEquals(binSearch.Binsearch(6, v3, 1), -1);
    }
    @Test
    void test4(){
        assertEquals(binSearch.Binsearch(3, v4, 1), -1);
    }

    // test voi do do All-p-uses cua bien x
    @Test
    void test5(){
        assertEquals(binSearch.Binsearch(3, v6, 4), 2);
    }
}