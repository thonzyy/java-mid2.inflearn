package collection.utils;

import java.util.*;

public class EmptyListMain
{
    public static void main(String[] args)
    {
        //빈 가변 리스트
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트
        List<Integer> list3 = Collections.emptyList();//자바 5
        List<Integer> list4 = List.of();//자바 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr ={1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);//배열의 참조값을 사용, 매우 큰 배열을 쓸 때 효과적일 수 있음
        List<Integer> arr1 = List.of(arr);//새로 리스트를 생성

    }
}
