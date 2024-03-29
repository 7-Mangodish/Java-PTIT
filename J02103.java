
package CodePtit;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J02103 {
    static int n,m;
    static int a[][]= new int[1005][1005];
    static int b[][]= new int[1005][1005];
    
    static void sol(){
        int ans[][]= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[i][j]= 0;
                for(int k=0; k<m; k++){
                    ans[i][j]+=(a[i][k]*b[k][j]);
                }
                
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int ind=1; ind<=t; ind++){
            n= sc.nextInt();
            m= sc.nextInt();
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j]= sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            System.out.print("Test "+ ind +":\n");
            sol();
        }
    }
}
