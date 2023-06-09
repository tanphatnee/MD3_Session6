public class Product {
    int productId;
    String productName;
    float productPrice;
    Categoty categoty;
    public Product() {

    }
    public Product(int productId, String productName, float productPrice, Categoty categoty) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoty = categoty;

    }
    public void display() {
        System.out.println("Mã sản phẩm : "+ productId + "\n"+
                "Tên sản phẩm : "+ productName+ "\n"+
                "Giá : "+ productPrice + "\n"+
                "Danh mục : "+ categoty.categoryName
        );
    }
}
