/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;


class salary{
    private String id, name, position;
    private int bas;
    private int cnt;

    public salary(String id, String name, int bas, int cnt, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.bas = bas*cnt;
        this.cnt = cnt;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBas() {
        return bas;
    }

    public void setBas(int bas) {
        this.bas = bas;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
    
    private int bonus(){
        if(this.cnt>=25)
            return (int)(0.2f*this.bas);
        if(this.cnt >=22 && this.cnt <25)
            return (int)(0.1f*this.bas);
        return 0;
    }
          
    private int support(){
        if(this.position.compareTo("GD")==0)
            return 250000;
        if(this.position.compareTo("PGD")==0)
            return 200000;     
        if(this.position.compareTo("TP")==0)
            return 180000;
        return 150000;
    }
    
    @Override
    public String toString(){
        int sum = this.bas  + this.bonus() + this.support();
        return this.id +" " + this.name+ " " + this.bas + " " + this.bonus() + " " + this.support() + " " +sum;
    }
}
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        salary a = new salary("NV01",sc.nextLine(),Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(a);
    }
}
/*
Bui Thi Trang
45000
23
PGD
*/