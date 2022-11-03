package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int num = 0;
        if (num>=0){
            while (num<=power){
                System.out.println(Math.pow(2, num));
                num++;
            }
        }
        else System.out.println("too much power");

    }
}
