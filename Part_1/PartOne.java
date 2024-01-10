package Part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PartOne {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(
                Arrays.asList("Ivan", "Petro", "Mykola", "Taras", "Andriy", "Stepan",
                        "Vasya", "Igor", "Maxim", "Dmytro", "Bohdan", "Volodymyr"));

        AtomicInteger count = new AtomicInteger(0);

        List<String> result = namesList.stream()
                .map(list -> namesList.get(count.getAndIncrement()))
                .map(name -> (count.get() - 1) + ". " + name)
                .filter(name -> (count.get() -1 ) % 2 != 0 )
                .peek(System.out::println)
                .toList();

    }
}
