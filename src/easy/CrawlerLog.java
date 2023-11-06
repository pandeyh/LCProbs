package easy;

//https://leetcode.com/problems/crawler-log-folder/description/
public class CrawlerLog {

    public int minOperations(String[] logs) {

        int level=0;

        for ( String command: logs){

            if(command.contains("../") && level != 0) { // move one dir up
                level--;
            }
            else if(!command.contains("./")) {
                level++; // go level down
            }

        }

        return level;

    }
}
