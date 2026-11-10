package com.poly.bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Nguyen Van A", StudentType.REGULAR));
        students.add(new Student("S002", "Tran Thi B", StudentType.REGULAR));
        students.add(new Student("S003", "Le Van C", StudentType.PART_TIME));
        students.add(new Student("S004", "Pham Thi D", StudentType.PART_TIME));
        students.add(new Student("S005", "John Doe", StudentType.INTERNATIONAL));
        students.add(new Student("S006", "Jane Smith", StudentType.INTERNATIONAL));

        System.out.println("=== Danh sach toan bo sinh vien ===");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\n=== Danh sach sinh vien theo tung loai ===");
        for (StudentType t : StudentType.values()) {
            System.out.println("Loai sinh vien: " + t.getDescription());
            for (Student s : students) {
                if (s.getType() == t) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("\n=== So luong sinh vien cua moi loai ===");
        for (StudentType t : StudentType.values()) {
            int count = 0;

            for (Student s : students) {
                if (s.getType() == t) {
                    count++;
                }
            }
            
            System.out.println(t.getDescription() + ": " + count);
        }
    }
}
