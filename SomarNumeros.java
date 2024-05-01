import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
      Double a, b, c;
      
      Scanner entrada=new Scanner (System.in);
      
      System.out.printf("Digite o primeiro número:");
      a=entrada.nextDouble();
      System.out.printf("Digite o segundo número:");
      b=entrada.nextDouble();
      c=a+b;
      System.out.printf("%.2f + %.2f = %.2f\n",a,b,c);
    }
}