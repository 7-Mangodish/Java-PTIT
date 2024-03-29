/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Intern implements Comparable<Intern>{
    private String  id, name, cl, em, ent;
    private int cnt;

    public Intern(String id, String name, String cl, String em,String ent, int cnt) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.em = em;
        this.cnt = cnt;
        this.ent = ent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getEnt() {
        return ent;
    }
    
    @Override
    public int compareTo(Intern o){
        return this.id.compareTo(o.getId());
    }
    @Override
    public String toString(){
        return this.cnt + " " + this.id + " " + this.name + " " + this.cl + " " + this.em + " " + this.ent;
    }
}
public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Intern> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            ar.add(new Intern(sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), i+1));
        }
        Collections.sort(ar);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String dn = sc.nextLine();
            for(Intern x:ar){
                if(x.getEnt().compareTo(dn)==0){
                    System.out.println(x);
                }
            }
        }
    }
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/