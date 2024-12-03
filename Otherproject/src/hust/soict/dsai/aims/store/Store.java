package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 50; 
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0; 

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("Added to store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; 
                qtyInStore--;
                System.out.println("Removed from store: " + dvd.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in the store.");
        }
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }
        System.out.println("***************************************************");
    }
}
