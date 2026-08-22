# Actividad: Árboles (Conceptos, Terminología y Clasificación)

## 1. Clasificación y Justificación del Modelo Implementado
Para esta actividad se ha seleccionado un **Árbol General (N-ario)** modelado mediante programación orientada a objetos en Java. 

* **Justificación:** Se eligió un árbol general debido a su flexibilidad para representar relaciones jerárquicas directas de uno a muchos (como organigramas o estructuras de carpetas) sin la necesidad de aplicar restricciones estrictas de orden numérico o balanceo (como en los Árboles Binarios de Búsqueda o AVL), cumpliendo de manera óptima y sencilla con los requerimientos solicitados en la tarea sobre componentes, relaciones y métricas.

## 2. Terminología Técnica Identificada en el Código
* **Raíz:** El nodo inicial del árbol , que no tiene padres.
* **Nodos Internos:** Nodos que tienen un padre y al menos un hijo.
* **Hojas:** Nodos finales que no tienen descendientes .
* **Relaciones:** Gestionadas mediante referencias directas; cada nodo padre mantiene una lista dinámica (List<Nodo> hijos) que almacena a sus descendientes directos, permitiendo identificar padres, hijos, hermanos, ancestros y descendientes de forma recursiva.
* **Métricas Implementadas:**
  * getAltura(): Calcula la longitud del camino más largo desde la raíz hasta una hoja.
  * contarHojas(): Recorre la estructura sumando los nodos que carecen de hijos.

## 3. Instrucciones de Ejecución
1. Clonar el repositorio.
2. Compilar los archivos fuente (Nodo.java, Arbol.java, Main.java o el archivo único consolidado).
3. Ejecutar la clase Main para visualizar la jerarquía gráfica por consola, el recorrido preorden y el cálculo de métricas.
