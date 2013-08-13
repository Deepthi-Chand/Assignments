import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortNumbersOnBinary {
    public List<Integer> sort(List<Integer> input) {
        int i;
        List<Integer> output = new ArrayList<Integer>();
        Integer[] inputArray=sortList(input);
        int[] binaryCounts=convert(inputArray);
        int[] sortedIndexes= sortIndexes(binaryCounts);
        for(i=0;i<input.size();i++){
            output.add(i, inputArray[sortedIndexes[i]]);
        }
        return output;
    }

    private Integer[] sortList(List<Integer> input) {
        Integer[] sortedInput = new Integer[input.size()];
        int i;
        for(i=0;i<input.size();i++)
            sortedInput[i]=input.get(i);
        Arrays.sort(sortedInput);
        return sortedInput;
    }

    private int[] sortIndexes(int[] binaryCounts) {
        int[] indexes = new int[binaryCounts.length];
        int i,j;
        for(i=0;i<binaryCounts.length;i++) {
            indexes[i] = i;
        }
        for (i = 0; i < binaryCounts.length-1; i++) {
            for (j = i + 1; j < binaryCounts.length; j++) {
                if (binaryCounts[i] > binaryCounts[j]) {
                    indexes=swap(indexes, i, j);
                }
            }
        }

        return indexes;
    }

    private int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    private int[] convert(Integer[] input) {
        int[] counts = new int[input.length];
        for(int index=0;index<input.length;index++) {
            counts[index]= getCount(input[index]);
        }
        return counts;
    }

    public int getCount(int number) {
        int count=0;
        while(number>0) {
            count++;
            number &=number-1;
        }
        return count;
    }
}