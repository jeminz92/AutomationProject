package DAY1_10_1_22.Practice;

public class Enemy {
    public static void main(String[] args) {
    talk();
    callTalk();
    TalkCall("jemin",201);

    }
     static void talk(){
        System.out.println("Hey");
        System.out.println("No");
    }//end of method

    public static void callTalk(){
        System.out.println("calling talk");
    }
    static void TalkCall(String name, int number){
        System.out.println(name + " " + number);
    }

}//end of class


