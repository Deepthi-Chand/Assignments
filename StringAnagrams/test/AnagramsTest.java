import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {
    Anagrams anagrams;
    @Before
    public void setup() {
        anagrams = new Anagrams();
    }
    @Test
    public void test_1_should_generate_anagrams() throws Exception {
        StringBuilder input=new StringBuilder("ab");
        List<String> result= anagrams.generate(input);
        List<String> expectedResult=new ArrayList<String>();
        expectedResult.add("ab");
        expectedResult.add("ba");
        assertEquals(expectedResult,result);

    }
    @Test
    public void test_2_should_generate_anagrams() throws Exception {
        StringBuilder input=new StringBuilder("abc");
        List<String> result= anagrams.generate(input);
        List<String> expectedResult=new ArrayList<String>();
        expectedResult.add("abc");
        expectedResult.add("acb");
        expectedResult.add("bac");
        expectedResult.add("bca");
        expectedResult.add("cba");
        expectedResult.add("cab");
        assertEquals(expectedResult,result);

    }
}
