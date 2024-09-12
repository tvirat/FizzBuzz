public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int numberOfSteps = 0;
        while (number != 0){
            if (number % 2 == 0){
                number = number / 2;
            }
            else {
                number = number - 1;
            }
            numberOfSteps = numberOfSteps + 1;
        }
        System.out.println(numberOfSteps);
    }
}
