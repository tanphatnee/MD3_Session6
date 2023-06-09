public class Categoty {
    int categoryId;
    String categoryName;
    public Categoty(){

    }
    public Categoty(int categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;

    }
    public void display(){
        System.out.println("Mã danh mục : "+ categoryId + "\n" + "Tên danh mục : "+ categoryName );
    }
}
