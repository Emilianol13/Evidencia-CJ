import java.util.Random;

public class Admin {
    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    private String usuario;
    private String password;
    private boolean Log;

    //DEFINICIÓN DEL CONSTRUCTOR DE USO DEL SISTEMA
    public Admin() {
    }

    //DEFINICIÓN DE LOS MÉTODOS DE USO DEL SISTEMA
    public void generarCredenciales() {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        usuario = sb.toString();
        sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        password = sb.toString();
    }

    public boolean login(String username, String password) {
        if (this.usuario.equals(username) && this.password.equals(password)) {
            Log = true;
            return true;
        }
        return false;
    }

    public void verificarPermisos() {
        if (Log) {
            System.out.println("Los permisos del administrador son: \n- Visualizar actualizaciones\n- Consultar versión del sistema\n- Dar de baja usuarios");
        } else {
            System.out.println("Inicie sesión para consultar los permisos del sistema.");
        }
    }
}
