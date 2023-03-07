package DAY1_10_1_22.Practice;

import java.util.Scanner;

public class Kennel {
    public static void main(String[] args) {
        String name;
        int age = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the dog's name and age : ");
        name = scan.next();
        age = scan.nextInt();

        scan.close();

        Dog dog = new Dog(name,age);
        Dog dog1 = new Dog("pav",11);
        Dog dog2 = new Dog("booger",4);
        Dog dog3 = new Dog("doober",5);
        Dog dog4 = new Dog("howzer",2);
        Dog dog5 = new Dog("beast",11);



        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}
