import java.util.ArrayList;
import java.util.List;

public class Anagrams {

    private List<String> output = new ArrayList<String>();
    public List<String> generate(StringBuilder input) {
        iterate(input, 0);
        return output;
    }

    private void iterate(StringBuilder input, int index) {
        if(input.length() == index+1) {
            output.add(input.toString());
        }

        else {
            iterate(input,index+1);
            for(int i=index+1;i<input.length();i++) {
                input = swap(input, index, i);
                iterate(input, index + 1);
                input = swap(input, index, i);
            }
        }
    }

    private StringBuilder swap(StringBuilder input, int index, int i) {
        char temp;
        temp=input.charAt(i);
        input.setCharAt(i, input.charAt(index));
        input.setCharAt(index, temp);
        return input;
    }
}
