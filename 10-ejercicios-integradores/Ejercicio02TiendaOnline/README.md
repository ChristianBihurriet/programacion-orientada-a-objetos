# Proyecto 02 — Tienda en línea

## Objetivo

Construir un proceso de compra completo separando catálogo, carrito, descuentos, pedido y pago.

## Reglas del dominio

- Cada `Producto` tiene código único, nombre, precio positivo y stock no negativo.
- El carrito contiene líneas con un producto y una cantidad positiva; añadir de nuevo el mismo producto debe acumular su cantidad.
- El subtotal es la suma de precio × cantidad de todas las líneas.
- Aplica un descuento del 10 % cuando el subtotal sea igual o superior a 100 €; en caso contrario, el descuento es cero.
- El total es subtotal menos descuento.
- No se puede confirmar un carrito vacío ni uno que solicite más unidades que el stock disponible.
- El stock solo se descuenta cuando el pago se acepta.

## Operaciones mínimas

1. Añadir productos al carrito y mostrar su desglose.
2. Calcular subtotal, descuento y total.
3. Definir un contrato de pago e implementar al menos tarjeta y monedero, cada uno con saldo o límite suficiente o insuficiente.
4. Confirmar el pedido, cobrar mediante el contrato y descontar el stock únicamente si todo es válido.
5. Añadir una tercera forma de pago sin modificar el cálculo del pedido.

## Entrega y comprobaciones

Documenta brevemente las responsabilidades de cada clase. Prueba carrito vacío, stock insuficiente, compra sin descuento, compra con descuento, pago rechazado y pago aceptado. Tras un rechazo, el stock debe permanecer igual.
