public class Principal {
    public static void main(String[] args) {
        // Creación del árbol con su Raíz
        Arbol miArbol = new Arbol("A (Raíz)");

        // Inserción de nodos (Relaciones: Padre, Hijo, Hermanos)
        miArbol.insertar("A (Raíz)", "B");
        miArbol.insertar("A (Raíz)", "I");

        miArbol.insertar("B", "C");
        miArbol.insertar("B", "H");

        miArbol.insertar("C", "D");
        miArbol.insertar("C", "G");

        
        miArbol.insertar("D", "E");
        miArbol.insertar("D", "F");

        // Mostrar resultados en consola
        System.out.println("=== 1. REPRESENTACIÓN GRÁFICA DEL ÁRBOL ===");
        miArbol.imprimirGrafica();

        System.out.println("\n=== 2. RECORRIDOS ===");
        System.out.print("Preorden:  ");
        miArbol.recorridoPreorden(miArbol.raiz);
        System.out.println();

        System.out.print("Inorden:   ");
        miArbol.recorridoInorden(miArbol.raiz );
        System.out.println();

        System.out.print("Postorden: ");
        miArbol.recorridoPostorden(miArbol.raiz);
        System.out.println();

        System.out.println("\n=== 3. PROPIEDADES Y MÉTRICAS ===");
        System.out.println("Altura del árbol: " + miArbol.getAltura());
        System.out.println("Cantidad de hojas: " + miArbol.contarHojas());
    }
}
