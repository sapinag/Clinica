public class Administrador {

    private String nombre;
    private String password;

    public Administrador(String nom, String pass) {
        nombre = nom;
        password = pass;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Administrador) { //Objeto si es clase Administrador
            //Casteamos objeto a Administrador
            Administrador otroAdmin = (Administrador)objeto;
            //Comparamos si coinciden nombre y password
            if (nombre.equals(otroAdmin.nombre) && password.equals(otroAdmin.password))
                return true; //Coinciden ambos, los objetos representan al mismo Administrador
            else
                return false;//Nombre o contraseña no coinciden, son Administradores diferentes.
        }
        else //Objeto a comparar no es de clase Administrador
            return false;
    }

}

