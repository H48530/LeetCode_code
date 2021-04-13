package Day0413;

import java.util.Arrays;

/**
 *
 */
class Car {
    int position;
    double time;

    Car(int p, double t) {
        position = p;
        time = t;
    }
}

//封装成对象（距离终点路程  和  时间 ），然后进行排序（通过距离终点远近）
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        Car[] cars = new Car[N];
        for (int i = 0; i < N; ++i)
            cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
        Arrays.sort(cars, (a, b) -> Integer.compare(a.position, b.position));
        int ans = 0, t = N;
        while (--t > 0) {
            if (cars[t].time < cars[t - 1].time) ans++; //if cars[t] arrives sooner, it can't be caught
            else cars[t - 1] = cars[t]; //else, cars[t-1] arrives at same time as cars[t]
        }

        return ans + (t == 0 ? 1 : 0); //lone car is fleet (if it exists)
    }
}

public class 车队 {
}
