package Clases;

public class TarjetaDebito{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    String TipoTarjeta = "Debito";
    String NumTarjeta = "987654321";
    String FechaExpiracion = "19/30";


    public String getTarjeta(){
        return TipoTarjeta;
    }

    public String getNumTarjeta(){
        return NumTarjeta;
    }

    public String getFechaExpiracion(){
        return FechaExpiracion;
    }

    public void usarTarjeta(){
        System.out.println("Chi uwu");
    }

    public void cancelarTarjeta(){
        System.out.println("La tarjeta ah sido cancelada uwu");
    }

}