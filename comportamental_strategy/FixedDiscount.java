public class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        if (Double.isNaN(amount) || Double.isInfinite(amount) || amount < 0) {
            throw new IllegalArgumentException("O desconto fixo não pode ser negativo");
        }
        this.amount = amount;
    }
    
    @Override
    public double apply(double subtotal) {
        double total = subtotal - amount;
        if (total < 0) {
            return 0;
        }
        return total;
    }
}
