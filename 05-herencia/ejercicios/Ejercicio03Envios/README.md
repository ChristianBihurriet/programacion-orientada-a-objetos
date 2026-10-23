# Ejercicio 03 — Envíos (nivel integrador)

## Objetivo

Aplicar herencia y sobrescritura con reglas de cálculo concretas.

## Requisitos

1. Crea `Envio` con `codigo`, `pesoKg` y `calcularPrecio()`. El peso debe ser mayor que cero.
2. El envío estándar cuesta `pesoKg × 2` euros.
3. Crea `EnvioRefrigerado`, que añada un suplemento fijo de 5 € al precio estándar.
4. Crea `EnvioUrgente`, cuyo precio sea el precio estándar multiplicado por 1,5.
5. Reutiliza el cálculo de la superclase mediante `super.calcularPrecio()` y marca las sobrescrituras con `@Override`.
6. Muestra el precio de una instancia de cada modalidad.

## Comprobaciones mínimas

Para 10 kg, los precios deben ser 20 € para el estándar, 25 € para el refrigerado y 30 € para el urgente. Comprueba también que un peso de cero se rechaza.
