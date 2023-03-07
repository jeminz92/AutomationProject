package DAY2_10_2_22;

public class T3_WhileLoop_Linear_Array {
    public static void main(String[] args) {
        //declare and define linear array for street number
        int[] streetNumber = new int[]{111,333,444,555,666,777};
        //iterate through all street number by while loop
        //set the initializer
        int i = 0;
        //now set the condition for while loop
        //linear array gets the count by using .length command
        //while(i < streetNumber.length){
           // System.out.println("Street Number: " + streetNumber[i]);
           // i++;

            String[] cities = new String[]{"one","two","three"};

            while(i< cities.length){
                //count i
                System.out.println("i is now: " + i);
                System.out.println("Street Number: " + cities[i]);
                //incrementation goes at the end of the while loop
                //print the length of the array

                System.out.println(cities[i]);

                i++;

            //incrementation goes at the end of the while loop

        }//end of while loop


    }//end of main
}//end of java class
