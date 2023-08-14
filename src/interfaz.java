import java.util.Scanner;

public class interfaz {
    public static void main(String[] args) {
        int datoIngresado;
        do {
            System.out.println("Eliga una de las opciones para realizar su operacion");
            System.out.println("Escriba 1 consultar su saldo");
            System.out.println("Escriba 2 ingresar dinero");
            System.out.println("Escriba 3 para sacar dinero");
            System.out.println("Escriba 4 para consultar sus ultimos movimientos");
            System.out.println("Para salir escriba cualquier otro numero");
            Scanner scanner = new Scanner(System.in);
            datoIngresado = scanner.nextInt();
            switch (datoIngresado){
                case 1:
                    System.out.println("La opcion que usted ingreso es consultar su saldo");
                    break;
                case 2:
                    System.out.println("La opcion que usted ingreso es ingresar dinero");
                    break;
                case 3:
                    System.out.println("La opcion que usted ingreso es sacar dinero");
                    break;
                case 4:
                    System.out.println("La opcion que usted ingreso es consultar sus ultimos movimientos");
                    break;
                default:
                    System.out.println("Muchas gracias por usar este cajero vuelva pronto");
            }
        } while (datoIngresado == 1 || datoIngresado == 2 || datoIngresado == 3 || datoIngresado == 4);
    }
}
