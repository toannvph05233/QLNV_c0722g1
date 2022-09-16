import java.util.Scanner;

public class ManagerNhanVien {
    NhanVien[] nhanViens = {};
    Scanner scanner = new Scanner(System.in);


    public void show() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }

    public void them() {
        NhanVien nv = createNhanVien();
        NhanVien[] arrNew = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            arrNew[i] = nhanViens[i];
        }
        arrNew[arrNew.length - 1] = nv;
        nhanViens = arrNew;
    }

    public void sua() {
        System.out.println("Nhập vị trí muốn sửa");
        int index = Integer.parseInt(scanner.nextLine());
        NhanVien nv = createNhanVien();
        nhanViens[index] = nv;
    }

    public NhanVien createNhanVien() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập dịa chỉ nhân viên");
        String address = scanner.nextLine();
        NhanVien nv = new NhanVien(id, name, address, age);
        return nv;
    }

    public void timKiem(){
        System.out.println("Nhập id tìm kiếm");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].getId() == id){
                System.out.println(nhanViens[i].toString());
                break;
            }
        }
    }
}
