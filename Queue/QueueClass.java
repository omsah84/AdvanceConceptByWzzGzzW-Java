package Queue;

import javax.management.Query;

public class QueueClass {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue {

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        public static int remove() {

            if (isEmpty()) {
                System.out.println("queue is empty..");
                return -1;
            }

            if (head == tail) {
                tail = null;
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }
        
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty..");
                return -1;
            }

            return head.data;
            
        }
    }

    public static void main(String[] args) {
        
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
