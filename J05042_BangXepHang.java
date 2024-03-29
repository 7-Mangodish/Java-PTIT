/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Submit implements Comparable<Submit>{
    private String name;
    private int Ac, cntSubmit;

    public Submit(String name, int Ac, int cntSubmit) {
        this.name = name;
        this.Ac = Ac;
        this.cntSubmit = cntSubmit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }

    public int getCntSubmit() {
        return cntSubmit;
    }

    public void setCntSubmit(int cntSubmit) {
        this.cntSubmit = cntSubmit;
    }
    
    @Override
    public int compareTo(Submit o){
        if(this.Ac > o.getAc())
            return -1;
        else if(this.Ac == o.getAc()){
            if(this.cntSubmit < o.getCntSubmit())
                return -1;
            else if(this.cntSubmit == o.getCntSubmit())
                return this.name.compareTo(o.getName());
        }
        return 1;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.Ac + " " + this.cntSubmit;
    }
}
public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Submit> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            ar.add(new Submit(sc.nextLine(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(ar);
        for(Submit x:ar){
            System.out.println(x);
        }
    }
}

/*
2
Tran Thi Ngoc
168 600
Nguyen Van Nam
168 600
*/