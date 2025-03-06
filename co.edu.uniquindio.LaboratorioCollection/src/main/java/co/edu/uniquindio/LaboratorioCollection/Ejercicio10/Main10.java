package co.edu.uniquindio.LaboratorioCollection.Ejercicio10;

public class Main10 {

    public static void main(String[] args) {


        Empleado empleado1 = new Empleado("Pedro ", "123");
        Empleado empleado2= new Empleado("Julieta ", "122");
        Empleado empleado3 = new Empleado("Sarah ", "124");
        Empleado empleado4= new Empleado("Javier ", "125");
        Empleado empleado5 = new Empleado("Alejandro ", "126");

        Edificio edificio = new Edificio();

        edificio.permitirAcceso(empleado1);
        edificio.permitirAcceso(empleado2);
        edificio.permitirAcceso(empleado3);
        edificio.permitirAcceso(empleado4);
        edificio.permitirAcceso(empleado3);
        edificio.permitirAcceso(empleado5);

        edificio.getCodigosDeAccesos();



    }
}
