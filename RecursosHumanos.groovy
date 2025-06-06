public class RecursosHumanos extends Empleado {
    private String nivelAcceso;

    public RecursosHumanos(String nombre, int idEmpleado, double sueldo, String nivelAcceso) {
        super(nombre, idEmpleado, sueldo);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() { return nivelAcceso; }
    public void setNivelAcceso(String nivelAcceso) { this.nivelAcceso = nivelAcceso; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" | Area: Recursos Humanos | Nivel Acceso: " + nivelAcceso);
    }
}