# Proyecto 01 — Biblioteca municipal

## Objetivo

Diseñar una aplicación completa aplicando encapsulamiento, relaciones, polimorfismo cuando sea útil y colecciones.

## Reglas del dominio

- Cada `Ejemplar` tiene un código único, título y estado disponible o prestado.
- Cada `Usuario` tiene un identificador único, nombre y como máximo tres préstamos activos.
- Un `Prestamo` relaciona un ejemplar con un usuario y guarda fecha de préstamo, fecha límite y, cuando corresponda, fecha de devolución.
- La fecha límite está 14 días después de la fecha de préstamo.
- Un préstamo está retrasado cuando sigue activo y su fecha límite es anterior a la fecha de referencia.

## Operaciones mínimas

1. Dar de alta usuarios y ejemplares sin aceptar identificadores o códigos duplicados.
2. Prestar un ejemplar únicamente si está disponible y el usuario no ha alcanzado su límite.
3. Registrar la devolución de un préstamo activo y volver a dejar disponible el ejemplar.
4. Consultar los préstamos activos de un usuario.
5. Listar los préstamos retrasados respecto de una fecha recibida como parámetro.

## Entrega y comprobaciones

Antes del código, incluye un diagrama con multiplicidades y una lista de invariantes. Prueba: alta duplicada, préstamo correcto, ejemplar ya prestado, usuario con tres préstamos, devolución, usuario sin préstamos y al menos un préstamo retrasado. Las fechas pueden representarse con `LocalDate`.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema10.ejercicios.ejercicio01bibliotecamunicipal;
```
