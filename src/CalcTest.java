import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = input.nextInt();
        if (firstNumber > secondNumber) {
            int sum = firstNumber + secondNumber;
            System.out.println("Pierwsza liczba większa od drugiej:"+ sum);
        } else if (firstNumber < secondNumber) {
            int sum = firstNumber + secondNumber;
            System.out.println("PIerwsza liczba mniejsza od drugiej:" + sum);
        } else if (firstNumber == secondNumber) {
            int sum = (firstNumber + secondNumber) * 2;
            System.out.println("Liczby są równe i podniesione do kwadratu:" + sum);
        }
    }
}