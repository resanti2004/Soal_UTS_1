public class Item {
    private int harga;
    private String nama;
    private String rank;
    private int quantity;

    public Item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getRank() {
        return rank;
    }

    public int getQuantity() {
        return quantity;
    }
}
