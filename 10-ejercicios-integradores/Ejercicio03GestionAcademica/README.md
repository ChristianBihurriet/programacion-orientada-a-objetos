# Proyecto 03 — Gestión académica

## Objetivo

Modelar alumnado, módulos, matrículas y calificaciones distribuyendo correctamente las responsabilidades.

## Reglas del dominio

- Cada `Alumno` tiene un identificador único y un nombre.
- Cada `Modulo` tiene un código único y un nombre.
- Una `Matricula` relaciona exactamente un alumno con un módulo.
- No puede existir más de una matrícula para la misma pareja alumno–módulo.
- Cada matrícula puede guardar varias calificaciones entre 0 y 10, ambos incluidos.
- La media solo existe cuando la matrícula contiene al menos una calificación; nunca debe devolverse una media ficticia de cero para «sin notas».

## Operaciones mínimas

1. Registrar alumnado y módulos rechazando identificadores duplicados.
2. Matricular un alumno en un módulo evitando duplicados.
3. Añadir calificaciones válidas a una matrícula existente.
4. Generar un informe por alumno con sus módulos, notas y medias cuando existan.
5. Generar un informe por módulo con su alumnado matriculado y la media de cada estudiante cuando exista.

## Entrega y comprobaciones

Incluye un diagrama con multiplicidades y explica dónde se protege cada regla. Prueba: alumno sin notas, notas 0 y 10, nota fuera de rango, matrícula duplicada, varios alumnos en un módulo y un alumno matriculado en varios módulos.
