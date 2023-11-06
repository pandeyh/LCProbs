package medium;

//https://leetcode.com/problems/car-pooling/description/
public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {

        int[] events = new int[1001];

        //populate events
        for(int[] trip: trips){
            events[trip[1]] += trip[0]; //pickup
            events[trip[2]] -= trip[0]; // dropoff
        }

        int currentCap = 0;

        for(int i=0; i< events.length; i++){
            currentCap += events[i];
            if(currentCap > capacity){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CarPooling carPool = new CarPooling();
        int[][] trips1 = {{2, 1, 5}, {3, 3, 7}};
        int capacity1 = 4;
        System.out.println(carPool.carPooling(trips1, capacity1)); // Output: false

        int[][] trips2 = {{2, 1, 5}, {3, 3, 7}};
        int capacity2 = 5;
        System.out.println(carPool.carPooling(trips2, capacity2)); // Output: true
    }
}
