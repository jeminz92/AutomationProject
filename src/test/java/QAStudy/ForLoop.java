package QAStudy;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        //we're going to do a for loop, but first we need something to loop over
        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("mercedes");
        cars.add("honda");
        cars.add("mitsubishi");
        cars.add("R-34");

        /*while loop syntax, you would have to set the int i = 0 outside the method, and the i++ inside the
        constructor } }  of the while loop method, if you were looping a String[] linear array you would use
        cars.length() instead of size() */
        // the difference between for loop and while loop is, for loop you can loop it until it meets it condition
        /* example, you can put a print statement and say for(int i = 0; i < 100; i++) this would loop 100 times until
        i is not less than 100 */
        // while loop you just loop until you go through the whole arrayList
        int i = 0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }//end of for loop
    }//end of main
}//end of class
