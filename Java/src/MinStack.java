import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;

    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {

        if(x <= min){
            this.stack.push(min);
            this.min = x;
        }
        this.stack.push(x);
    }

    public void pop() {

        if(stack.peek() == this.min){

           this.stack.pop();
           min =  this.stack.pop();
        } else {
           this.stack.pop();
        }

    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return min;
    }
}