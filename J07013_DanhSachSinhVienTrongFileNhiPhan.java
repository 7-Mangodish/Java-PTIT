package danhsachsinhvien1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class SinhVien{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        this.ma = String.format("B20DCCN%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = sdf.parse(ngaysinh);
        this.gpa = gpa;
    }
    
    
//    @Override
//    public String toString(){
//        return this.ma + " " + this.ten + " " + this.lop + " " + this.ngaysinh.getDate() +"/"+ this.ngaysinh.getMonth()+"/" 
//                this.ngaysinh.getYear() + " "+ String.format("%.2f", gpa);
//    }
}
public class J07013_DanhSachSinhVienTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ar = (ArrayList<SinhVien>)obj.readObject();
        for(SinhVien x : ar){
            System.out.println(x);
        }
    }
}
