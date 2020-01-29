
package ejemplosingleton;


public class EjemploSingleton {


    public static void main(String[] args) {
     
    Persona miPersona;
   miPersona =Persona.getInstance();
   Persona perso=Persona.getInstance();
  miPersona.toString();
  perso.toString();
    }
    
}
