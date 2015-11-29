package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <p/>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Notes:
 * You must use only standard operations of a stack
 * which means only push to top, peek/pop from top, size,
 * and is empty operations are valid.
 * Depending on your language, stack may not be supported natively.
 * You may simulate a stack by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a stack.
 * You may assume that all operations are valid
 * (for example, no pop or peek operations will be called on an empty queue).
 */
public class N232_ImplementQueueUsingStacks_B {
    Stack<Integer> out = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> in = new Stack<>();
        while (!out.isEmpty()) {
            in.add(out.pop());
        }
        out.add(x);
        while (!in.isEmpty()) {
            out.add(in.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        out.pop();
    }

    // Get the front element.
    public int peek() {
        return out.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return out.isEmpty();
    }
}
