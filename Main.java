
import java.util.Scanner;
import Clases.*;



public class Main{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args){

        Cliente cliente = new Cliente();
        TarjetaCredito Credito = new TarjetaCredito();
        TarjetaDebito Debito = new TarjetaDebito();

        //cliente.GuardarDatos();

        Scanner scanner = new Scanner(System.in);
        System.out.println(GREEN +"Introduce tu nombre:" + RESET);
        String nombre = scanner.nextLine();
        cliente.setNombre(nombre);

        System.out.println(GREEN + "Introduce tu edad:" + RESET);
        int edad = scanner.nextInt();
        cliente.setEdad(edad);
        scanner.nextLine();

        System.out.println(Main.GREEN +"Su trabajo es Riesgoso? si/no:"+ Main.RESET);
        String riesgo = scanner.nextLine();
        cliente.setRiesgo(riesgo);
        scanner.close();

        System.out.println(YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + RESET);
        System.out.println(GREEN + "Nombre del cliente-> " + BLUE + cliente.getNombre() + RESET);
        System.out.println(GREEN + "Edad-> " + BLUE + cliente.getEdad() + RESET);
        System.out.println(GREEN + "Es Riesgoso-> " + BLUE + cliente.getEsRiesgo() + RESET);
        System.out.println(YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + RESET);
        System.out.println(GREEN + "Tipo de Tarjeta-> " + BLUE + Credito.getTarjeta() + RESET);
        System.out.println(GREEN + "Num Tarjeta-> " + BLUE + Credito.getNumTarjeta() + RESET);
        System.out.println(GREEN + "Fecha Expiracion-> " + BLUE + Credito.getFechaExpiracion() + RESET);
        System.out.println(GREEN + "Se esta usando la Tarjeta?" + RESET);
        Credito.usarTarjeta();
        System.out.println(GREEN + "Se ah cancelado la tarjeta?" + RESET);
        Credito.cancelarTarjeta();
        System.out.println(YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + RESET);
        System.out.println(GREEN + "Tipo de Tarjeta-> " + BLUE + Debito.getTarjeta() + RESET);
        System.out.println(GREEN + "Num Tarjeta-> " + BLUE + Debito.getNumTarjeta() + RESET);
        System.out.println(GREEN + "Fecha Expiracion-> " + BLUE + Debito.getFechaExpiracion() + RESET);
        System.out.println(GREEN + "Se esta usando la Tarjeta?" + RESET);
        Debito.usarTarjeta();
        System.out.println(GREEN + "Se ah cancelado la tarjeta?" + RESET);
        Debito.cancelarTarjeta();
        System.out.println(YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + RESET);
    }
}