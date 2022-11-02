package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int nums = 0;
        if (multiplyByAndToInclusive > 0) {
            while (nums <= multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * nums);
                nums++;
            }
        }
        else{
            while (nums >= multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * (-nums));
                nums--;
        }
        }
    }
}