package easy;

//https://leetcode.com/problems/can-place-flowers/description/
public class CanPlaceFlower {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {


        int count = 0;
        for (int i=0;i<flowerbed.length; i++)
        {
            if(flowerbed[i] == 0) {

                if( (i==0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                    flowerbed[i] = 1;

                    count++;


                }
                if(count >=n) return true;
            }

        }

        return false;
    }

    public static void main(String args[]){
        int [] flowerBed = {0,0,1,0,0};
       boolean b =  canPlaceFlowers(flowerBed, 1);
       System.out.println(b);
    }
}
