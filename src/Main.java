import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        boolean addingItems = true;

        while (addingItems) {
            System.out.print("Masukkan nama makanan: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan harga satuan: ");
            double price = scanner.nextDouble();

            System.out.print("Masukkan jumlah: ");
            int quantity = scanner.nextInt();

            // Clear the buffer
            scanner.nextLine();

            MenuItem menuItem = new MenuItem(name, price, quantity);
            order.addItem(menuItem);

            System.out.print("Tambah item lagi? (y/n): ");
            String more = scanner.nextLine();
            addingItems = more.equalsIgnoreCase("y");
        }

        order.printReceipt();
        scanner.close();
    }
}
