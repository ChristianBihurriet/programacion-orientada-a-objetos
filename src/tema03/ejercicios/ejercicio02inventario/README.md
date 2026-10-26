# Ejercicio 02 — Inventario (nivel aplicación)

## Objetivo

Encapsular el estado y ofrecer operaciones con significado en lugar de setters indiscriminados.

## Requisitos

1. Crea `Articulo` con `codigo` privado e inmutable y `existencias` privadas.
2. El constructor debe rechazar códigos vacíos y existencias iniciales negativas.
3. Ofrece getters de consulta, pero ningún setter para esos atributos.
4. `reponer(int unidades)` debe aceptar únicamente valores positivos.
5. `retirar(int unidades)` debe devolver `true` y descontar el stock si es posible. Si las unidades no son positivas o superan las existencias, debe devolver `false` sin modificar el estado.

## Comprobaciones mínimas

Con 10 unidades, reponer 5 debe dejar 15. Retirar 4 debe dejar 11. Intentar retirar 12 debe fallar y mantener 11.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema03.ejercicios.ejercicio02inventario;
```
