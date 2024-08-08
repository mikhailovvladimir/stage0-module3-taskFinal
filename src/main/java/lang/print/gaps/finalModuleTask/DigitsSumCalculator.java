package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int numberOne = number / 1000;
        int numberTwo = (number % 1000) / 100;
        int numberThree = ((number % 1000) % 100) / 10;
        int numberFour = (number % 100) % 10;
        System.out.println(numberOne + numberTwo + numberThree + numberFour);
    }
}
