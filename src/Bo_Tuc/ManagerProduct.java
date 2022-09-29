package Bo_Tuc;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    ArrayList<Product> products = IOProduct.read();
    Scanner scanner = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void them() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
        IOProduct.write(products);
    }

    public void xoa() {
        System.out.println("Nhập name muốn xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
            }
        }
    }
}
