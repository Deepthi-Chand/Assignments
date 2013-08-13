import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateOnDelimiterTest {
    CalculateOnDelimiter calculateOnDelimiter;
    @Before
    public void setup() {
        calculateOnDelimiter = new CalculateOnDelimiter();
    }
    @Test
    public void test_1_should_separate_numbers() throws Exception {
        String[] result=CalculateOnDelimiter.getNumbers("1,2,3+");
        assertEquals("1",result[0]);
        assertEquals("2",result[1]);
    }

    @Test
    public void test_2_should_add_numbers() throws Exception {
        assertEquals("6",CalculateOnDelimiter.calculate("1,2,3+").toString());
    }

    @Test
    public void test_3_should_multiply_numbers() throws Exception {
        assertEquals("336",CalculateOnDelimiter.calculate("2.12.14*").toString());
    }

    @Test
    public void test_4_should_do_nothing_for_single_number() throws Exception {
        assertEquals("14",CalculateOnDelimiter.calculate("14+").toString());
    }

    @Test
    public void test_5_should_d0_nothing_for_single_number() throws Exception {
        assertEquals("14",CalculateOnDelimiter.calculate("14*").toString());
    }
}
