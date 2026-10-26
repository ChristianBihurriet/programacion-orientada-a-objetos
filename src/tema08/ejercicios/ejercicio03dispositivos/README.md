# Ejercicio 03 — Dispositivos (nivel integrador)

## Objetivo

Combinar varias capacidades mediante interfaces y depender de cada contrato por separado.

## Requisitos

1. Define `Conectable`, `Recargable`, `Imprimible` y `Escaneable`, cada una con una operación representativa.
2. `TelefonoMovil` debe ser conectable y recargable.
3. `ImpresoraMultifuncion` debe ser conectable, imprimible y escaneable.
4. `EscanerPortatil` debe ser recargable y escaneable.
5. Implementa métodos de prueba que reciban por parámetro cada interfaz, por ejemplo `conectarDispositivo(Conectable dispositivo)`.
6. Invoca las capacidades sin usar `instanceof` ni parámetros de las clases concretas.

## Comprobación mínima

Demuestra las cuatro capacidades y que un mismo objeto —la impresora multifunción— puede utilizarse mediante tres tipos de interfaz distintos.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema08.ejercicios.ejercicio03dispositivos;
```
