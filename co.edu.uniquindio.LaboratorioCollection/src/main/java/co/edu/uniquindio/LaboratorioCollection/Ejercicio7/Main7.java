package co.edu.uniquindio.LaboratorioCollection.Ejercicio7;

public class Main7 {

    public static void main(String[] args) {

        Banco banco = new Banco();
        //Clientes normales
        banco.agregarCliente("Pedro ");
        banco.agregarCliente("Maria ");
        banco.agregarCliente("Sandra ");
        banco.agregarCliente("Juan ");
        banco.agregarCliente("Carlos ");

        // clientes atendidos
        banco.atenderPrimeroLista();
        banco.atenderPrimeroLista();

        banco.mostarColaBanco();

        // cliente de urgencia
        banco.agregarClienteUrgente("Carolina ");
        // cliente normal
        banco.agregarCliente("Martin ");

        banco.mostarColaBanco();


    }
}

