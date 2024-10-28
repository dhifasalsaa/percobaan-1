import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal(){
        int total = 0;
        for (MenuItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    };

    public void printReceipt() {
        System.out.println("Nota Pemesanan Makanan:");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " x" + item.getQuantity() + " - Rp " + item.getTotalPrice());
        }
        System.out.println("Total Harga: Rp " + calculateTotal());
    }
}
