package DAY1_10_1_22.Practice;

public class ReverseString {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append("String");
        sb1.append("String1");
        sb.reverse();
        sb.toString();
        System.out.println(sb);
        sb.compareTo(sb1);
        System.out.println(sb.compareTo(sb1));

    }
}
