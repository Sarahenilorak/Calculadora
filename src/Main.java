import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um primeiro numero :");
        double a = sc.nextDouble();
        System.out.println("Digite um segundo numero :");
        double b = sc.nextDouble();

        double media = a+b/2;
        System.out.println("Essa é sua media:" + media);
        System.out.println("Helloword");

    }
}