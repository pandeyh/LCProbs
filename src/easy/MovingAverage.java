package easy;


import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/moving-average-from-data-stream/description/
class MovingAverage {

    int size = 0;
    int  count = 0;
    Queue<Integer> nums;
    int sum ;
    public MovingAverage(int size) {
        this.size = size;
        nums = new ArrayDeque<>();
        sum = 0;
    }

    public double next(int val) {


        if(nums.size() == size)
        {
            sum -= nums.poll();
        }
        nums.add(val);
        int count = nums.size();
        sum += val;

        double avg = (double)sum/count;
        return  avg;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
