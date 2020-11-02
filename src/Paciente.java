package clinica;

import javax.swing.JOptionPane;

public class Paciente {


    private String id;
    private String nombre;
    private String apellidos;

    public String generaLineaCSV() {
        return String.format("%s;%s;%s;%s\n", id, nombre, apellidos);
    }


    public Paciente(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;

    }
