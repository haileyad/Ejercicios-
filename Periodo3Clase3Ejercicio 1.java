import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ingresar=new Scanner(System.in);

    double nota;

    System.out.println("favor ingresar un valor desde 1 hasta 10");
    nota=ingresar.nextDouble();

    while(nota<1 | nota>10)
    {
    System.out.println("Lo siento mucho pero el valor proporcionado no es el correcto");
    nota=ingresar.nextDouble();
    }
  }
}