# Ejercicio 03 — Monedero (nivel integrador)

## Objetivo

Mantener varias invariantes sin necesitar todavía colecciones.

## Requisitos

1. Crea `Monedero` con tres atributos privados: `saldo`, `totalIngresado` y `totalGastado`.
2. El constructor recibe el saldo inicial, que no puede ser negativo. Ese importe cuenta como parte de `totalIngresado`.
3. `ingresar(double cantidad)` debe aceptar solo cantidades positivas y actualizar saldo y total ingresado.
4. `gastar(double cantidad)` debe aceptar solo cantidades positivas que no superen el saldo. Debe devolver si la operación se realizó y, solo entonces, actualizar saldo y total gastado.
5. Ofrece métodos de consulta, pero ningún setter para cambiar directamente los tres importes.

## Comprobaciones mínimas

Partiendo de 20 €, ingresar 10 € y gastar 8 € debe dejar saldo 22 €, total ingresado 30 € y total gastado 8 €. Comprueba además cero, números negativos y saldo insuficiente; ningún intento inválido debe cambiar los importes.

El historial detallado de movimientos se podrá añadir después de estudiar colecciones.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema03.ejercicios.ejercicio03monedero;
```
