import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The dial starts by pointing at 50.
// The dial is rotated L68 to point at 82; during this rotation, it points at 0 once.
// The dial is rotated L30 to point at 52.
// The dial is rotated R48 to point at 0.
// The dial is rotated L5 to point at 95.
// The dial is rotated R60 to point at 55; during this rotation, it points at 0 once.
// The dial is rotated L55 to point at 0.
// The dial is rotated L1 to point at 99.
// The dial is rotated L99 to point at 0.
// The dial is rotated R14 to point at 14.
// The dial is rotated L82 to point at 32; during this rotation, it points at 0 once.


public class advent_1{
     int max=100, start_value=50;
    private static int find_password(String[] input, int val){
       int start_value=val, count=0;
        for(int i=0;i<input.length;i++){
            String value=input[i];
            int digit=Integer.parseInt(value.substring(1, value.length()));
            char direction=value.charAt(0);
            for(int d=1;d<=digit;d++){
            if(direction=='L'){
                start_value=((start_value-1+100)%100);
                if(start_value==0) count++;

            
            }
            else{
               start_value=(start_value+1)%100; 
               if(start_value==0)count++;
             
            }
            
        }

        }
    return count;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("paste input");
List<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break; // stop if empty line (optional)
            list.add(line);
        }

        // Convert to array
    String[] moves = list.toArray(new String[0]);
    int res=find_password(moves, 50);
    System.out.println( res);
}
}