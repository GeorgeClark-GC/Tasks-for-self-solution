public class Main {
    public static void main(String[] args) {
        System.out.println("Course 1");
        System.out.println("Theme 1");
        System.out.println("Task 1");
        int numOne = 47;
        int numTwo = 13;
        int division = numOne / numTwo;
        int remainder = numOne % numTwo;
        System.out.println("Результат деления числа " + numOne + " на " + numTwo + ": " + division + " и " + remainder + " в остатке");
        System.out.println("Task 2");
        numOne = 44;
        int figureOne = numOne / 10;
        int figureTwo = numOne - figureOne * 10;
        int sum = figureOne + figureTwo;
        System.out.println("Результат сложения цифр первого и второго разрядов числа " + numOne + ": " + sum);
        System.out.println("Task 3");
        numOne = 345;
        figureOne = numOne / 100;
        figureTwo = (numOne - figureOne * 100) / 10;
        int figureThree = (numOne - figureOne * 100 - figureTwo * 10);
        sum = figureOne + figureTwo + figureThree;
        System.out.println("Результат сложения цифр первого, второго и третьего разрядов числа " + numOne + ": " + sum);
        System.out.println("Task 4");
        int costFlowers = 4899;
        int costPostcard = 157;
        int discount = 10;
        int sumDiscount = (costFlowers + costPostcard)/discount;
        int finalCost = costFlowers + costPostcard - sumDiscount;
        System.out.println("Суммарная стоимость сотставила " + finalCost + " рублей, с учётом скидки " + sumDiscount + " рублей.");
    }
}