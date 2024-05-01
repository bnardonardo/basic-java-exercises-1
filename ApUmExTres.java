import java.util.Scanner;
public class ApUmExTres{
     
    public static void main(String[] args) 
    {
     
         int n=20;
            System.out.printf("20 primeiros numeros Fibonacci: \n");
        for (int i = 0; i<=n-1; ++i)
            {
               System.out.print(numero(i) + " ");
            }
    }
     
    public static int numero(int n) {
         
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return numero(n-1) + numero(n-2);
         
    } 
}