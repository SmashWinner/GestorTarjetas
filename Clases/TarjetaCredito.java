package Clases;
public class TarjetaCredito{

    String TipoTarjeta = "Credito";
    String NumTarjeta = "123456789";
    String FechaExpiracion = "19/25";


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