package lsn.solutions.three;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many connections?");
        int connectionsCount = scan.nextInt();
        System.out.println("Provide vertices connections:");
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < connectionsCount; i++) {
            list.add(new Pair(scan.nextInt(), scan.nextInt()));
        }
        scan.close();

        int separateGraphCount = connectionsCount;
        Set<Integer> set = new HashSet<>();

        for (Pair pair : list) {
            if (set.contains(pair.getLeft()) || set.contains(pair.getRight())) {
                separateGraphCount--;
            }
            set.add(pair.getLeft());
            set.add(pair.getRight());
        }

        System.out.println(separateGraphCount);
    }
}
