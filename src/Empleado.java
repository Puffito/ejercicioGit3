public class Empleado {
    private final String nombre;
    private final int edad;

    Empleado(String name, int edad) {
        nombre = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El empleado " + nombre + " tiene " + edad + " años";
    }
}
