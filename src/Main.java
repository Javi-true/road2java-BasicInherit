
public class Main {

    //ejemplo basico de metodo static.
    public static void saludar(){
        System.out.println("Bienvenido al sistema universtario");
    }

    public static void main(String[] args){

        Main.saludar();
        Alumno alumno_1 = new Alumno("Javier Trujillo", 29, 20096110);
        alumno_1.mostrarInformacion();
        alumno_1.estudiar();

        Profesor profesor_1 = new Profesor("Arturo Diaz", 55, "Matematicas");
        profesor_1.mostrarInformacion();
        profesor_1.ensenar();

    }
}
