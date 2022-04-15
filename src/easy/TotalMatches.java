package easy;

// lC = https://leetcode.com/problems/count-of-matches-in-tournament/

public class TotalMatches {

    public static int numberOfMatches(int n) {


        int matches = 0;
        int teamsAdv=n;
        int totMatches = 0;

        while(teamsAdv >0){

            if(teamsAdv%2 == 0)
            {

                matches = (teamsAdv)/2;
                teamsAdv = (teamsAdv)/2 ;
            }
            else{

                matches = (teamsAdv-1)/2;
                teamsAdv = (teamsAdv-1)/2 + 1;

            }
            totMatches += matches;

            if (teamsAdv ==1)
                break;
        }

        return totMatches;

    }

    public static void main(String args[]){
        System.out.print(numberOfMatches(7));
        
    }
}
