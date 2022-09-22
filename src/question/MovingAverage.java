package question;

public class MovingAverage {

    private double sum;
    private int currentIndex = 0;

    private int size;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        return ( sum + val ) / (currentIndex++);
    }

}
