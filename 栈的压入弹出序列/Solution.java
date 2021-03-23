package 栈的压入弹出序列;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 */
class Solution {
    private List<Integer> intlist(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int e : arr) {
            list.add(e);
        }
        return list;
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        List<Integer> pushedList = intlist(pushA);
        List<Integer> poppedList = intlist(popA);
        Stack<Integer> stack = new Stack<>();
        for (int e : poppedList) {
            if (!stack.isEmpty() && stack.peek() == e) {
                stack.pop();
                continue;
            }
            while (true) {
                if (pushedList.isEmpty()) {
                    return false;
                }
                int f = pushedList.remove(0);
                if (f == e) {
                    break;
                }
                stack.push(f);
            }

        }
        return stack.isEmpty();
    }


//    private List<Integer> intList(int[] arr) {
//        List<Integer> linkedList = new ArrayList<>();
//        for (int e : arr) {
//            linkedList.add(e);
//        }
//        return linkedList;
//    }
//
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        List<Integer> pushedList = intList(pushed);
//        List<Integer> popedList = intList(popped);
//        Stack<Integer> stack = new Stack<>();
//
//        for (int e : popedList) {
//            if (!stack.isEmpty() && stack.peek() == e) {
//                stack.pop();
//                continue;
//            }
//            while (true) {
//                if (pushedList.isEmpty()) {
//                    return false;
//                }0
//                int f = pushedList.remove(0);
//                if (f == e) {
//                    break;
//                }
//
//                stack.push(f);
//            }
//        }
//        return stack.isEmpty();
//    }
}