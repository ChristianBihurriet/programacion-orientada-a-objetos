# Ejercicio 03 — Factura (nivel integrador)

## Objetivo

Distinguir los datos almacenados de los valores que conviene calcular mediante métodos.

## Requisitos

1. Crea `Factura` con cliente, concepto, unidades, precio unitario y porcentaje de impuesto.
2. Todos esos datos deben recibirse en el constructor. Unidades y precio deben ser positivos; el impuesto no puede ser negativo.
3. Implementa `calcularBase()`, `calcularImpuesto()` y `calcularTotal()`.
4. La base es unidades × precio unitario; el impuesto es base × porcentaje / 100; el total es base + impuesto.
5. Añade `mostrarFactura()` para mostrar los datos y los tres importes calculados.

## Comprobación mínima

Para 2 unidades de 50 € con un 7 % de impuesto, la base debe ser 100 €, el impuesto 7 € y el total 107 €. No guardes base, impuesto ni total como atributos: deben calcularse a partir del estado del objeto.
