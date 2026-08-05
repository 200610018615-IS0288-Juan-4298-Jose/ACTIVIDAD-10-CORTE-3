import java.util.ArrayList;
import java.util.List;

class Nodo {
    String dato;
    List<Nodo> hijos;

    public Nodo(String dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }
}