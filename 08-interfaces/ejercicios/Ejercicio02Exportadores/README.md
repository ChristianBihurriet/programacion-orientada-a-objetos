# Ejercicio 02 — Exportadores (nivel aplicación)

## Objetivo

Practicar métodos abstractos, `default` y `static` dentro de una interfaz.

## Requisitos

1. Define `Exportador` con `String exportar(String contenido)` y `String getExtension()`.
2. Añade el método `default String nombreArchivo(String nombreBase)`, que devuelva el nombre seguido de la extensión.
3. Añade `static boolean contenidoValido(String contenido)`, que devuelva `false` para `null` o texto vacío.
4. `ExportadorTexto`, con extensión `.txt`, debe devolver el contenido sin cambios. `ExportadorJson`, con extensión `.json`, debe transformar `Hola` en `{"contenido":"Hola"}`.
5. Implementa `mostrarExportacion(Exportador exportador, String contenido)`, sin depender de clases concretas.

## Comprobaciones mínimas

Exporta `Hola` con ambos formatos, genera `informe.txt` e `informe.json` mediante el método `default` y prueba la utilidad estática con texto válido y vacío.
