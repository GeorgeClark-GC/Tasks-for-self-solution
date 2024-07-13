public class Main {
    public static void main(String[] args) {
        System.out.println("Course 1");
        System.out.println("Theme 1");
        System.out.println("Task 1");
        int numOne = 47;
        int numTwo = 13;
        int division = numOne/numTwo;
        int remainder = numOne%numTwo;
        System.out.println("Результат деления числа " + numOne + " на " + numTwo + ": " + division + " и " + remainder + " в остатке");
        System.out.println("Task 2");
        numOne = 36;
        int figureOne = numOne/10;
        int figureTwo = numOne - figureOne*10;
        int sum = figureOne + figureTwo;
        System.out.println("Результат сложения цифр первого и второго разрядов числа " + numOne + ": " + sum);
    }
}