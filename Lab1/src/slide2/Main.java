package slide2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("F1", "An", 1000, 200, 50));
        list.add(new FullTimeEmployee("F2", "Binh", 1200, 100, 20));
        list.add(new PartTimeEmployee("P1", "Cuong", 50, 10));
        list.add(new PartTimeEmployee("P2", "Dung", 60, 8));
        list.add(new FullTimeEmployee("F3", "Em", 900, 150, 30));

        System.out.println("Danh sach nhan vien:");
        for (Employee e : list) {
            System.out.println(e);
        }

        Employee max = list.get(0);
        for (Employee e : list) {
            if (e.income() > max.income()) {
                max = e;
            }
        }

        System.out.println("\nNhan vien co thu nhap cao nhat:");
        System.out.println(max);
    }
}