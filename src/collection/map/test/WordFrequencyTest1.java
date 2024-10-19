package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1
{
    public static void main(String[] args)
    {
        String text = "orange banana apple apple banana apple";

        //코드 작성
        Map<String, Integer> map = new HashMap<>();
        String[] fruits = text.split(" ");

        for (String fruit : fruits)
        {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
            /*Integer count = map.get(fruit);
            if (count == null)
            {
                count = 0;
            }
            map.put(fruit, ++count);*/
        }


        System.out.println(map);

    }
}
