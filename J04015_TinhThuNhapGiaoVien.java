/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class gv{
    public String id, name;
    public int salary;
    
    public gv(String id, String name, int sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
    @Override
    public String toString(){
        int level = Integer.parseInt(id.substring(2));
        String tmp= id.substring(0, 2);
        int sup;
        if (tmp.compareTo("HT")==0){
            salary = salary *level+ 2000000;
            sup = 2000000;
        }
        else if(tmp.compareTo("HP") ==0){
            salary = salary *level+ 900000;
            sup = 900000;
        }
        else{
            salary = salary *level+ 500000;
            sup = 500000;            
        }

        return String.format("%s %s %d %d %d", id, name, level, sup, salary);
    }
}
public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gv a = new gv(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(a);
    }
}
/*
HP04
Tran Quoc Huy
1578000
*/
