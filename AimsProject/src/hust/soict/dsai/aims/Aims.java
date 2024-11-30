package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: " + anOrder.totalCost());
        
        anOrder.removeDigitalVideoDisc(dvd2);

        System.out.println("\nList after remove dvd2:");
        System.out.println("Total cost is: " + anOrder.totalCost());


        DigitalVideoDisc dvd4 = new DigitalVideoDisc("A", "b", "c", 100, 200f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("d", "e", "f", 100, 100f);
        DigitalVideoDisc[] dvdList = {dvd4, dvd5};
        anOrder.addDigitalVideoDisc(dvdList);
        System.out.println("\nAfter overloading part 1");
        System.out.println("Total cost is: " + anOrder.totalCost());
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("g", "h", "i", 10, 20f);
        anOrder.addDigitalVideoDisc(dvd1, dvd6);
        System.out.println("\nAfter overloading part 2");
        System.out.println("Total cost is: " + anOrder.totalCost());
        
        System.out.println("\nnbDigitalVideoDiscs:" + DigitalVideoDisc.getnbDigitalVideoDiscs());
    }
}
