# Ejercicio 03 — Notificaciones (nivel integrador)

## Objetivo

Diseñar un recorrido polimórfico usando únicamente herencia, antes de estudiar clases abstractas e interfaces.

## Requisitos

1. Crea una superclase concreta `Notificacion` con `destinatario`, `mensaje` y `enviar()`.
2. Crea `NotificacionEmail`, que añada `asunto` y sobrescriba `enviar()`.
3. Crea `NotificacionSms`, que sobrescriba `enviar()` e indique el teléfono destinatario.
4. Guarda objetos de ambos tipos en un `Notificacion[]` y envíalos con un único bucle.
5. Añade después `NotificacionPush`, con un identificador de dispositivo, sin modificar el cuerpo del bucle.
6. No utilices `instanceof` ni condicionales según el canal.

## Comprobación mínima

El mismo bucle debe mostrar un envío por correo, otro por SMS y otro mediante notificación push, ejecutando en cada caso la implementación del objeto real.
