package studentdb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Nhap so luong sinh vien can them: ");
    Scanner in =new Scanner(System.in);
    int soLuong= in.nextInt();
    Student[] student = new Student[soLuong];
    for (int i = 0; i < soLuong; i++) {
        student[i] = new Student();
                
        student[i].enroll();
        student[i].payTuition();
        System.out.println(student[i].toString());            
        }
        for (int i = 0; i < soLuong; i++) {
            System.out.println(student[i].toString());    
        }
    }

}
