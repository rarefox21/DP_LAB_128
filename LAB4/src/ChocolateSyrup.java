class ChocolateSyrup implements CondimentDecorator {
    Beverage beverage;

    public ChocolateSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate Syrup";
    }

    public double cost() {
        return beverage.cost() + 0.9;
    }
}