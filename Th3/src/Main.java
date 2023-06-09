public class Main {
    public static void main(String[] args) {
        Categoty md1 = new Categoty(1, "Quần");
        Categoty md2 = new Categoty(2, "Áo");
        Product product1 = new Product(1, "Quần âu", 199999,md1);
        Product product2 = new Product(2, "Quần Đùi", 100000,md1);
        Product product3 = new Product(3, "Áo thun", 199999,md2);
        Product product4 = new Product(4, "Áo phông", 199999,md2);
        System.out.println("Tất cả Sp :");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}