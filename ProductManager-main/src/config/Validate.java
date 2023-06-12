package config;
/** class validate */
public class Validate {
    public  static boolean checkProductName(String productName){
        // tên sản phẩm phair ít nhất 6 kí tự và bắt đầu bằng chữa P;
        if(productName.length()<6 || !productName.startsWith("P")){
            System.err.println("Tên của sản phẩm phải bắt đầu bằng P và có ít nhất 6 kí tự");
            return false;
        }
       return true;
    }
    public  static boolean checkProductPrice(double price){
        if (price<=0){
            return false;
        }
        return true;
    }
}
