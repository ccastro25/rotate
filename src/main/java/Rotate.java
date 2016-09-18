import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by castro on 9/17/16.
 */
public class Rotate extends ArrayList {


    public static void main(String[] args) {

        Scanner sccaner = new Scanner(System.in);


        System.out.println("Enter the amount of time you would like the array to shift");
        int userinput = sccaner.nextInt();

        Rotate rotat = new Rotate();
        Integer number = null;

        for (int i = 1; i < userinput+5; i++) {
            rotat.add(i);
        }

        Collections.addAll(rotat);
        Collections.rotate(rotat,3);



        System.out.println(rotat);
    }

}







