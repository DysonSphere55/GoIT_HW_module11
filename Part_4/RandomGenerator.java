package Part_4;

public class RandomGenerator {

    private long a;
    private long c;
    private long m;
    private long x;
    private int n = 1;

    public RandomGenerator(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public RandomGenerator x (long x) {
        this.x = x;
        return this;
    }

    public long next() {
        long result = (a * x * n + c) % m;
        x = result;
        n++;
        return result;
    }

}
