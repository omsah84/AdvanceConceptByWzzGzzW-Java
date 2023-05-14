//stack implementation form scratch..
//using linklist.

public class StackClass {

    //new node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //stack implementation
    static class Stack {

        static Node head;

        //isempty function
        public static boolean isEmpty() {
            return head == null;
        }

        //add function
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            return;
        }

        //remove function
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty..");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;

        }

        //peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty..");
                return -1;
            }

            return head.data;

        }

    }
    
    //main diver code
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        // traversing 
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
            
        }

    }
}