public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("1.87 / 98");
        System.out.println(service.calculate(1.87, 98));

        System.out.println();
        System.out.println("1.7 / 62");
        System.out.println(service.calculate(1.7, 62));

    }
}