# Ejercicio 02 — Publicaciones (nivel aplicación)

## Objetivo

Reconocer una relación «es un» y separar el estado común del específico.

## Requisitos

1. Crea `Publicacion` con `titulo`, `autor` y un método `describirFormato()`.
2. Crea `PublicacionImpresa`, que añada `numeroPaginas` y sobrescriba la descripción.
3. Crea `PublicacionDigital`, que añada `formatoArchivo` —por ejemplo, PDF o EPUB— y sobrescriba la descripción.
4. Ambos constructores deben inicializar la parte común mediante `super(...)`.
5. Crea una instancia de cada subtipo y muestra sus descripciones.
6. Escribe dos o tres líneas justificando por qué ambas clases «son publicaciones» y qué datos pertenecen a la superclase.

## Comprobación mínima

Las dos descripciones deben incluir título y autor; la impresa debe indicar sus páginas y la digital su formato de archivo.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema05.ejercicios.ejercicio02publicaciones;
```
