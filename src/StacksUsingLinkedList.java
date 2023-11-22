import static java.lang.System.exit;
class stackimplementation {
        private class Node {
            int data;
            Node link;
        }

        Node top;

    stackimplementation()
        {
            this.top = null;
        }

        public void push(int x) {
            Node temp = new Node();
            if (temp == null) {
                System.out.println("Heep OverFlow");
                return;
            }
            temp.data = x;
            temp.link = top;
            top = temp;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            if (!isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        public void pop() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return;
            }
            top = (top).link;
        }

        public void display() {
            if (top == null) {
                System.out.println("Stack Underflow");
                exit(1);
            } else {
                Node temp = top;
                while (temp != null) {
                    System.out.printf("%d->", temp.data);
                    temp = temp.link;
                }
            }
        }
    }
 public class StacksUsingLinkedList {
    public static void main(String args[]){
        stackimplementation stk = new stackimplementation();
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);

        stk.display();

        System.out.printf("\nTop element is %d\n", stk.peek());
        System.out.println("Stack after popping 2 times");
        stk.pop();
        stk.pop();

        stk.display();

        System.out.printf("\nTop element is %d\n", stk.peek());

    }
}
