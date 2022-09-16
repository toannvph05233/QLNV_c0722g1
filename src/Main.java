import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerNhanVien managerNhanVien = new ManagerNhanVien();
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Sửa nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm nhân viên theo id");
            System.out.println("6. Thoát");
            System.out.println("---------------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerNhanVien.show();
                    break;
                case 2:
                    managerNhanVien.them();
                    break;
                case 3:
                    managerNhanVien.sua();
                    break;
                case 4:
                    //xóa
                    break;
                case 5:
                    managerNhanVien.timKiem();
                    break;
                case 6:
                    return;
            }
        }
    }
}
