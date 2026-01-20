public class Solution {
    private Node head;

    public Solution() {

    }

    public void push(int val) {
        /**
         * If this is the very first value in the stack?
         */
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            /**
             * min is always the lesser of current val and the min present in the next
             * pointer node in the stack
             * 
             * here , the next pointer node in the stack is head
             * 
             * NOTE: Whenever a new pointer is added to the stack, the next pointer node in
             * the stack is always updated.
             */
            head = new Node(val, Math.min(val, head.min), head);
        }

    }

    public void pop() {
        /**
         * pointer node is updated to the next one in the stack
         */
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;

    }

    private class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */