package QAStudy;

public class ArrayList {
    public static void main(String[] args) {
        //declare and define an arrayList of countries
        java.util.ArrayList<String> countries = new java.util.ArrayList<>();
        //now add the values for countries array
        countries.add("USA");
        countries.add("Canada");
        countries.add("Bangladesh");
        countries.add("India");

        //print usa from the countries list
        //countries[0]   countries.get(0)
        System.out.println("Countries Value: " + countries.get(0));

        //call an integer array list for streetNumber
        java.util.ArrayList<Integer> streetNumber = new java.util.ArrayList<>();
        streetNumber.add(333);
        streetNumber.add(222);
        System.out.println("First Street Number: " + streetNumber.get(1));
        System.out.println(streetNumber.get(1));
    }//end of main
}//end of class
