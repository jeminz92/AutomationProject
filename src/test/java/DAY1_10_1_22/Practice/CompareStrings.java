package DAY1_10_1_22.Practice;

public class CompareStrings {
    public static void main(String[] args) {

            // when comparing String objects you need to compare using a StringMethod instead
        // == because it will return false with ==
        String a = "lemur";
        String b = "lemur";

        if(a.equals(b)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
