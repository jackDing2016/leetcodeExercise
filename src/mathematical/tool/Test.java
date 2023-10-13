package mathematical.tool;

import java.util.Arrays;

public class Test {

    public double cal1(double a) {
        return Math.round(1 / (1 - a) * 100000d) / 100000d;
    }

    public void cal2(double... a) {
        Arrays.stream(a).forEach(x -> {
            System.out.println(cal1(x));
        });
    }

    public static void main(String[] args) {
        new Test().cal2(1.5, 1.9, 1.99, 1.999, 2.5, 2.1, 2.01, 2.001);
    }

}
