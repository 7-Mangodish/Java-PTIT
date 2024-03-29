/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;


class TuyenSinh{
    private String id, name;
    private float p1,p2,p3, total;
    private float bonus;
    private String status;

    public TuyenSinh(String id, String name, float p1, float p2, float p3) {
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.bonus = this.setBonus();
        this.total = p1*2+p2+p3;
        this.status = this.setStatus();
    }
    
    private float setBonus(){
        if(this.id.substring(0,3).compareTo("KV1")==0)
            return 0.5f;
        if(this.id.substring(0,3).compareTo("KV2")==0)
            return 1f;     
        else 
            return 2.5f;
    }
    
    private String setStatus(){
        if(this.total+ this.bonus <24)
            return "TRUOT";
        return "TRUNG TUYEN";
    }
    
    @Override
    public String toString(){

        String tmp1="";
        if(this.bonus == (int)this.bonus)
            tmp1 = String.valueOf((int)this.bonus);
        else
            tmp1= String.valueOf(this.bonus);
        
        String tmp2="";
        if(this.total == (int)this.total)
            tmp2 = String.valueOf((int)this.total);
        else
            tmp2= String.valueOf(this.total);      
        
        return this.id + " " + this.name +" " + tmp1 + " " + tmp2 +" " + this.status  ;
    }
}
public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh a = new TuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(a);
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
5
KV3B123
Ly Thi Thu Ha
8
6.5
7
*/