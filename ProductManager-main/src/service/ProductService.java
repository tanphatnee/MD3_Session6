package service;

import config.Config;
import model.Product;

/** service có chức năng chính là xử lý logic. */

public class ProductService {
    private Product[] listProduct= new Product[100]; // tất cả các phần tử đều null

    private int size = 0;

    public Product[] getListProduct() {  // hàm trả về danh sách các product
        return listProduct;
    }
    public boolean create(Product product){         // hàm tạo một sản phẩm mới
        if (size>100) {     // mảng danh sách product có số lượng giới hạn cố định
            //Nếu danh sách đã vượt quá số lượng giới hạn sẽ thông báo đầy và không cho tạo thêm sản phẩm rồi trả về true
            System.err.println("danh sách đã đầy, không thể thêm mới sản phẩm");
            return false;
        }

        for (int i = 0; i < listProduct.length; i++) {  // duyệt qua mảng sản phẩm, đến sản phẩm nào null thì gán sản phẩm đó bằng sản phẩm mới tạo
            if(listProduct[i]==null){
                listProduct[i] = product;
                size++;
                return true; //nêu tạo thành công trả về true
            }
        }
        return true;
    }
    public  Product findById(int id){  //hàm tìm kiếm sản phẩm theo id
        for (Product p:listProduct) {
            if (p == null) continue;
            if(p.getId()== id){
                return p;
            }
        }
        return null;
    }
    public void update(Product product){  // hàm cập nhật sản phẩm có tham số đầu vào là một sản phẩm
        for (int i = 0; i < listProduct.length; i++) {  //duyệt qua toàn bộ danh sách sản phẩm
            if (listProduct[i] == null) continue;   // Nếu gặp sản phẩm bị null thì bỏ qua bước lặp này
            if(listProduct[i].getId()== product.getId()){
                listProduct[i] = product;  //Nếu đến một sản phẩm có ai đi bằng với ID của sản phẩm truyền vào thì sẽ gắn lại sản phẩm đó
                break;
            }
        }
    }
    public void delete(int id){  // hàm xóa sản phẩm
        Product product = findById(id);  //
        if (product != null){
        System.out.println("sản phẩm bạn chọn là: " + product);
        System.out.println("bạn có chắc muốn xóa sp đó?");
        System.out.println("1. có");
        System.out.println("2. không");
        int choice = Config.scanner().nextInt();  // dòng 53 - 58 xác nhận lại sản phẩm muốn xóa
        if (choice == 1){
        for (int i = 0; i < listProduct.length; i++) {  //xóa sản phẩm
            if (listProduct[i] == null) continue;
            if(listProduct[i].getId()== id){
                listProduct[i] = null;
                size--;
                return;
            }
        }}}else System.out.println("không tìm thấy sản phẩm đó"); //Nếu không tìm thấy sản phẩm đó thì thông báo không tìm thấy sản phẩm
    }
    public int getSize(){ // lấy ra độ dài của mảng
        return this.size;
    }
}
