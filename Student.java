package studentdb;

import java.util.Scanner;

public class Student {
    private final  String hoTen;
    private final int namHoc;
    private String  maSinhVien; 
    private final String khoaHoc;
    private int  hocPhi = 0;
    private static final int gia1HocPhan = 200000;
    private final  int id;
    
    public Student(){
        this.khoaHoc = "";
        Scanner in =new Scanner(System.in);
        System.out.println("Nhap ho ten:  ");
        this.hoTen = in.nextLine();
       
        System.out.println("Nhap nam hoc: ");
        this.namHoc= in.nextInt();
        
        System.out.println("Nhap ID 5 so: ");
        this.id = in.nextInt();
        setStudentID();
       
        
    }
    
    private void setStudentID(){
        this.maSinhVien = namHoc +""+ id;
    }
    
    public void enroll(){
        do {    
            System.out.println("Khoa hoc muon dang ki: ");
            Scanner in= new Scanner(System.in);
            String khoaHoc = in.nextLine();
            if(!khoaHoc.equals("Q")){
                khoaHoc = khoaHoc + "\n" + khoaHoc;
                hocPhi = hocPhi + gia1HocPhan;
            } 
            else{
                System.out.println("break");
                break; 
            }
        }     
        while (1!=0);
    }
    
    public void viewBalance(){
        System.out.println("Tien hoc phi:" + hocPhi);
    }
    public void payTuition(){
        viewBalance();
        System.out.print("Nhap so tien thanh toan :");
        Scanner in = new Scanner(System.in);
        int payment=in.nextInt();
        hocPhi=hocPhi-payment;
        System.out.println("Cam on da thanh toan so tien "+payment);
        viewBalance();
    }
    
    @Override
    public String toString(){
    return "Name: "+ hoTen + "\n nam hoc: "+ namHoc + "\n masinhvien: "+ maSinhVien + "\n mon hoc dang ki:"+ khoaHoc + "\nso tien con thieu " +hocPhi;
    }
}

   
    

