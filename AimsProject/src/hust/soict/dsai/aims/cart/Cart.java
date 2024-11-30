package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered++;
	        System.out.println("The disc has been added.");
	    } else {
	        System.out.println("The cart is almost full.");
	    }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i] == disc) {
	            for (int j = i; j < qtyOrdered - 1; j++) {
	                itemsOrdered[j] = itemsOrdered[j + 1];
	            }
	            itemsOrdered[qtyOrdered - 1] = null;
	            qtyOrdered--;
	            System.out.println("The disc has been removed.");
	            return;
	        }
	    }
	    System.out.println("The disc is not found.");
	}
	public float totalCost() {
	    float total = 0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        total += itemsOrdered[i].getCost();
	    }
	    return total;
	}


	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc dvd : dvdList) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
            }
            System.out.println("The list of discs has been added.");
        } else {
            System.out.println("The cart is almost full. Not enough space for all the discs.");
        }
    }
    


	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The two discs have been added.");
		} else {
			System.out.println("The cart is almost full. Not enough space for both discs.");
		}
	}
	
	public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost() + "f");
        System.out.println("***************************************************");
    }
	
	public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found: " + itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No DVD found with ID: " + id);
    }
	
	public void searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No DVD found with title: " + title);
    }
}
