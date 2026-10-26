# Ejercicio 01 — Electrodomésticos (nivel esencial)

## Objetivo

Combinar estado y comportamiento común con una operación que cada subtipo debe concretar.

## Requisitos

1. Crea la clase abstracta `Electrodomestico` con `marca` y `potenciaVatios`.
2. Añade constructor, getters, un método concreto `mostrarDescripcion()` y el método abstracto `calcularConsumoEstimado()`.
3. Crea `Lavadora` con `duracionCicloHoras`; su consumo será `potenciaVatios / 1000 × duracionCicloHoras` kWh por ciclo.
4. Crea `Nevera`; su consumo diario será `potenciaVatios / 1000 × 24` kWh.
5. Recorre ambas mediante un `Electrodomestico[]` y muestra descripción y consumo.

## Comprobación mínima

Una lavadora de 2.000 W con ciclo de 1,5 horas consume 3 kWh. Una nevera de 100 W consume 2,4 kWh al día. No debe ser posible escribir `new Electrodomestico(...)`.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema07.ejercicios.ejercicio01electrodomesticos;
```
