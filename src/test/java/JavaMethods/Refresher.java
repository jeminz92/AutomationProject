package JavaMethods;

import Reusable_Library.Reusable_Annotations;

import java.util.ArrayList;

public class Refresher extends Reusable_Annotations {
    public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList<>();
       cars.add("mitzubishi");
       cars.add("honda");
       cars.add("mercedez");

       for (int i = 0; i < cars.size(); i++) {
           if (cars.get(i) == "mitzubishi" || cars.get(i) == "mercedez" || cars.get(i) == "honda") {
               System.out.println(cars.get(i));
           }
       }
           //print smallest number
           int a,b,c;
           a=100;
           b=200;
           c=30;
           if (a<b && a<c){
               System.out.println("this is the smallest number");
           } else if (b<c && c<a) {
               System.out.println("this is the smallest number 123");
           }else System.out.println("Print this");

           }

       }


