package Bo_Tuc;

import java.io.*;
import java.util.ArrayList;

public class IOProduct_NhiPhan {
    static File file = new File("product_nhi_phan.txt");

    public static void write(ArrayList<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Product> products = (ArrayList<Product>) objectInputStream.readObject();
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

