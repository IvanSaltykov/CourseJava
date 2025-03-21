public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }
    public double calculation(double a, double b) {
        return operation.getResult(a, b);
    }
}
