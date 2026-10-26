# Ejercicio 02 — Semáforo (nivel aplicación)

## Objetivo

Practicar cómo cada objeto conserva y modifica su propio estado.

## Requisitos

1. Crea una clase `Semaforo` con un atributo `estado` de tipo `String`.
2. Al crear un semáforo, asigna `"verde"` como estado inicial.
3. Añade un método `avanzar()` que cambie el estado siguiendo siempre este ciclo: verde → amarillo → rojo → verde.
4. Añade un método `mostrarEstado()` que muestre el estado actual.
5. En `main`, crea dos semáforos. Haz avanzar el primero una vez y el segundo dos veces.

## Comprobación mínima

Al finalizar, el primer semáforo debe estar en amarillo y el segundo en rojo. Avanzar uno no debe modificar el estado del otro.

En este ejercicio se evalúan clases, objetos, atributos, métodos e independencia entre instancias. El encapsulamiento con `private` se estudiará en el tema 3, por lo que todavía no es obligatorio.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema01.ejercicios.ejercicio02semaforo;
```
