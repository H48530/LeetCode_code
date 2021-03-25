package 用队列实现栈;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的全部四种操作（push、top、pop 和 empty）。
 * <p>
 * 实现 MyStack 类：
 * <p>
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 */

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            Integer remove = queue.remove();
            queue.add(remove);
        }
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            Integer remove = queue.remove();
            queue.add(remove);
        }
        Integer ret = queue.remove();
        queue.add(ret);
        return ret;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.size() == 0;
    }
}

