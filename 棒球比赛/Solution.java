package 棒球比赛;

import java.util.Stack;

/**
 * 682. 棒球比赛
 * 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
 * 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：
 * 整数 x - 表示本回合新获得分数 x
 * "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
 * "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * 请你返回记录中所有得分的总和。
 */
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (String s : ops) {
            switch (s) {
                case "+":
                    Integer p1 = stack2.pop();
                    Integer p2 = stack2.pop();
                    stack1.push(p1 + p2);
                    stack2.push(p2);
                    stack2.push(p1);
                    stack2.push(p1 + p2);
                    break;
                case "D":
                    Integer peek = stack2.peek();
                    stack1.push(peek * 2);
                    stack2.push(peek * 2);
                    break;
                case "C":
                    stack1.pop();
                    stack2.pop();
                    break;
                default:
                    stack1.push(Integer.parseInt(s));
                    stack2.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while (!stack1.isEmpty()) {
            sum += stack1.pop();
        }
        return sum;
    }
}