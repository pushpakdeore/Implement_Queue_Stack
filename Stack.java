package p2ImplementStackQueue;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> list;
    Stack(){
        list =new LinkedList<>();
    }

    public void push(int data){
        list.addFirst(data);
    }
    public Integer pop(){
        if(list.isEmpty()){
            System.out.println("Stack is emply");
            return null;
        }
        return list.removeFirst();
    }
    public Integer peek(){
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.peekFirst();
    }
    public void disply(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        Stack s =new Stack();

        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.peek());


        s.disply();
        System.out.println(s.pop());

    }
}
