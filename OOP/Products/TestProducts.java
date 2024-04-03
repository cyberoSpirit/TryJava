package Products;

import Products.Shirt.Size;

public class TestProducts {
    public static void Try() {
        Shirt shirt = new Shirt(12.5, "red", "VOVK", Size.SMALL);
        shirt.fold();
        productStore(shirt);
        shirt.wear();

        Pants pants = new Pants(18, "black", "LiA", 100, 90);
        pants.fold();
        productStore(pants);
        pants.wear();
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName());
    }
}