package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1
{
    static final int DEFALUT_INTIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFALUT_INTIAL_CAPACITY;

    public MyHashSetV1()
    {
        initBuckets();
    }

    public MyHashSetV1(int capacity)
    {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets()
    {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++)
            buckets[i] = new LinkedList<>();
    }

    public boolean add(int value)
    {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value))
            return false;
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue)
    {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value)
    {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//Integer 타입으로 바꾼다. int는 해당 index 를 지운다.
        if (result)
            size--;

        return result;

    }


    private int hashIndex(int value)
    {
        return value % capacity;
    }

    public int getSize()
    {
        return size;
    }

    @Override
    public String toString()
    {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}