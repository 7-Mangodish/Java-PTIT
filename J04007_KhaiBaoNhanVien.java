package CodePtit;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

class nv {

    public String name, sex, date, add, num, contract;
    public String id;


    public nv(String name, String sex, String date, String add, String num, String contract) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
        this.num = num;
        this.contract = contract;
        id = "00001";
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s ", id , name, sex, date, add, num, contract);
    }
}

public class J04007_KhaiBaoNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nv a = new nv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a);
    }
}

/*
Nguyen Van Hoa
Nam
22/11/1982
Mo Lao-Ha Dong-Ha Noi
8333123456
31/12/2013
*/