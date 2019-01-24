public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        if(calc.number1 > calc.number2) {
            System.out.println(calc.sum1);
        } else {
            System.out.println(calc.sum2);
        }
        if(calc.number1 == calc.number2) {
            System.out.println("Wspólna potęga: " + calc.sum3 + "\n" + "Potęga liczby pierwszej: " + calc.sum4
            + "\n" + "Potęga liczby drugiej: " + calc.sum5);
        }
    }
}
