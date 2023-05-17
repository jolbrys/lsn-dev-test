package lsn.solutions.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
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
                .sorted()
                .collect(Collectors.toList());

        for (Integer element : list) {
            if (element < 7 && list.contains(13 - element)) {
                System.out.println(element + " " + (13 - element));
            }
        }
    }
}
