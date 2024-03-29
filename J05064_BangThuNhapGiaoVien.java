/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class income{
    private String id, name;
    private long salary, bonus,level,  total;

    public income(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.setBonus();
        this.setLevel();
        this.setTotal();
    }
    
    public void setBonus(){
        if(this.id.startsWith("HT"))
            this.bonus = 2000000;
        else if(this.id.startsWith("HP"))
            this.bonus = 900000;
        else 
            this.bonus = 500000;
    }
    
    public void setLevel(){
        this.level = Integer.parseInt(this.id.substring(2));        
    }
    public void setTotal(){

        this.total = this.salary * level + this.bonus;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.level + " " + this.bonus + " " + this.total;
    }
}
public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<income> ar = new ArrayList<>();
        int cnt1= 0, cnt2 = 0;
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            long sal = sc.nextLong();
            sc.nextLine();
            
            String tmp = id.substring(0, 2);
            boolean ok = false;
            if(id.startsWith("HT") && cnt1 < 1){
                ok = true;
                cnt1 ++;
            }
            if (id.startsWith("HP") && cnt2 < 2){
                ok=true;
                cnt2++;
            }
            
            if(id.startsWith("GV"))
                ok = true;
            
            if(ok)
                ar.add(new income(id, name, sal));              
        }
        
        for(income x: ar){
            System.out.println(x);
        }
    }
}
/*
5
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/