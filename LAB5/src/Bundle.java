import java.util.ArrayList;

class Bundle extends Product {
    private double discount;
    private ArrayList<Product> items;

    public Bundle(String name, double discount) {
        super(name, 0, "A bundle of products");
        this.discount = discount;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public double getPrice() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        total -= discount;
        return total;
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "Bundle: " + name + ", Discount: " + discount);
        for (Product item : items) {
            item.display(indent + 2);
        }
    }
}