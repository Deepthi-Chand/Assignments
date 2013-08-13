import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConditionsTest {
    Conditions conditions = new Conditions(0.3f,"aeiou");

    @Test
    public void Test1_should_return_1_when_asked_for_e() throws Exception {

        assertEquals(1, conditions.charInRequiredSequence('e'));
    }

    @Test
    public void Test2_should_return_minus_1_when_asked_for_p() throws Exception {

        assertEquals(-1, conditions.charInRequiredSequence('p'));
    }

    @Test
    public void Test3_should_return_false_when_wr_passed() throws Exception {
        assertFalse(conditions.checkForLimit("wr"));
    }

    @Test
    public void Test4_should_return_true_when_wei_passed() throws Exception {
        assertTrue(conditions.checkForLimit("wei"));
    }
}
