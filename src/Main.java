public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80;
        double weight = 87;
        double result;
        result = service.calculate(height, weight);
        int index = (int) result;
        System.out.println("Индекс массы тела " + index);
    }
}