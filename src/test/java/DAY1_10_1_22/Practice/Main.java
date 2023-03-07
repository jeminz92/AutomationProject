package DAY1_10_1_22.Practice;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //classname var = new classname()
        Pokemon p4 = new Pokemon("Zapdos",110);
        Pokemon p1 = new Pokemon("Charizard",100);
        Pokemon p2 = new Pokemon("Blastoise",100);
        Pokemon p3 = new Pokemon("Turtoise", 100);
        /*p1.name = "Pikachu";
        p1.level = 10; */


        System.out.println(p1.level + p1.name);
        System.out.println(p1.level);
        p1.attack();
        System.out.println(p2.level);

        Enemy.TalkCall("Test",1);
        Enemy.talk();
        Enemy.callTalk();




        Enemy enemy = new Enemy();


        Thread.sleep(4000);
        System.exit(0);

    }
}
