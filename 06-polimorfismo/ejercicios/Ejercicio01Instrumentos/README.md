# Ejercicio 01 — Instrumentos (nivel esencial)

## Objetivo

Observar la diferencia entre el tipo declarado y el tipo real.

## Requisitos

1. Crea una superclase `Instrumento` con `tocar()`.
2. Crea `Guitarra` y `Piano`; cada clase debe sobrescribir `tocar()` con un mensaje diferente.
3. Guarda al menos una instancia de cada subtipo en un `Instrumento[]`.
4. Recorre el array y llama únicamente a `tocar()` mediante la variable de tipo `Instrumento`.
5. No utilices `instanceof` ni condicionales para decidir qué sonido ejecutar.

## Comprobación mínima

El recorrido debe producir mensajes diferentes. Explica en un comentario que el compilador comprueba que `tocar()` existe en `Instrumento` y la JVM selecciona la implementación según el objeto real.
