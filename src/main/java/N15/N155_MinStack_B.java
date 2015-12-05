package N15;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top,
 * and retrieving the minimum element in constant time.
 * <p/>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class N155_MinStack_B {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public N155_MinStack_B() {
        min.add(Integer.MAX_VALUE);
    }
    public void push(int x) {
        data.add(x);
        if (x < min.peek()) {
            min.add(x);
        } else {
            min.add(min.peek());
        }
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
