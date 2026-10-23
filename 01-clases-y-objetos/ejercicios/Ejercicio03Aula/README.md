# Ejercicio 03 — Aula (nivel integrador)

## Objetivo

Aplicar clases, objetos, atributos y métodos sin utilizar todavía colecciones ni relaciones entre varias clases.

## Requisitos

1. Crea una clase `Aula` con los atributos `nombre`, `capacidad` y `numeroOcupantes`.
2. Añade `boolean quedanPlazas()`, que devuelva `true` cuando `numeroOcupantes` sea menor que `capacidad`.
3. Añade `boolean ocuparPlaza()`. Si queda sitio, debe aumentar en uno el número de ocupantes y devolver `true`; si está llena, no debe modificarlo y debe devolver `false`.
4. Añade `mostrarResumen()`, que muestre el nombre, la ocupación y la capacidad.
5. En `main`, crea un aula de capacidad 2 y prueba su evolución desde vacía hasta completa.

## Comprobaciones mínimas

- Vacía: quedan plazas.
- Con una persona: queda exactamente una plaza.
- Con dos personas: está completa.
- Un tercer intento de ocupación se rechaza y el número de ocupantes continúa siendo 2.

Utiliza un contador de ocupantes; no crees todavía una clase `Persona` ni uses arrays o listas.
