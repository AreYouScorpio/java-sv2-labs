package classtructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product, int stock) {
        this.product = "alma" ;
        this.stock = 0 ;}



    public String getProduct() {
        return product;
    }
    public int getStock() {
        return stock;
    }

    public void store(int newAmount) { this.stock = this.stock + newAmount;}
    public void dispatch(int newAmount) { this.stock = this.stock - newAmount;}

}
