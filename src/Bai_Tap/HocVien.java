package Bai_Tap;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class HocVien {
    private String name;
    private String gender;
    private int age;
    private String phone;
    private Date birthday;
    private Lop lop;

    public HocVien() {
    }

    public HocVien(String name, String gender, int age, String phone, Date birthday, Lop lop) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.birthday = birthday;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", birthday=" + new SimpleDateFormat("dd-MM-yyyy").format(birthday) +
                ", lop=" + lop.toString() +
                '}';
    }
}
