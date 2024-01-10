package Part_3;

import java.sql.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartThree {

    public static void main(String[] args) {
        List<String> someList = new ArrayList<>(
                Arrays.asList("1, 2, 0", "4, 5"));

        String result = someList.stream()
                .map(x -> x.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
