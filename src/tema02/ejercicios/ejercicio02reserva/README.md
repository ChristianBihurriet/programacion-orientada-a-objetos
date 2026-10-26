# Ejercicio 02 — Reserva (nivel aplicación)

## Objetivo

Utilizar constructores para crear objetos válidos y métodos que modifican o consultan su estado.

## Requisitos

1. Crea `Reserva` con `huesped`, `numeroNoches` y `precioPorNoche`.
2. Su constructor debe recibir los tres datos y rechazar con `IllegalArgumentException` un nombre vacío, un número de noches menor o igual que cero o un precio menor o igual que cero.
3. Implementa `calcularTotal()`, que devuelva noches × precio por noche.
4. Implementa `ampliarEstancia(int nochesAdicionales)`. Debe sumar únicamente cantidades positivas y rechazar las demás.
5. Muestra en `main` el total antes y después de ampliar una reserva.

## Comprobaciones mínimas

Una reserva de 3 noches a 50 € debe costar 150 €. Después de añadir 2 noches debe costar 250 €. Comprueba también que no se puede crear ni ampliar una reserva con cero noches.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema02.ejercicios.ejercicio02reserva;
```
