package Part_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PartFifth {

    public static void main(String[] args) {
        Stream<String> streamFirst = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        Stream<String> streamSecond = Stream.of("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        Stream<String> result = zip(streamFirst, streamSecond);

        result.peek(System.out::println).toList();
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result.add(iteratorFirst.next());
            result.add(iteratorSecond.next());
        }
        return result.stream();
    }
}
