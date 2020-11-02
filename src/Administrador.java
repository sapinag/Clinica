public class Administrador {

    private String nombre;
    private String password;

    public Administrador(String nom, String pass) {
        nombre = nom;
        password = pass;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Administrador) { 
            
            Administrador otroAdmin = (Administrador)objeto;
            
            if (nombre.equals(otroAdmin.nombre) && password.equals(otroAdmin.password))
                return true; 
            else
                return false;
        }
        else 
            return false;
    }

}

