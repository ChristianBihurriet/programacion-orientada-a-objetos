# Ejercicio 01 — Lista de compra (nivel esencial)

## Objetivo

Practicar las operaciones fundamentales de `List` y `ArrayList` con objetos.

## Requisitos

1. Crea `Producto` con `nombre` y `cantidad`.
2. Declara la variable como `List<Producto>` e inicialízala con `new ArrayList<>()`.
3. Añade al menos tres productos.
4. Consulta el primero mediante `get(0)`, muestra todos con `for-each` e informa del tamaño.
5. Elimina un producto concreto y vuelve a mostrar la lista.
6. Antes de consultar por índice, comprueba si la lista está vacía.

## Comprobación mínima

Prueba primero una lista vacía sin provocar `IndexOutOfBoundsException`; después añade tres productos, elimina uno y comprueba que el tamaño final sea 2.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema09.ejercicios.ejercicio01listacompra;
```
