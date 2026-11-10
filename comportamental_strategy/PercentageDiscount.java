public class PercentageDiscount implements DiscountStrategy {
    private final double percent;
    public PercentageDiscount(double percent) {
        if (Double.isNaN(percent) || percent < 0 || percent > 100) {
            throw new IllegalArgumentException("O percentual tem que ficar entre 0 e 100");
        }
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        return subtotal * (1 - percent / 100);
    }
}
