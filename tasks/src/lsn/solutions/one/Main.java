package lsn.solutions.one;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide list");
        String inputList = scan.nextLine();
        scan.close();
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(inputList.split(" "))
                .toList()
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Set<Integer> set = new TreeSet<>(list);

        printSet(set);
        System.out.println("count: " + list.size());
        System.out.println("distinct: " + set.size());
        System.out.println("min: " + set.toArray()[0]);
        System.out.println("max: " + set.toArray()[set.size() - 1]);

    }

    private static void printSet(Set<Integer> set) {
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
