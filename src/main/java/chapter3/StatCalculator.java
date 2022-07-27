package chapter3;

import java.text.DecimalFormat;

public class StatCalculator {

    public int minimumValue(int[] numArray){
        int value = numArray[0];
        for(int i = 0; i < numArray.length; i++ ) {
            if (numArray[i] < value) {
                value = numArray[i];
            }
        }
        return value;
    }

    public int maximumValue(int[] numArray) {
        int maxValue = numArray[0];
        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] > maxValue) {
                maxValue = numArray[i];
            }
        }
        return maxValue;
    }

    public int numElement(int[] numArray) {
        int count = 0;

        for (int i = 0; i < numArray.length; i++) {
            count++;
        }
        return count;
    }

    public String numAverage(int[] numArray) {
        int count = 0;
        double sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
            count++;
        }

        DecimalFormat df = new DecimalFormat("###.######");
        return df.format(sum/count);

    }

}
