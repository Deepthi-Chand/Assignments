import static java.lang.Character.isDigit;

public class CalculateOnDelimiter {

    public static String[] getNumbers(String input) {

        String[] numberStrings = new String[input.length()-1];

        int index = 0;
        boolean flag=false;
        int i;

        for (i = 0; i < numberStrings.length; i++)
            numberStrings[i] = "";

        for (i = 0; i < input.length(); i++) {
            if (isDigit(input.charAt(i))) {
                numberStrings[index] += input.charAt(i);
                flag = false;

            }
            else if (!flag) {
                    index++;
                    flag = true;
            }
        }
//        String[] returnString = new String[index];
//        System.arraycopy(numberStrings, 0, returnString, 0, index);
        return numberStrings;
    }


    public static Long calculate(String input) {

        Long result = null;
        String[] numberStrings = getNumbers(input);
        if (input.charAt(input.length() - 1) == '+') {
            result=0l;
            for (int i=0;i<numberStrings.length; i++) {
                if(numberStrings[i]!="")
                result += Integer.parseInt(numberStrings[i]);
            }
        }
        else if(input.charAt(input.length()-1)=='*'){
            result=1l;
            for(int i=0;i<numberStrings.length; i++){
                if(numberStrings[i]!="")
                    result*=Integer.parseInt(numberStrings[i]);
            }
        }
        return result;
    }
}
