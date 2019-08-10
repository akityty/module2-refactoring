public class Calculator {
    public static void main(String[] args) {
        System.out.println( calculate(1,1,'+'));
        System.out.println(calculate(2,1,'-'));
        System.out.println(calculate(2,2,'*'));
        System.out.println(calculate(6,3,'/'));
//        calculate(1,1,'=');
    }
    public static int calculate(int a, int b, char o) {
        final char ADDITION = '+';
        final char SUBTRACTION = '-';
        final char MULTIPLICATION = '*';
        final char DIVISION = '/';
        switch (o) {
            case ADDITION:
                return a + b;
            case SUBTRACTION:
                return a - b;
            case MULTIPLICATION:
                return a * b;
            case DIVISION:
                if (b != 0)
                    return a / b;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}