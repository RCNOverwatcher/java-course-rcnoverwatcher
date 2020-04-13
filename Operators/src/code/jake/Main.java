package code.jake;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = true;
        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("Phew");
        }
        else if (isAlien) {
            System.out.print("It is an alien.");
            System.out.println("Im scared");

        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }
        int secondTopScore = 79;
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true. ");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is bad");

        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        }
    }
}
