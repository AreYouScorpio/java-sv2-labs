package classtructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store store = new Store();
        Store.store(5);
        System.out.println(Store.getProduct() + ": " + Store.getStock());

    }


}
