public class tamperproof {
    final double calculateBaseDiscount(double price) {
        return price * 0.05;
    }
    double calculatePromoDiscount(double price) {
        return price * 0.10;
    }
}
final class SeasonalPricing extends tamperproof {
    @Override
    double calculatePromoDiscount(double price) {
        return price * 0.15;
    }
    public static void main(String[] args) {

        SeasonalPricing pricing = new SeasonalPricing();

        double price = 1000;

        System.out.println("Base Discount: Rs. "
                + pricing.calculateBaseDiscount(price));

        System.out.println("Promo Discount: Rs. "
                + pricing.calculatePromoDiscount(price));
    }
}