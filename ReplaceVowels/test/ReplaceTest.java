import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReplaceTest {
    Conditions conditions = new Conditions(0.3f,"aeiou");
    Replace replace = new Replace(conditions);

    @Test
    public void Test5_should_return_hmommys_when_his_passed() throws Exception {
        assertThat("hmommys",is(replace.withString("mommy","his")));
    }

    @Test
    public void Test6_should_return_hmommyr_when_hear_passed() throws Exception {
        assertThat("hmommyr",is(replace.withString("mommy","hear")));
    }
}
