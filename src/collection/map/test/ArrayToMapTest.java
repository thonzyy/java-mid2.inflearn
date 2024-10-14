package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest
{
    public static void main(String[] args)
    {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        //Map<String, String> map = new HashMap<>();
        Map<String, Integer> product = new HashMap<>();
        // 주어진 배열로부터 Map 생성 - 코드 작성
        for (String[] strings : productArr)
            product.put(strings[0], Integer.valueOf(strings[1]));

        // Map의모든데이터출력 -코드작성
        for (Map.Entry<String, Integer> stringStringEntry : product.entrySet())
            System.out.println("제품: " + stringStringEntry.getKey() + " 가격: " + stringStringEntry.getValue());

    }
}
