

package ejemplosingleton;

import java.util.Scanner;


public class Persona {

    static Persona getInstance() {
        launica=new Persona();
        return launica;//To change body of generated methods, choose Tools | Templates.
    }

 
    Scanner sc=new Scanner(System.in);
  private static Persona launica; 
private static String nome;
private int edad;
private String apellido;

    private Persona(String nome, int edad, String apellido) {
        this.nome = nome;
        this.edad = edad;
        this.apellido = apellido;
    }

    private Persona() {
    }

   

public int pedirEdad(){
    System.out.println("edad?");
    int edad=sc.nextInt();
    return edad;
}
public String pedirNombre(){
    System.out.println("nombre?");
    String nome=sc.next();
    return nome;
}
public String pedirApellido(){
    System.out.println("apellido?");
    String apellido=sc.next();
    return apellido;
}

    @Override
    public String toString() {
        System.out.println(launica.pedirApellido()+launica.pedirNombre()+launica.pedirEdad());
        return "Persona{" + "nome=" +nome + ", edad=" + edad + ", apellido=" + apellido + '}';
    }

  
}
