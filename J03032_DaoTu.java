package CodePtit;


import java.util.Scanner;


public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            String w[]= s.trim().split(" +");
            for(String x:w){
                StringBuffer res= new StringBuffer(x);
                res.reverse();
                System.out.print(res+" ");
                
            }
            System.out.println("");
            
        }
    }
}
/*
2
ABC DEF
123 456
*/