package day14;

import java.util.*;

/**
 *公交路线      https://leetcode-cn.com/problems/bus-routes/
 * 给你一个数组 routes ，表示一系列公交线路，其中每个 routes[i] 表示一条公交线路，第 i 辆公交车将会在上面循环行驶。
 * 例如，路线 routes[0] = [1, 5, 7] 表示第 0 辆公交车会一直按序列 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... 这样的车站路线行驶。
 * 现在从 source 车站出发（初始时不在公交车上），要前往 target 车站。 期间仅可乘坐公交车。
 * 求出 最少乘坐的公交车数量 。如果不可能到达终点车站，返回 -1 。
 * 示例 1：
 * 输入：routes = [[1,2,7],[3,6,7]], source = 1, target = 6
 * 输出：2
 * 解释：最优策略是先乘坐第一辆公交车到达车站 7 , 然后换乘第二辆公交车到车站 6 。
 * 示例 2：
 * 输入：routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
 * 输出：-1
 */

class Solution1 {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        Map<Integer , List<Integer>> map = new HashMap<>();
        Map<Integer , Boolean> vis = new HashMap<>();
        boolean visline[] = new boolean[routes.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<routes.length;i++){
            for(int r:routes[i]){
                if(!map.containsKey(r)) map.put(r,new ArrayList<>());
                map.get(r).add(i);
                vis.put(r,false);
            }
        }

        q.add(S);
        vis.put(S,true);
        int res = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int cur = q.poll();
                if(cur==T) return res;
                for(int j:map.get(cur)){
                    if(!visline[j]){
                        visline[j] = true;
                        for(int next:routes[j]){
                            if(!vis.get(next)){
                                vis.put(next , true);
                                q.add(next);
                            }
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
public class 公交路线 {
}
