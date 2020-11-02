package clinica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public final class GestorPacientes {

    private ArrayList<Paciente> pacientes;

    public void crearCSV() {

        File archivo = new File("C:/csv/pacientes.csv");

        try {
    
            if (!archivo.exists()) {
                File carpeta = archivo.getParentFile();
                carpeta.mkdirs();
                archivo.createNewFile();
            }

            FileWriter escritor = new FileWriter(archivo);

            escritor.append("#ID;Nombre;Apellidos\n");

            for (Paciente doc: pacientes)
                escritor.append(doc.generaLineaCSV());

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
        }
    }
