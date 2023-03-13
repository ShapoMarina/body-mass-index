public class BmiService {

    public int calculate(double metersGrowth, double kgWeight) {
        double result = metersGrowth * metersGrowth;
        double index = kgWeight / result;
        return (int) index;
    }
}
