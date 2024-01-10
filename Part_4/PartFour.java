package Part_4;

import java.util.stream.Stream;

public class PartFour {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator(25214903917L, 11, (long)Math.pow(2, 48));

        Stream<Long> stream = Stream.iterate(5L, (seed) -> randomGenerator.x(seed).next());

        stream.limit(10).forEach(System.out::println);
    }
}
