package DAY1_10_1_22.Practice;

public class Dog {
    static String _name;
    static int _age;

    public static void main(String[] args) {
        Enemy.callTalk();
        Enemy.talk();
        Dog.getName();
        Dog.getPersonYears();


    }

    public Dog(String name, int age) {
        _name = name;
        _age = age;

    }

    Enemy enemy = new Enemy();




    public static String getName() {
        return _name;
    }

    public static int getAge() {
        return _age;
    }

    public static int getPersonYears() {
        return getAge() * 7;
    }

    public String toString()
    {
        return "The name of the dog is " + getName() + "\nThe dog's age in person years is " + getPersonYears();

    }

    public static int NUMBER_OF_MONTHS_IN_A_YEAR = 8;


    public boolean equals(Object obj) {
        return (this == obj);
    }
    }



