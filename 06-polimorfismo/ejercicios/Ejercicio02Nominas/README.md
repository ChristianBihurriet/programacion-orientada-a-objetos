# Ejercicio 02 — Nóminas (nivel aplicación)

## Objetivo

Usar parámetros y arrays polimórficos sin preguntar por el tipo concreto.

## Requisitos

1. Crea una superclase `Empleado` con `nombre` y `calcularNomina()`.
2. Crea `EmpleadoFijo`, cuya nómina sea su salario mensual, y `EmpleadoPorHoras`, cuya nómina sea `horasTrabajadas × precioHora`.
3. Implementa `calcularGastoTotal(Empleado[] empleados)` y suma el resultado de llamar a `calcularNomina()` sobre cada elemento.
4. El método no puede usar `instanceof`, conversiones ni condicionales según el subtipo.

## Comprobación mínima

Un empleado fijo de 1.500 € y uno que trabaje 20 horas a 15 € deben producir un gasto total de 1.800 €.
