public class Alumno extends Persona{
    //instance fields para alumno.
    int matricula;

    //constructor.
    public Alumno(String nombre, int edad, int matricula){
        //Cuando se usa super no es necesario declarar el tipo, ya se hizo en los parametros del constructor.
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", Edad: "+edad+", Matricula: "+matricula;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del alumno: ");
        System.out.println(this);
    }

    //Metodo estudiar().
    public void estudiar(){
        System.out.println(nombre + "esta estudiando");
    }
}
