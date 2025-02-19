package Clases;
import java.util.Scanner;


public class Cliente{ 

    String nombre = "pepito";
    int edad = 20;
    boolean esRiesgo = true;

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getEsRiesgo(){
        return esRiesgo;
    }

    
    public void setNombre(String Nombre){
        nombre = Nombre;
    }

    public void setEdad(int Edad){
        edad = Edad;
    }

    public void setRiesgo(String riesgo){
        if (riesgo.equals("si")){
            esRiesgo = true;
        }else{
            esRiesgo = false;        
        }
    }

    public void GuardarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombrel = scanner.nextLine();
        nombre = nombrel;
        System.out.println("Introduce tu edad:");
        int edadl = scanner.nextInt();
        edad = edadl;
        scanner.nextLine();
        System.out.println("Su trabajo es Riesgoso? si/no:");
        String riesgo = scanner.nextLine();
        if (riesgo.equals("si")){
            esRiesgo = true;
        }else{
            esRiesgo = false;        
        }
        scanner.close();
    }
}