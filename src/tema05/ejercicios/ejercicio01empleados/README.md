# Ejercicio 01 — Empleados (nivel esencial)

## Objetivo

Compartir estado y comportamiento mediante herencia y sobrescribir una operación.

## Requisitos

1. Crea `Empleado` con `nombre`, `salarioBase`, constructor, getters y `calcularNomina()`, que devuelva el salario base.
2. Crea `EmpleadoFijo`, que herede de `Empleado` y reutilice el cálculo sin cambios.
3. Crea `EmpleadoConComision` con `ventasRealizadas` y `porcentajeComision`.
4. Sobrescribe en `EmpleadoConComision` el cálculo para devolver `salarioBase + ventasRealizadas × porcentajeComision / 100`.
5. Utiliza `super(...)` en los constructores y `@Override` al sobrescribir.

## Comprobación mínima

Un empleado fijo con salario base 1.500 € debe cobrar 1.500 €. Uno con el mismo salario, 2.000 € en ventas y un 5 % de comisión debe cobrar 1.600 €.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema05.ejercicios.ejercicio01empleados;
```
