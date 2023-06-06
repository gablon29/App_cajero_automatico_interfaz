import java.util.Scanner;

public class interfaz {
    public static void main(String[] args) {
        System.out.println("Eliga una de las opciones para realizar su operacion");
        System.out.println("Escriba 1 consultar su saldo");
        System.out.println("Escriba 2 ingresar dinero");
        System.out.println("Escriba 3 para sacar dinero");
        System.out.println("Escriba 4 para consultar sus ultimos movimientos");
        Scanner scanner = new Scanner(System.in);
        int datoIngresado = scanner.nextInt();
        if (datoIngresado == 1){
            System.out.println("Su saldo es 4500");
        } if (datoIngresado == 2) {
            System.out.println("Cuantos dinero quieres ingresar");
        } if (datoIngresado == 3) {
            System.out.println("cuanto dinero desea retirar");
        }
           if(datoIngresado == 4){
               System.out.println("ha retirado dinero");
           }
    }
}
