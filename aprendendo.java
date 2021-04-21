import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int x;
    String nome;

    Scanner ler = new Scanner(System.in);

    System.out.println("Entre com seu nome");
    nome = ler.nextLine();

    System.out.println("Olá " +nome);


  }
}