public class Main {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos("Oswalda", 100, 14000.0, "Alto");
        Produccion prod = new Produccion("Emiliana", 101, 11000.0, "Noche");
        Contabilidad cont = new Contabilidad("Christina", 103, 13000.0, "Permanente");
        SoporteTecnico soporte = new SoporteTecnico("Fernanda", 104, 12500.0, "Nivel 2");

        rh.mostrarDatos();
        prod.mostrarDatos();
        cont.mostrarDatos();
        soporte.mostrarDatos();
    }
}