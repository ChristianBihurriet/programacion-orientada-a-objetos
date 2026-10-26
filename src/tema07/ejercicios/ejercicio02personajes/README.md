# Ejercicio 02 — Personajes (nivel aplicación)

## Objetivo

Compartir una regla común y obligar a cada especialización a implementar su propio cálculo.

## Requisitos

1. Crea la clase abstracta `Personaje` con `nombre` y `puntosVida`, ambos privados.
2. El constructor debe exigir un nombre no vacío y puntos de vida positivos.
3. Implementa `recibirDanio(int cantidad)`: solo acepta cantidades positivas y la vida nunca puede quedar por debajo de cero.
4. Declara `calcularAtaque()` como método abstracto.
5. `Guerrero` tendrá `fuerza` y devolverá `fuerza × 2`.
6. `Mago` tendrá `mana` y devolverá `mana × 3 / 2`.
7. Recorre ambos mediante un `Personaje[]` y muestra sus ataques.

## Comprobaciones mínimas

Un guerrero con fuerza 10 debe atacar con 20 y un mago con 10 de maná con 15. Si un personaje con 30 puntos de vida recibe 50 de daño, debe quedar con cero.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema07.ejercicios.ejercicio02personajes;
```
