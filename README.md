
# Recipe Compose App
![Recipe App - v2](https://github.com/user-attachments/assets/3770ded5-fc8e-440d-a1b6-f9267c9063d6)

## Descripción del Proyecto

Desarrollar una aplicación de Android utilizando Jetpack Compose que muestre una lista de recetas obtenidas desde una API simulada. La aplicación debe permitir buscar recetas tanto por nombre como por ingredientes. La arquitectura del proyecto seguirá los principios de **MVI (Model-View-Intent)** y se utilizará **mocking** local para simular la API.

## Requisitos

### Funcionalidades Principales

1. **Lista de Recetas**: La aplicación mostrará una lista de recetas mockeadas.
   
2. **Búsqueda**: Implementar una funcionalidad de búsqueda que permita filtrar recetas por nombre y por ingredientes.

## Arquitectura

- **MVI (Model-View-Intent)**: La aplicación se estructurará utilizando el patrón MVI, donde:
  - **Model**: Representa el estado de la UI y los datos.
  - **View**: Se encarga de mostrar la UI y de recibir las interacciones del usuario.
  - **Intent**: Representa las intenciones del usuario y desencadena cambios en el estado del modelo.

## Mocking Local

Para simular la API, se utilizará un enfoque de **mocking local**. Esto permitirá desarrollar y probar la aplicación sin depender de una conexión de red. Se recomienda el uso de bibliotecas como [MockK](https://mockk.io/) o [Mockito](https://site.mockito.org/) para crear los mocks de los datos.

## Tecnologías Utilizadas

- **Kotlin**
- **Jetpack Compose**
- **MVI (Model-View-Intent)**
- **Mocking Local**
- **Mockable.io** (opcional para referencia)

## Estructura del Proyecto

- **Data Layer**: Maneja la obtención de datos mockeados localmente.
- **Domain Layer**: Contiene la lógica de negocio y los modelos de dominio.
- **Presentation Layer**: Implementa la interfaz de usuario utilizando Jetpack Compose y maneja el flujo MVI.

