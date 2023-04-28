import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lab07_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));

        // reduce z jednym argumentem
        Stream<ArrayList<Integer>> streamOfLists = Stream.of(list1, list2, list3);
        List<Integer> combinedList2 = streamOfLists
                .reduce((l1, l2) -> {
                    ArrayList<Integer> newList = new ArrayList<>(l1);
                    newList.addAll(l2);
                    return newList;
                })
                .orElse(new ArrayList<>());
        System.out.println("Połączone listy (reduce z jednym argumentem): " + combinedList2);

        // reduce z dwoma argumentami
        List<Integer> combinedList1 = Stream.of(list1, list2, list3)
                .reduce(new ArrayList<>(), (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        System.out.println("Połączone listy (reduce z dwoma argumentami): " + combinedList1);

        // reduce z trzema argumentami
        Stream<ArrayList<Integer>> streamOfLists2 = Stream.of(list1, list2, list3);
        ArrayList<Integer> identity = new ArrayList<>();
        List<Integer> combinedList3 = streamOfLists2
                .reduce(identity,
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        },
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        });
        System.out.println("Połączone listy (reduce z trzema argumentami): " + combinedList3);
    }
}
