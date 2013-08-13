import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;

public class Factors {
    public List<Integer> primeFactors(int input) {
        List<Integer> output = new ArrayList<Integer>();
        int number = 0;
        while(input!=1) {
            for(number=2;number<=input;number++) {
                if(input % number==0) {
                    if(isPrime(number)) {
                        output.add(number);
                        input/=number;
                        break;
                    }
                }
            }
        }
        return output;
    }

    public boolean isPrime(int number) {
        if(number==1)
            return false;
        int i;
        for(i=2;i<ceil(number/2+1);i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
}
