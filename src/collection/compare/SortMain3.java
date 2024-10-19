package collection.compare;

import java.util.Arrays;

public class SortMain3
{
    public static void main(String[] args)
    {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",20);
        MyUser myUser3 = new MyUser("c",10);
        MyUser[] arr = {myUser1,myUser2,myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(arr));

        System.out.println("comparable 기본 정렬"); //자연 정렬은 컴패러블 있어야함.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //추가
        System.out.println("IdComparator 정렬"); // 컴패러블이 없을 때도 컴패레이터가 있으면 정렬이 됨.
        Arrays.sort(arr, new IdComparator());
        System.out.println(Arrays.toString(arr));
    }
}
