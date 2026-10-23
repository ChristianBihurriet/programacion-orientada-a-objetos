# Ejercicio 03 — Flota (nivel integrador)

## Objetivo

Integrar colecciones, igualdad, búsqueda, eliminación segura y polimorfismo.

## Requisitos

1. Crea la clase abstracta `Vehiculo` con `matricula`, `kilometrosRecorridos`, `fueraDeServicio` y `calcularCoste()`.
2. Dos vehículos se consideran iguales si tienen la misma matrícula; implementa `equals` y `hashCode`.
3. `Coche` calcula `kilometrosRecorridos × 0,10` € y `Camion` calcula `kilometrosRecorridos × 0,25` €.
4. Crea `Flota` con una `List<Vehiculo>` privada y operaciones para añadir sin duplicados, buscar por matrícula y calcular el coste total polimórficamente.
5. `retirarFueraDeServicio()` debe utilizar `removeIf` o un iterador.
6. No uses `instanceof` para calcular costes.

## Comprobaciones mínimas

Añade un coche de 100 km y un camión de 200 km: el coste total debe ser 60 €. Rechaza una matrícula duplicada, encuentra una matrícula existente y elimina únicamente los vehículos marcados fuera de servicio.
