package co.edu.uniquindio.LaboratorioCollection.Ejercicio13;

public class Main13 {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("Sandra", 1);
        Paciente paciente1 = new Paciente("Jose ", 4);
        Paciente paciente2 = new Paciente("Andres ", 2);
        Paciente paciente3 = new Paciente("Carolina ", 1);
        Paciente paciente4 = new Paciente("Samantha ", 3);


        Hospital hospital = new Hospital();
        hospital.agregarPaciente(paciente);
        hospital.agregarPaciente(paciente1);
        hospital.agregarPaciente(paciente2);
        hospital.agregarPaciente(paciente3);
        hospital.agregarPaciente(paciente4);

        while (!hospital.getCola().isEmpty()) {
            Paciente infpaciente = hospital.getCola().poll();
            System.out.println(infpaciente);

        }

    }
}
