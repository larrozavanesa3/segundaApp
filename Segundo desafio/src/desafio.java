import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombreDelCliente = "Natasha Romanoff";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0 ;


        System.out.println("******************");
        System.out.println("\nNombre del cliente: " + nombreDelCliente);
        System.out.println(" El tipo de cuenta es: "+ tipoDeCuenta);
        System.out.println(" Tu saldo actual es : " + saldo);
        System.out.println("\n******************");

        String menu = """
                *** Para continuar, presione el número de la operación ***
                1 - Saldo
                2 - Retiro
                3 - Depósito
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El Saldo actual es:  " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cuánto desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El Saldo actual es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuánto desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El Saldo actual es: " + saldo);
                    break;
                case 9:
                    System.out.println(" Gracias por ser parte de nuestra comunidad.");
                    break;
                default:
                    System.out.println("Opcion no valida");




            }

        }



    }
}
