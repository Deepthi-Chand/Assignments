import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortNumbersOnBinaryTest {
    SortNumbersOnBinary sortNumbersOnBinary;
    @Before
    public void setup() {
        sortNumbersOnBinary = new SortNumbersOnBinary();
    }
    @Test
    public void test_1_should_return_1_for_count_of_2() throws Exception {
        assertEquals(1, sortNumbersOnBinary.getCount(2));
    }
    @Test
    public void test_2_should_return_2_for_count_of_3() throws Exception {
        assertEquals(2, sortNumbersOnBinary.getCount(3));
    }
    @Test
    public void test_3_should_return_3_for_count_of_7() throws Exception {
        assertEquals(3, sortNumbersOnBinary.getCount(7));
    }

    @Test
    public void test_4_should_return_sorted_numbers_on_count_of_binary() throws Exception {
        List<Integer> input= Arrays.asList(1,2,3);
        assertEquals("[1, 2, 3]",sortNumbersOnBinary.sort(input).toString());
    }

    @Test
    public void test_5_should_return_sorted_numbers_on_count_of_binary() throws Exception {
        List<Integer> input= Arrays.asList(3,2,1);
        assertEquals("[1, 2, 3]",sortNumbersOnBinary.sort(input).toString());
    }

    @Test
    public void test_6_should_return_sorted_numbers_on_count_of_binary() throws Exception {
        List<Integer> input= Arrays.asList(1,6,3);
        assertEquals("[1, 3, 6]",sortNumbersOnBinary.sort(input).toString());
    }
}
