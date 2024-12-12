public class Persona {
    //instance fields.
    String nombre;
    int edad;

    //constructor.
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //toString.
    public String toString(){
        return "Nombre: "+nombre+", Edad: "+edad;
    }

    //Metodo para mostrar informacion.
    public void mostrarInformacion(){
        System.out.println("Informacion de la persona: ");
        System.out.println(this);
    }


}
