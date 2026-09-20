package inventario;

public class Equipo {
    // private protege los datos: se consultan mediante los metodos get.
    private String codigo;
    private String tipo;
    private String marca;
    private String modelo;
    private String serie;
    private String area = "Sin asignar";
    private String responsable = "Sin asignar";
    private String estado = "Disponible";

    public Equipo(String codigo, String tipo, String marca, String modelo, String serie) {
        this.codigo = validarTexto(codigo).toUpperCase(java.util.Locale.ROOT);
        this.tipo = validarTexto(tipo);
        this.marca = validarTexto(marca);
        this.modelo = validarTexto(modelo);
        this.serie = validarTexto(serie).toUpperCase(java.util.Locale.ROOT);
    }

    // El punto y coma y los saltos de linea se reservan para el archivo CSV.
    public static String validarTexto(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Los datos no pueden estar vacios.");
        }
        texto = texto.trim();
        if (texto.contains(";") || texto.contains("\n") || texto.contains("\r")) {
            throw new IllegalArgumentException("No use punto y coma ni saltos de linea.");
        }
        return texto;
    }

    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getSerie() { return serie; }
    public String getArea() { return area; }
    public String getResponsable() { return responsable; }
    public String getEstado() { return estado; }

    public void asignar(String area, String responsable) {
        // Primero validar ambos datos: si uno falla, no cambiar ninguno.
        String nuevaArea = validarTexto(area);
        String nuevoResponsable = validarTexto(responsable);
        this.area = nuevaArea;
        this.responsable = nuevoResponsable;
    }

    public void cambiarEstado(String estado) {
        if (!"Disponible".equals(estado) && !"En uso".equals(estado)
                && !"Mantenimiento".equals(estado) && !"Baja".equals(estado)) {
            throw new IllegalArgumentException("Estado no permitido.");
        }
        this.estado = estado;
    }

    @Override
    public String toString() {
        return codigo + " | " + tipo + " | " + marca + " " + modelo
                + " | Serie: " + serie + " | Area: " + area
                + " | Responsable: " + responsable + " | Estado: " + estado;
    }
}
