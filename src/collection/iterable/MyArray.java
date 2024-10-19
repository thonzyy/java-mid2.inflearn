package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>
{
    private int[] numbers;

    public MyArray(int[] numbers)
    {
        this.numbers = numbers;
    }

    @Override //반복 가능하다, 반복자를 반환
    public Iterator<Integer> iterator()
    {
        return new MyArrayIterator(numbers);
    }
}
