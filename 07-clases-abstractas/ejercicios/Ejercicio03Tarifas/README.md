# Ejercicio 03 — Tarifas (nivel integrador)

## Objetivo

Resolver cálculos diferentes mediante una clase abstracta y polimorfismo.

## Requisitos

1. Crea la clase abstracta `TarifaTransporte` con `nombre` y el método abstracto `calcularPrecio(double kilometros)`.
2. Todos los cálculos deben rechazar distancias menores o iguales que cero.
3. `TarifaGuagua`: 1,50 € fijos más 0,10 € por kilómetro.
4. `TarifaTaxi`: 3 € fijos más 0,80 € por kilómetro.
5. `TarifaTren`: 0,20 € por kilómetro, con un precio mínimo de 5 €.
6. Guarda las tres tarifas en un `TarifaTransporte[]`, calcula un viaje de 10 km con cada una y suma el coste total.

## Comprobaciones mínimas

Para 10 km, los precios deben ser 2,50 €, 11 € y 5 € respectivamente; el total debe ser 18,50 €. Una distancia de cero debe rechazarse.
