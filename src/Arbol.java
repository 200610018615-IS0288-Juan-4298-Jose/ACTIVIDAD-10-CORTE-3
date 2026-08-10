public class Arbol {
Nodo raiz;

//Crea el árbol inicializando su Raíz
 public Arbol(String  Datoraiz){

    this.raiz=new Nodo(Datoraiz);
}

//permite agregar un nuevo nodo hijo conectándolo al nodo padre
public boolean insertar(String datoPadre, String datoNuevo) {
        Nodo padre = buscar(raiz, datoPadre);
        if (padre != null) {
            padre.hijos.add(new Nodo(datoNuevo));
            return true;
        }
        return false;
    }

    private Nodo buscar(Nodo actual, String dato) {
        if (actual.dato.equals(dato)) {
            return actual;
        }
        for (Nodo hijo : actual.hijos) {
            Nodo encontrado = buscar(hijo, dato);
            if (encontrado != null) {
                return encontrado;
            }
        }
        return null;
    }
    public int getAltura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null || nodo.hijos.isEmpty()) {
            return 0;
        }
        int maxAlturaHijos = 0;
        for (Nodo hijo : nodo.hijos) {
            maxAlturaHijos = Math.max(maxAlturaHijos, calcularAltura(hijo));
        }
        return 1 + maxAlturaHijos;
    }public int contarHojas() {
        return contarHojasRecursivo(raiz);
    }

    private int contarHojasRecursivo(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.hijos.isEmpty()) {
            // Componente: Hojas
            return 1;
        }
        int totalHojas = 0;
        for (Nodo hijo : nodo.hijos) {
            totalHojas += contarHojasRecursivo(hijo);
        }
        return totalHojas;
    }
    public void recorridoPreorden(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.dato + " ");
        for (Nodo hijo : nodo.hijos) {
            recorridoPreorden(hijo);
        }
    }
    public void recorridoInorden(Nodo nodo) {
        if (nodo == null) return;
        
        if (!nodo.hijos.isEmpty()) {
            // Visita el primer hijo (rama izquierda equivalente)
            recorridoInorden(nodo.hijos.get(0));
        }
        
        // Visita la raíz (nodo actual)
        System.out.print(nodo.dato + " ");
        
        // Visita el resto de los hijos
        for (int i = 1; i < nodo.hijos.size(); i++) {
            recorridoInorden(nodo.hijos.get(i));
        }
    }
    public void recorridoPostorden(Nodo nodo) {
        if (nodo == null) return;
        
        // Visita primero todos los hijos
        for (Nodo hijo : nodo.hijos) {
            recorridoPostorden(hijo);
        }
        
        // Visita la raíz al final
        System.out.print(nodo.dato + " ");
    }

    public void imprimirGrafica() {
        printNodo("", "", raiz, true);
    }

    private void printNodo(String prefix, String hijoPrefix, Nodo nodo, boolean esUltimo) {
        System.out.println(prefix + (esUltimo ? "└── " : "├── ") + nodo.dato);
        for (int i = 0; i < nodo.hijos.size(); i++) {
            boolean ultimoHijo = (i == nodo.hijos.size() - 1);
            printNodo(hijoPrefix + (esUltimo ? "    " : "│   "), hijoPrefix + (esUltimo ? "    " : "│   "), nodo.hijos.get(i), ultimoHijo);
        }
    }
}

    
