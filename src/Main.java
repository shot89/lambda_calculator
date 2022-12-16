public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        calc.println.accept(calc.abs.apply(-100));

        /*Ошибка связана с отсутствием проверки деления на ноль в функции devide
         * Использовать тернарный оператор и переделывать саму ф-цию я не стал
         * потому что при передаче в качестве делителя нуля данная фунция должна
         * в любом случае возвращать int-овое значение, а это некорректно.
         * На мой взгляд оптимальное решение обернуть вызов этой фунции в try-catch*/
    }
}