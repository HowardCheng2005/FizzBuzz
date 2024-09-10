public class Reduce {
    public static int main(String[] args) {

        int i = 100;
        int stepsToZero = 0;

        while (i != 0){
            stepsToZero++;
            if (i % 2 == 0){
                i /= 2;
            } else {
                i -= 1;
            }
        }
        System.out.println("there are " + stepsToZero + " steps to zero");
        return stepsToZero;
    }
}
