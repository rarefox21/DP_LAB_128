class SimpleProduct extends Product {

    public SimpleProduct(String name, double price, String description) {
        super(name, price, description);
    }

    public double getPrice() {
        return this.price;
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "Product: " + name + ", Price: " + price + ", Description: " + description);
    }
}