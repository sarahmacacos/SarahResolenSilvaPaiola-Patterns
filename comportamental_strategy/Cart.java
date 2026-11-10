public class Cart {
    private final double subtotal;
    private DiscountStrategy strategy;
    public Cart(double subtotal, DiscountStrategy strategy) {
        if (Double.isNaN(subtotal) || Double.isInfinite(subtotal) || subtotal < 0) {
            throw new IllegalArgumentException("Subtotal inválido");
        }
        if (strategy == null) {
            throw new IllegalArgumentException("A estratégia não pode ser nula");
        }
        this.subtotal = subtotal;
        this.strategy = strategy;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("A estratégia não pode ser nula");
        }
        this.strategy = strategy;
    }

    public double total() {
        double total = strategy.apply(subtotal);
        if (Double.isNaN(total) || Double.isInfinite(total)) {
            throw new IllegalStateException("A estratégia devolveu um valor inválido");
        }
        if (total < 0) {
            return 0;
        }
        return total;
    }
}
