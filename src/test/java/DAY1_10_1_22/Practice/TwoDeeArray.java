package DAY1_10_1_22.Practice;

public class TwoDeeArray {
    public static void main(String[] args) {


        // 2D array = an array of arrays

        String[][] cars = {{"bmw", "mercedes", "honda"}, {"mitzubishi","accord","mazda"},{"mclaren","ferrari","buggati"}};

        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for (int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }


        }
    }






