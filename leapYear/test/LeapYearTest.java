import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {
    LeapYear leapYear=new LeapYear();
    @Test
    public void Test1_shouldReturnTrueYearWhen2000Passed() throws Exception {
        assertTrue(leapYear.checkLeapYear(2000));
    }

    @Test
    public void Test2_shouldReturnTrueYearWhen1904Passed() throws Exception {
        assertTrue(leapYear.checkLeapYear(1904));
    }

    @Test
    public void Test3_shouldReturnFalseYearWhen1900Passed() throws Exception {
        assertFalse(leapYear.checkLeapYear(1900));
    }

    @Test
    public void Test4_shouldReturnFalseYearWhen1901Passed() throws Exception {
        assertFalse(leapYear.checkLeapYear(1901));
    }

}
