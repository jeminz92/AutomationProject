package DAY1_10_1_22.Practice;

import java.util.ArrayList;
import java.util.*;

public class encode {
    public static void main(String[] args) {
        System.out.println(encode("Hello",3));
        System.out.println(decode("Hoell",3));
    }


        static String encode(String s, int n) {
            String finalStr = "";
            if (s.length() == 0) {
                return "";
            }
            ArrayList<ArrayList<String>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new ArrayList<>());
            }

            int inc = 1;
            int count = 0;
            for (int i = 0; i < n; i += inc) {
                if (count == s.length()) {
                    break;
                }
                if (i == n-1) {
                    inc = -1;
                }
                if (i == 0) {
                    inc = 1;
                }
                list.get(i).add(s.substring(count, count+1));

                count++;
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    finalStr += list.get(i).get(j);
                }
            }

            return finalStr;
        }

        static String decode(String s, int n) {
            String finalStr = "";
            if (s.length() == 0) {
                return "";
            }

            ArrayList<ArrayList<String>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new ArrayList<>());
            }

            int inc = 1;
            int count = 0;
            for (int i = 0; i < n; i += inc) {
                if (count == s.length()) {
                    break;
                }
                if (i == n-1) {
                    inc = -1;
                }
                if (i == 0) {
                    inc = 1;
                }
                list.get(i).add("x");

                count++;
            }

            count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (count == s.length()) {
                    break;
                }
                for (int j = 0; j < list.get(i).size(); j++) {
                    if (count == s.length()) {
                        break;
                    }
                    list.get(i).set(j, s.substring(count,count+1));
                    count++;
                }
            }

            inc = 1;
            count = 0;
            for (int i = 0; i < n; i += inc) {
                if (count == s.length()) {
                    break;
                }
                if (i == n-1) {
                    inc = -1;
                }
                if (i == 0) {
                    inc = 1;
                }
                finalStr += list.get(i).get(0);
                list.get(i).remove(0);

                count++;
            }



            return finalStr;
        }
    }

