package Products;

import Products.Shirt.Size;

public class TestProducts {
    public static void Try() {
        Shirt shirt = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("VOVK");
        shirt.setColor("red");
        shirt.setPrice(12.5);
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants();
        pants.setBrand("LiA");
        pants.setColor("black");
        pants.setLength(100);
        pants.setWaist(90);
        pants.setPrice(15);
        pants.fold();
        productStore(pants);
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName());
    }
}