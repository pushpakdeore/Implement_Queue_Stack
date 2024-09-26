package p2ImplementStackQueue;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list;
    Queue(){
        list = new LinkedList<>();
    }
    public void equeue(int data){
        list.addLast(data);

    }
    public void dequeue(){
        list.removeFirst();

    }
    public Integer peek(){
        return  list.peekFirst();
    }
    public void display(){
        System.out.println(list);
    }
    public Integer poll(){
        return list.removeFirst();

    }

    public static void main(String[] args) {
        Queue q =new Queue();
        q.equeue(1);
        q.equeue(2);
        q.equeue(3);
        q.equeue(4);
        q.equeue(5);
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.poll());

        q.display();


    }
}