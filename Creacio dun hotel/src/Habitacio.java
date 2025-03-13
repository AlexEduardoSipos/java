public class Habitacio {
    private int id_habitacio;
    private String categoria;
    private int llits;
    private boolean ocupada;

    public Habitacio(int id_habitacio, String categoria, int llits) {
        this.id_habitacio = id_habitacio;
        this.categoria = categoria;
        this.llits = llits;
        this.ocupada = false;
    }

    public int getId_habitacio() {
        return id_habitacio;
    }

    public void setId_habitacio(int id_habitacio) {
        this.id_habitacio = id_habitacio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getLlits() {
        return llits;
    }

    public void setLlits(int llits) {
        this.llits = llits;
    }

    public int preuPerNit() {
        switch (categoria.toLowerCase()) {
            case "superluxe": return 200;
            case "luxe": return 100;
            case "normal": return 60;
            default: return 0;
        }
    }

    public String toString() {
        return "Habitació ID: " + id_habitacio +
                ", Categoria: " + categoria +
                ", Llits: " + llits +
                ", Estat: " + (ocupada ? "Ocupada" : "Lliure");
    }
}
