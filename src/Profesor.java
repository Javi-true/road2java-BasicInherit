public class Profesor extends Persona{
    //instance fields.
    String area;

    //constructor.
    public Profesor(String nombre, int edad, String area){
        super(nombre, edad);
        this.area = area;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", Edad: "+edad+", Area: "+area;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del profesor: ");
        System.out.println(this);
    }

    public void ensenar(){
        System.out.println(nombre + " esta ensenando "+area);
    }
}
