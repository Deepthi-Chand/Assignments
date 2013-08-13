import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DecimalToRomanTest {
    DecimalToRoman decimalToRoman = new DecimalToRoman();
    @Test
    public void Test1_shouldReturnIWhen1Passed() throws Exception {
        Assert.assertThat("I",is(decimalToRoman.convert(1)));
    }

    @Test
    public void Test2_shouldReturnIIIWhen3Passed() throws Exception {
        Assert.assertThat("III",is(decimalToRoman.convert(3)));
    }

    @Test
    public void Test3_shouldReturnVWhen5Passed() throws Exception {
        Assert.assertThat("V",is(decimalToRoman.convert(5)));
    }

    @Test
    public void Test4_shouldReturnIVWhen4Passed() throws Exception {
        Assert.assertThat("IV",is(decimalToRoman.convert(4)));
    }

    @Test
    public void Test5_shouldReturnVIIWhen7Passed() throws Exception {
        Assert.assertThat("VII",is(decimalToRoman.convert(7)));
    }

    @Test
    public void Test6_shouldReturnXWhen10Passed() throws Exception {
        Assert.assertThat("X",is(decimalToRoman.convert(10)));
    }

    @Test
    public void Test7_shouldReturnXLIXWhen49Passed() throws Exception {
        Assert.assertThat("XLIX",is(decimalToRoman.convert(49)));
    }

    @Test
    public void Test8_shouldReturnLWhen50Passed() throws Exception {
        Assert.assertThat("L",is(decimalToRoman.convert(50)));
    }

    @Test
    public void Test9_shouldReturnXCIXWhen99Passed() throws Exception {
        Assert.assertThat("XCIX",is(decimalToRoman.convert(99)));
    }

    @Test
    public void Test10_shouldReturnCDXCWhen490Passed() throws Exception {
        Assert.assertThat("CDXC",is(decimalToRoman.convert(490)));
    }

    @Test
    public void Test11_shouldReturnDWhen500Passed() throws Exception {
        Assert.assertThat("D",is(decimalToRoman.convert(500)));
    }

    @Test
    public void Test12_shouldReturnDCCCWhen800Passed() throws Exception {
        Assert.assertThat("DCCC",is(decimalToRoman.convert(800)));
    }

    @Test
    public void Test13_shouldReturnCWhen900Passed() throws Exception {
        Assert.assertThat("CM",is(decimalToRoman.convert(900)));
    }

}
