package Test;

public class Perro {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Perro)){
            return false;
        }
        Perro perro = (Perro) obj;
        return this.nombre.equals(perro.getNombre());
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
