package PageObjectTest.ReusableLibrary.Practice;

import java.util.ArrayList;

public class CallingClassInClass {
    public static void main(String[] args) {


        creatingMethod a = new creatingMethod();
        String cat = creatingMethod.iAmCat();
        System.out.println(cat);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);

        for(int i = 0; i<b.size(); i++){
            System.out.println(b.get(i));
        }

    }
}
