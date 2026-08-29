public class shipcalc {
    double calculateCost(double weight) {
        return weight * 50;
    }
    double calculateCost(double weight, double distance) {
        return (weight * 50) + (distance * 2);
    }
    double calculateCost(double weight, double distance, boolean isExpress) {
        double cost = (weight * 50) + (distance * 2);
        if (isExpress) {
            cost = cost * 1.5;
        }
        return cost;
    }
    public static void main(String[] args) {
        shipcalc calculator = new shipcalc();
        System.out.println("Weight only: Rs. "
                + calculator.calculateCost(5));
        System.out.println("Weight + Distance: Rs. "
                + calculator.calculateCost(5, 100));
        System.out.println("Express: Rs. "
                + calculator.calculateCost(5, 100, true));
    }
}