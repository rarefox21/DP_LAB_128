abstract class Product {
        protected String name;
        protected double price;
        protected String description;

        public Product(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public abstract double getPrice();

        public abstract void display(int indent);
}
