package DAY1_10_1_22.Practice;

public class MultiThreadThing implements Runnable{

    private final int ThreadNumber;

    public MultiThreadThing(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;

    }
    @Override
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println(i + " from thread " + ThreadNumber);
            if(ThreadNumber == 3){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Void");
            }
        }


    }

}
