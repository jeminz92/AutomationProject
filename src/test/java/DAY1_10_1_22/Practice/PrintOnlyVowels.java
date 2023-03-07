package DAY1_10_1_22.Practice;

public class PrintOnlyVowels {
    public static void main(String[] args) {
        String incomprehensible = "Incomprehensible";
        String vowels = "";

        for (int i = 0; i < incomprehensible.length(); i++){
            char c = incomprehensible.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels += c;
            }
            System.out.println(vowels);
        }
        System.out.println(vowels);
    }
}
