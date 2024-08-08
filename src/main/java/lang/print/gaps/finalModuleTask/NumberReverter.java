package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int numberThree = (number % 100) % 10;
        int numberTwo = (number % 100) / 10;
        int numberOne = number / 100;

        System.out.println("" + numberThree + numberTwo + numberOne);
    }
}
