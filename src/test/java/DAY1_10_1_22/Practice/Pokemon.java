package DAY1_10_1_22.Practice;

public class Pokemon {
    String name;
    int level;

    String char1;
    int level1;

    Pokemon(){
        level = 1;

    }

    Pokemon(String name, int level){
        this.name = name;
        this.level = level;

    }




    void attack(){
        System.out.println(name + " attack");



    }
}
