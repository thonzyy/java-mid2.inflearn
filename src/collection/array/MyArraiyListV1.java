package collection.array;

import java.util.Arrays;

public class MyArraiyListV1
{
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArraiyListV1()
    {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArraiyListV1(int initialCapacity)
    {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o)
    {
        elementData[size] = o;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object o)
    {
        Object oldValue = get(index);
        elementData[index] = o;
        return oldValue;
    }

    public int indexOf(Object o )
    {
        for (int i = 0; i < size; i++)
        {
            if(o.equals(elementData[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                 " size="+size+", capacity="+elementData.length;
    }
}
