package Part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PartTwo {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(
                Arrays.asList("Ivan", "Petro", "Mykola", "Taras", "Andriy", "Stepan",
                        "Vasya", "Igor", "Maxim", "Dmytro", "Bohdan", "Volodymyr"));


        List<String> result = namesList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .toList();

    }
}
