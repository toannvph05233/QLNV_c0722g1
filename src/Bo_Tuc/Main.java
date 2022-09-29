package Bo_Tuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerProduct managerProduct = new ManagerProduct();
        while (true) {
            System.out.println("Quản lý sản phẩm");
            System.out.println("1. Show");
            System.out.println("2. Create");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            int chon = Integer.parseInt(scanner.nextLine());
            System.out.println("Bạn đã chọn : " + chon);
            switch (chon) {
                case 1:
                    managerProduct.show();
                    break;
                case 2:
                    try {
                        managerProduct.them();
                    } catch (Exception e) {
                        System.out.println("Tên Nhân viên là Vân ngủ trong giờ học");
                    }
                    break;
                case 3:
                    // sửa
                    break;
                case 4:
                    // Xóa
                    break;
                case 5:
                    //thoát
            }
        }
    }
}
