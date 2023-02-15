import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
           
            int fig = Math.min(b, c);
            b = b - fig;
            c = c - fig;
           
            if (b < c) {
                a = a-b;
                b = b-b; 
                if(a>c){
                System.out.println("YES");
                continue;
                }else{
                    System.out.println("no");
                    continue;
                }
                
                
                
            } else {
                a= a-c;
                c=c-c;
                if (a > b) {
                System.out.println("YES");
                continue;
                }else {
                System.out.println("NO");
                continue;
            }
            }
           
        }
    }
}
