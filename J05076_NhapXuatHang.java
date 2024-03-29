/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.ArrayList;
import java.util.Scanner;

class product{
    private String id, name, rank;
    private long  priceIn, priceOut;
    public product(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }
    public void setPriceIn(long cnt_in, long price){
        this.priceIn = cnt_in * price;
    }
    public void setPriceOut(long cnt_out, long price){
        if(this.rank.compareTo("A")==0){
            this.priceOut = cnt_out * price * 108 /100;
        }
        else if(this.rank.compareTo("B")==0){
            this.priceOut = cnt_out * price * 105 / 100;
        }   
        else if(this.rank.compareTo("C")==0){
            this.priceOut = cnt_out * price * 102 / 100;
        }         
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + priceIn + " " + priceOut;
    }
    
}
public class J05076_NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <product> ar = new ArrayList<>();
        while(t-->0){
            ar.add(new product(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- >0){
            String id = sc.next();
            int cnt_in = sc.nextInt(),
                price = sc.nextInt(),
                cnt_out = sc.nextInt();
            sc.nextLine();
//            System.out.println(id +" " + cnt + " " + in +" " + out);
            for(product x : ar){
                if(x.getId().compareTo(id) ==0){
                    x.setPriceIn(cnt_in, price);
                    x.setPriceOut(cnt_out, price);
                    System.out.println(x);
                }
            }
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/