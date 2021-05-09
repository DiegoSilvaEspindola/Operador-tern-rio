import java.util.Scanner;

public class Ternario {
    public static void main(String args[]){
        String resultado;
        int valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");

        valor = scan.nextInt();

        resultado = (valor > 20) ? "Sim o valor é mairo" : "Não o valor é menor";

        System.out.println(resultado);

    }
}
