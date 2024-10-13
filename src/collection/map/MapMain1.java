package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1
{
    public static void main(String[] args)
    {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);
        studentMap.put("studentD", 60);
        System.out.println(studentMap); //해쉬 맵 순서 보장

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentB");
        System.out.println("Result: " + result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();

        for (String key : keySet)
        {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key+", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) //map 안에 중첩클래스 엔트리 -> 키와 밸류를 저장하는 객체
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key+", value = " + value);
        }


        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();//중복이 될 수 있기 때문에 컬렉션으로 , 순서 보장 x List x

        for (Integer value : values)
            System.out.println("value = " + value);

    }
}
