# Ejercicio 01 — Temperatura (nivel esencial)

## Objetivo

Proteger una invariante mediante un atributo privado y operaciones controladas.

## Requisitos

1. Crea `Temperatura` con un atributo privado `gradosCelsius`.
2. El constructor y `cambiarTemperatura(double nuevaTemperatura)` deben rechazar con `IllegalArgumentException` cualquier valor inferior a −273,15 °C.
3. Añade `getGradosCelsius()` sin crear un setter genérico.
4. Añade `convertirAFahrenheit()`, aplicando `celsius × 9 / 5 + 32`.

## Comprobaciones mínimas

- 0 °C equivalen a 32 °F.
- −273,15 °C es válido.
- −273,16 °C debe rechazarse tanto en el constructor como en la operación de cambio.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema03.ejercicios.ejercicio01temperatura;
```
