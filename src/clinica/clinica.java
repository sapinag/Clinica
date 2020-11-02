package clinica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class TestClinica {

    private static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    private static Scanner teclado = new Scanner(System.in);
    static GestorPacientes pacientes = new GestorPacientes();
    static GestorCita citas = new GestorCita();
    static GestorDoctor doctores = new GestorDoctor();


    public static void main(String[] args) {

        crearAdmins();

        if (validarAcceso()) {
            System.out.println("\nUsuario autorizado\n");
            doctores.nuevoDoctor();
            doctores.modificarDoctor();
            doctores.mostrarDoctores();
            pacientes.nuevoPaciente();
            pacientes.mostrarPacientes();
            pacientes.modificarPaciente();
            pacientes.borrarPaciente();
            citas.nuevoCita();
            citas.mostrarCitas();
            doctores.crearCSV();
            citas.crearCSV();
            pacientes.crearCSV();
        }
        else
            System.out.println("\nUsuario no autorizado.");

        System.out.println("\t\tFIN DE PROGRAMA");

    }