public class Main {
    public static void main(String[] args) {
        Item[] listBelanja = new Item[3];
        listBelanja[0] = new Item(1000, "potion","S", 3);
        listBelanja[1] = new Item(5000, "Sword", "A", 1);
        listBelanja[2] = new Item(10000, "Armor", "A", 1);

        int totalHarga = 0;
        for (Item harga : listBelanja) {
            totalHarga += harga.getHarga();
        }
        System.out.println("Your Item backpack worth: " + totalHarga + " with item as listed below: ");
        for (Item item : listBelanja) {
            System.out.println(item.getQuantity() + " " + item.getRank() + " " + item.getNama() + " worth: " + item.getHarga());
        }
    }
}