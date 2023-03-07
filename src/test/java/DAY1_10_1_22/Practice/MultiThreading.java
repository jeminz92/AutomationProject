package DAY1_10_1_22.Practice;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            MultiThreadThing myThing = new MultiThreadThing(i);

            Thread myThread = new Thread(myThing);
            myThread.start();
            myThread.join();
            boolean s1 = myThread.isAlive();
            System.out.println(s1);



        }//end of loop


    }
}
