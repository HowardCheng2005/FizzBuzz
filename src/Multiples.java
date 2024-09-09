public class Multiples {
    public static void main(String[] args) {
        int multiplesOfFive = 0;
        int multiplesOfThree = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 5 == 0){
                multiplesOfFive++;
            } else if (i % 3 == 0){
                multiplesOfThree++;
            }
        }
        System.out.println("there are " + multiplesOfFive + " multiples of five");
        System.out.println("there are " + multiplesOfThree + " multiples of three");
    }
}
