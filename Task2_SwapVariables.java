// Использовал массив исключительно для передачи и возвращения новых переменных
public class Task2_SwapVariables {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        Integer[] variables = {a, b};
        System.out.println("До обмена: a = " + a + ", b = " + b);
        // обмен значений местами
        swapWithoutTemp(variables);

        a = variables[0];
        b = variables[1];
        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    public static void swapWithoutTemp(Integer[] variables) {
        Integer a = variables[0], b = variables[1];
        a=a+b;
        b=a-b;
        a=a-b;
        variables[0] = a;
        variables[1] = b;
    }
}
