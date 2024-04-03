package Products;

public class Shirt extends Product {
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        setSize(size);
    }

    @Override
    public void wear() {
        System.out.println("This shirt suits you well!");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold sideways.");
    }
}
