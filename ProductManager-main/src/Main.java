import config.Config;
import controller.ProductController;
import model.Product;


/** class này hiển thị các chức năng và nhận dữ liệu từ người dùng. */
public class Main {
    static ProductController productController = new ProductController();  // tạo đối tượng controller để thao tác với các phương thức
    public static void main(String[] args) {


        int choice ;
        while (true){
            System.out.println("=================MENU=================");
            System.out.println("1. Hiển thị toàn bộ sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhập thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("Hãy nhập vào lựa chọn của bạn");
            choice = Config.scanner().nextInt();
            switch (choice){
                case 1:
                    // hiển thị danh sách
                    displayListProduct();
                    break;
                case 2:
                    createNewProduct();
                    // thêm mới sản phẩm
                    break;
                case 3:
                    updateProduct();
                    // cập nhật thông tin sản phẩm
                    break;
                case 4:delete();
                    // xóa sản phẩm
                    break;
                case 5:
                    //
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.err.println("hãy nhập 1 số từ 1 đến 5");
            }
        }
    }
    public static void displayListProduct(){
        // Lấy ra dánh sách sanr phẩm
        if (productController.getSize()==0){
            System.err.println("Danh sách sản phẩm trống");
            return;
        }
        Product[] list = productController.getAll();
        System.out.println("Danh sách Sản phẩm");
        for (Product p :list) {
            if(p!=null){
                System.out.println(p);
            }
        }
    }
    public static void createNewProduct(){  // hàm tạo mới sản phẩm
        Product newProduct = new Product();
        int id = getNewId();  // lấy id tự tăng
        newProduct.setId(id);
        System.out.println("Id = "+id);
        System.out.println("Nhập vào tên");
        newProduct.setName(Config.scanner().nextLine());
        System.out.println("Nhập vào gia");
        newProduct.setPrice(Config.scanner().nextDouble());
        System.out.println("Nhập vào mo ta");
        newProduct.setDescription(Config.scanner().nextLine());
        boolean check = productController.createProduct(newProduct);
        if (check){
            System.out.println("Thêm mới thành công");
        }
    }
    public static int getNewId(){  // hàm tạo id tự động
        Product[] list = productController.getAll(); // lấy danh sách sản phẩm
        int idMax = 0;  // tạo id lớn nhất
        for (Product p: list) {   // duyệt mảng sản phẩm để tìm ra id lớn nhất
            if(p==null){        // nếu sản phẩm null, chương trình sẽ ném lỗi nullpoiterexeption, khối if này sẽ giải quyết điều đó
                continue;   // nếu sản phẩm  == null sẽ bỏ qua vòng lặp
            }
            if(idMax < p.getId()){  // gán max id
                idMax = p.getId();
            }
        }
        return idMax+1;  // trả về id lớn nhất  + 1
    }

    public static void updateProduct(){  // hàm này có chức năng update sản phẩm mới.
        System.out.println("nhập vào id sản phẩm bạn muốn sửa: ");
        int id = Config.scanner().nextInt();  // lấy id để tim sản phẩm
        Product product = productController.findById(id);  // lấy sản pham = hàm findById();
        if (product != null){   // nếu sản phầm không = null sẽ set lại dữ liệu  = dữ liệu nhập từ bàn phím
            System.out.println(product);  // in ra sản phẩm
            System.out.println("Id = " + id);
            System.out.println("Nhập vào tên mới");
            product.setName(Config.scanner().nextLine());
            System.out.println("Nhập vào giá mới");
            product.setPrice(Config.scanner().nextDouble());
            System.out.println("Nhập vào mo ta mới");
            product.setDescription(Config.scanner().nextLine());
            productController.update(product);   // gọi hàm update sản phẩm
        }else System.out.println("không tìm thấy sản phẩm đó.");
    }
    public static void delete(){  // hàm xóa sản phẩm
        System.out.println("nhập vào id sản phẩm bạn muốn xóa");
        int id = Config.scanner().nextInt();  // lấy id sản phẩm cần xóa
        productController.delete(id);  // gọi hàm xóa và truyền id vào
    }

}