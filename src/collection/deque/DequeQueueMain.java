package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeQueueMain
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        //꺼내지 않고 단순 조회만
        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("poll() = " + deque.poll());
        System.out.println("poll() = " + deque.poll());
        System.out.println("poll() = " + deque.poll());
        System.out.println(deque);

    }
}
