public class Replace {

    private Conditions conditions;

    Replace(Conditions conditions) {
        this.conditions = conditions;
    }
    public String withString(String string, String input) {
        String output = "";
        Boolean flag = false;
        if(conditions.checkForLimit(input)) {
            for(int i=0; i<input.length();i++) {
                if(conditions.charInRequiredSequence(input.charAt(i))!=-1) {
                    if(!flag)
                    output += string;
                    flag = true;
                }
                else {
                    flag = false;
                    output += input.charAt(i);
                }
            }
        }
        return output;
    }

}