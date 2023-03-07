package QAStudy;

public class ConditionalStatements {
    public static void main(String[] args) {
        //setting variables
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;

        // so here we used if, the lines of code inside the bracket will execute only if what is inside IF() reads TRUE

        if (a > b) {
            System.out.println("This is false");
        }
        if (b > c) {
            System.out.println("This is false");
        }
        if (c > b) {
            System.out.println("This is true");
        } else {
            System.out.println("This is the end of conditional statements");
        }//end of else
    }//end of main
}//end of class
