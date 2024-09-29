# Currency Converter - Conversor de Monedas

Este es mi primer proyecto para Back-End Oracle Alura-Latam que consiste en un programa en Java que permite realizar conversiones entre diferentes monedas utilizando la API de [ExchangeRate API](https://app.exchangerate-api.com/). El programa utiliza principios de Programación Orientada a Objetos (OOP) y sigue un enfoque modular para gestionar las conversiones.

## Características

- Conversión entre diversas monedas:
  - Dólar a Peso Argentino
  - Peso Argentino a Dólar
  - Dólar a Real Brasileño
  - Real Brasileño a Dólar
  - Dólar a Peso Colombiano
  - Peso Colombiano a Dólar
  - Dólar a Colón Costarricense
  - Colón Costarricense a Dólar
- Redondeo a tres decimales en las conversiones.
- Uso de un menú interactivo para elegir el tipo de conversión.
- Manejo de variables de entorno para proteger la clave de API.
- Opción de salir del programa en cualquier momento.

## Pantallas
Esta es la pantalla principal donde despliega los tipos de monedas que he hablitido hasta este momento

![Screenshot 2024-09-29 at 7 14 56 PM](https://github.com/user-attachments/assets/a9ca7a4e-8711-4edd-8f75-3f66c3b26d21)

Esta segunda pantalla es donde el cliente interactua y entra la cantidad que quiere convertir
(Nota. Trate de bajar la cantidad decimales pero  el tipo de conversiones no pude bajar a no menos de cinco digitos)

![Screenshot 2024-09-29 at 7 16 05 PM](https://github.com/user-attachments/assets/4967a6dc-a92e-4c18-9285-2233d4e5ff97)


Despues de dar enter para continuar volveran a la primera pagina hasta que decida salir del programa eligiendo la opción 10.



## Requisitos

Para poder ejecutar este proyecto, necesitas:

- **Java 17** o superior
- **Maven**
- Cuenta en [ExchangeRate API](https://app.exchangerate-api.com/) para obtener una clave de API.
- ejemplo de .env (EXCHANGE_API_KEY=)

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/usuario/currency-converter.git
   cd currency-converter

   ## Versiones

   Esta es la version que se require, agregare en un futuro proximos mas cambios de modena y ademas la posibilidad de poder bajar un Json de las transacciones.
