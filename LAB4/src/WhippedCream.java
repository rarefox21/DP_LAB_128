class WhippedCream implements CondimentDecorator {
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    public double cost() {
        return beverage.cost() + 0.7;
    }
}