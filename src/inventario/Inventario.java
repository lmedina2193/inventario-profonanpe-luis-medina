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

    public Equipo buscar(String codigo) {
        codigo = Equipo.validarTexto(codigo);
        for (Equipo equipo : equipos) {
            if (equipo.getCodigo().equalsIgnoreCase(codigo)) { return equipo; }
        }
        throw new IllegalArgumentException("No existe un equipo con ese codigo.");
    }

    public void asignar(String codigo, String area, String responsable) {
        Equipo equipo = buscar(codigo);
        if ("Sin asignar".equalsIgnoreCase(Equipo.validarTexto(area))
                || "Sin asignar".equalsIgnoreCase(Equipo.validarTexto(responsable))) {
            throw new IllegalArgumentException("Ingrese un area y un responsable reales de la prueba.");
        }
        if (equipo.getEstado().equals("Baja") || equipo.getEstado().equals("Mantenimiento")) {
            throw new IllegalArgumentException("No se puede asignar un equipo en baja o mantenimiento.");
        }
        equipo.asignar(area, responsable);
        equipo.cambiarEstado("En uso");
    }

    public void cambiarEstado(String codigo, String estado) {
        Equipo equipo = buscar(codigo);
        if ("En uso".equals(estado) && equipo.getResponsable().equals("Sin asignar")) {
            throw new IllegalArgumentException("Primero asigne un responsable mediante la opcion 4.");
        }
        equipo.cambiarEstado(estado);
        // Disponible significa que el equipo queda libre para otra asignacion.
        if ("Disponible".equals(estado)) { equipo.asignar("Sin asignar", "Sin asignar"); }
    }

}
