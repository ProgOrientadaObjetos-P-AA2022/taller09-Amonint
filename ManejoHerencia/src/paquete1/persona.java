package paquete1;

public class persona{
    private String nombre;
    private String apellido;
    private String userName;

    public persona(String a, String b, String c) {
        nombre = a;
        apellido = b;
        userName = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUserName(String a) {
        userName = a;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUserName() {
        return userName;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t>> Nombre: %s\n"
                + "\t>> Apellido: %s\n"
                + "\t>> UserName: %s\n",
                 nombre,
                 apellido,
                 userName);
        return cadena;
    }
}
