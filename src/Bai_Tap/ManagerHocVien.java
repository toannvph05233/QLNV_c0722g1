package Bai_Tap;

import Bo_Tuc.ManagerProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerHocVien {
    ArrayList<HocVien> hocViens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Lop> lops = new ArrayList<>();

    public ManagerHocVien() {
        lops.add(new Lop(1, "C0722g1"));
        lops.add(new Lop(2, "C0922g1"));
    }

    public HocVien createHocVien() {
        System.out.println("Nhập name học viên");
        String name = scanner.nextLine();
        System.out.println("Nhập gender học viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập age học viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phone học viên");
        String phone = scanner.nextLine();
        Date date = null;
        while (true) {
            System.out.println("Nhập birthDay học viên theo định dạng dd/MM/yyyy");
            String birthday = scanner.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
                break;
            } catch (ParseException e) {
                System.out.println("Sai định dạng");
                continue;
            }
        }

        for (int i = 0; i < lops.size(); i++) {
            System.out.println(i + 1 + " : " + lops.get(i).getName());
        }
        System.out.println("Mời bạn chọn lớp theo thứ tự");
        int choice = Integer.parseInt(scanner.nextLine());
        Lop lop = lops.get(choice - 1);

        HocVien hocVien = new HocVien(name, gender, age, phone, date, lop);
        return hocVien;


    }

    public static void main(String[] args) {
        ManagerHocVien managerHocVien = new ManagerHocVien();
        System.out.println(managerHocVien.createHocVien().toString());
    }
}
