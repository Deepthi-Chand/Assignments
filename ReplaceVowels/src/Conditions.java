public class Conditions {

    private float limit;
    private String sequence;

    Conditions(float limit, String sequence) {
        this.limit = limit;
        this.sequence = sequence;
    }
    public boolean checkForLimit(String input) {
        float count = 0 ;
        for (int i = 0; i < input.length(); i++)
            if (charInRequiredSequence(input.toLowerCase().charAt(i)) != -1) {
                count++;
            }
        return (count/input.length()) > limit;
    }

    public int charInRequiredSequence(char givenChar) {
        return sequence.indexOf(givenChar);
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}