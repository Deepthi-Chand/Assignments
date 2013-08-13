import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FactorsTest {

    Factors factors;

    @Before
    public void setup() {
        factors = new Factors();
    }
    @Test
    public void test_1_should_return_true_when_checking_if_7_is_prime() throws Exception {
           assertTrue(factors.isPrime(7));
    }
    @Test
    public void test_2_should_return_false_when_checking_if_4_is_prime() throws Exception {
           assertFalse(factors.isPrime(4));
    }
    @Test
    public void test_3_should_return_true_when_checking_if_2_is_prime() throws Exception {
           assertTrue(factors.isPrime(2));
    }
    @Test
    public void test_4_should_return_false_when_checking_if_1_is_prime() throws Exception {
           assertFalse(factors.isPrime(1));
    }

    @Test
    public void test_5_should_return_prime_factors_of_10() throws Exception {
        assertEquals("[2, 5]",factors.primeFactors(10).toString());
    }

    @Test
    public void test_6_should_return_prime_factors_of_25() throws Exception {
        assertEquals("[5, 5]",factors.primeFactors(25).toString());
    }
    @Test
    public void test_7_should_return_prime_factors_of_2() throws Exception {
        assertEquals("[2]",factors.primeFactors(2).toString());
    }
    @Test
    public void test_8_should_return_prime_factors_of_1() throws Exception {
        assertEquals("[]",factors.primeFactors(1).toString());
    }
}