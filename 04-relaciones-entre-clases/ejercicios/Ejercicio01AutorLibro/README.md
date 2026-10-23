# Ejercicio 01 — Autor y libro (nivel esencial)

## Objetivo

Representar una asociación entre dos clases y decidir su dirección.

## Requisitos

1. Crea `Autor` con `nombre` y `nacionalidad`.
2. Crea `Libro` con `titulo` y una referencia a su `Autor`.
3. El constructor de `Libro` debe recibir un autor ya creado.
4. Añade `mostrarFicha()` para mostrar el título y el nombre del autor.
5. Crea un autor y dos libros que hagan referencia al mismo objeto `Autor`.
6. Dibuja antes del código la multiplicidad: un autor puede estar relacionado con varios libros y cada libro tiene exactamente un autor.

No añadas una lista de libros dentro de `Autor`: para este caso de uso solo se necesita navegar desde el libro hasta su autor.

## Comprobación mínima

Las fichas de los dos libros deben mostrar el mismo autor sin duplicar el objeto que lo representa.
