package Products;

public class Pants extends Product {
    private int waist;
    private int length;


    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Pants(double price, String color, String brand, int length, int waist) {
        super(price, color, brand);
        setLength(length);
        setWaist(waist);
    }

    @Override
    public void wear() {
        System.out.println("Pants are perfect on you!");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold one leg over the other.");
    }
}
