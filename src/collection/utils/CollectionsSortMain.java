package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("Shuffle list = " + list);//랜덤
        Collections.sort(list);
        System.out.println("Sorted list = " + list);
        Collections.reverse(list);
        System.out.println("Reverse list = " + list);
    }
}
