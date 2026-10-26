# Ejercicio 02 — Biblioteca (nivel aplicación)

## Objetivo

Practicar una agregación uno-a-muchos y proteger la colección interna.

## Requisitos

1. Crea `Libro` con `titulo` y `autor`.
2. Crea `Biblioteca` con `nombre` y una `List<Libro>` privada inicialmente vacía.
3. `agregarLibro(Libro libro)` debe recibir un libro que ya existe y rechazar valores nulos.
4. `buscarPorTitulo(String titulo)` debe devolver el primer libro cuyo título coincida, o `null` si no existe.
5. `mostrarCatalogo()` debe recorrer y mostrar los libros.
6. No proporciones un getter que entregue directamente la lista mutable.

## Comprobaciones mínimas

Crea dos libros antes de la biblioteca, agrégalos, muestra el catálogo y prueba una búsqueda existente y otra inexistente. Los libros deben poder existir independientemente de la biblioteca.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema04.ejercicios.ejercicio02biblioteca;
```
