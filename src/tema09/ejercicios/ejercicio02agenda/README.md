# Ejercicio 02 — Agenda (nivel aplicación)

## Objetivo

Utilizar igualdad lógica, búsquedas y eliminación segura dentro de una colección.

## Requisitos

1. Crea `Contacto` con `nombre` y `telefono`.
2. Dos contactos son iguales si tienen el mismo teléfono; sobrescribe coherentemente `equals` y `hashCode`.
3. Crea `Agenda` con una `List<Contacto>` privada.
4. `agregar(Contacto contacto)` debe utilizar `contains` y rechazar teléfonos duplicados.
5. `buscarPorNombre(String nombre)` debe devolver el primer contacto coincidente o `null`.
6. `eliminarPorTelefono(String telefono)` debe borrar de forma segura mediante `removeIf` o un iterador, nunca modificando la lista dentro de un `for-each`.

## Comprobaciones mínimas

Añade dos contactos, intenta añadir otro con el teléfono del primero, busca un nombre existente y otro inexistente y elimina uno por teléfono. El duplicado no debe aumentar el tamaño.

## Archivo inicial

Completa [`Main.java`](Main.java) sin eliminar la declaración de paquete:

```java
package tema09.ejercicios.ejercicio02agenda;
```
