package inventario;

import java.util.ArrayList;

public class Inventario {
    // Una lista de objetos Equipo. Es facil de recorrer con un for.
    private ArrayList<Equipo> equipos = new ArrayList<>();

    public void registrar(Equipo nuevo) {
        if (nuevo == null) { throw new IllegalArgumentException("Falta el equipo."); }
        for (Equipo equipo : equipos) {
            if (equipo.getCodigo().equalsIgnoreCase(nuevo.getCodigo())) {
                throw new IllegalArgumentException("El codigo ya existe.");
            }
            if (equipo.getSerie().equalsIgnoreCase(nuevo.getSerie())) {
                throw new IllegalArgumentException("La serie ya existe.");
            }
        }
        equipos.add(nuevo);
    }

    public ArrayList<Equipo> listar() {
        // Devuelve una copia de la lista para evitar que se borren sus registros desde fuera.
        return new ArrayList<>(equipos);
    }

    public int cantidad() { return equipos.size(); }

}
