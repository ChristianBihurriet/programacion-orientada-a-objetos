# Ejercicio 03 — Centro educativo (nivel integrador)

## Objetivo

Combinar varias asociaciones y justificar sus multiplicidades y direcciones de navegación.

## Modelo mínimo

- `Profesor`: nombre.
- `Alumno`: nombre.
- `Modulo`: nombre y referencia al profesor que lo imparte.
- `Grupo`: nombre, lista de alumnos y lista de módulos.
- `CentroEducativo`: nombre y lista de grupos.

## Requisitos

1. Un módulo tiene exactamente un profesor, pero el mismo objeto `Profesor` puede asignarse a varios módulos.
2. Un grupo puede matricular varios alumnos y cursar varios módulos.
3. El centro puede añadir grupos y mostrar un resumen con grupos, alumnado, módulos y profesorado.
4. Las listas deben ser privadas y modificarse mediante operaciones de la clase responsable.
5. No añadas referencias inversas si no son necesarias para mostrar el resumen.
6. Incluye antes del código un diagrama Mermaid con las multiplicidades.

## Comprobación mínima

Crea un centro con un grupo, dos alumnos y dos módulos impartidos por el mismo profesor. El resumen debe mostrar toda esa información.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema04.ejercicios.ejercicio03centroeducativo;
```
