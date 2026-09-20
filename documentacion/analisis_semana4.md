# Análisis del proyecto — Semana 4

**Proyecto:** Sistema de inventario de equipos informáticos para Profonanpe  
**Autor:** Luis Medina Quispe  
**Modalidad:** Individual  
**Tipo de solución:** Prototipo académico en Java

## 1. Descripción del problema

Según el caso planteado para este proyecto, el registro de equipos informáticos de Profonanpe se realiza mediante hojas de Excel. Esta forma de trabajo requiere actualizar manualmente los datos de identificación, asignación y estado de cada equipo.

El proyecto propone un prototipo en Java para centralizar estas operaciones y aplicar validaciones que ayuden a prevenir registros duplicados y asignaciones incorrectas.

Las pruebas se realizarán con datos ficticios. El prototipo no constituye una implementación institucional ni representa una validación oficial de los procesos de Profonanpe.

## 2. Organización del trabajo individual

Luis Medina Quispe asume los siguientes roles:

| Rol | Responsabilidad |
|---|---|
| Líder del repositorio y analista de alcance | Definir los objetivos y el alcance, organizar las ramas y consolidar la documentación. |
| Analista de restricciones | Identificar las limitaciones del proyecto y proponer alternativas viables. |
| Analista de requerimientos | Redactar y revisar los 40 requerimientos funcionales. |
| Analista de historias de usuario | Elaborar las 40 historias y sus criterios de aceptación. |

Todos los aportes corresponden al mismo autor. No se atribuyen participaciones ni revisiones a otros integrantes.

## 3. Restricciones y alternativas de solución

| Restricción identificada | Tipo | Alternativa de solución propuesta |
|---|---|---|
| El desarrollo debe ajustarse al tiempo disponible para las actividades académicas. | Tiempo | Implementar primero el registro, consulta, asignación, estados y almacenamiento del inventario. |
| El proyecto debe desarrollarse en Java como parte del curso. | Tecnología | Utilizar clases, métodos y colecciones de la biblioteca estándar de Java. |
| El prototipo utiliza almacenamiento local y no dispone de una conexión institucional configurada. | Tecnología | Guardar y recuperar los datos mediante un archivo CSV. |
| El desarrollo y la documentación son responsabilidad de un solo estudiante. | Recursos | Dividir las actividades en tareas pequeñas y registrar aportes mediante ramas y commits identificables. |
| Para esta práctica no se dispone de un conjunto de datos institucionales autorizado. | Recursos | Preparar datos ficticios representativos para verificar las funciones del sistema. |
| Las reglas del prototipo no han sido validadas formalmente por responsables de Profonanpe. | Negocio | Documentarlas como reglas propuestas y dejar su validación institucional como una actividad futura. |
| El prototipo académico no tiene autorización para modificar los registros oficiales de la organización. | Negocio | Trabajar con un archivo independiente y evitar modificaciones sobre las hojas de Excel institucionales. |

Estas restricciones delimitan una solución académica de uso local. Las decisiones de utilizar consola, CSV y un único operador corresponden al alcance elegido para esta versión.

## 4. Objetivos del proyecto

### 4.1 Objetivo general

Desarrollar un prototipo de inventario en Java que permita registrar, consultar, asignar y actualizar el estado de equipos informáticos, conservando su información en un archivo CSV y verificando sus operaciones mediante pruebas con datos ficticios.

### 4.2 Objetivos específicos

1. Modelar los equipos informáticos mediante clases que representen sus datos de identificación, asignación y estado.
2. Implementar el registro, listado y búsqueda de equipos, validando datos obligatorios y evitando códigos y números de serie duplicados.
3. Controlar la asignación de equipos y los cambios de estado mediante las reglas definidas para el prototipo.
4. Guardar y recuperar la información del inventario mediante un archivo CSV local, comprobando su conservación después de reiniciar el programa.
5. Verificar las funciones principales mediante pruebas de operaciones válidas y entradas incorrectas, documentando los resultados obtenidos.

## 5. Alcance de la solución

### 5.1 Funcionalidades incluidas

- Registro de equipos con código, tipo, marca, modelo y número de serie.
- Validación de datos obligatorios.
- Prevención de códigos y números de serie duplicados.
- Listado de los equipos registrados.
- Búsqueda de equipos por código.
- Consulta de los datos de identificación, área, responsable y estado.
- Asignación de equipos a un área y a un responsable.
- Control de los estados Disponible, En uso, Mantenimiento y Baja.
- Bloqueo de asignaciones de equipos en mantenimiento o dados de baja.
- Liberación del área y responsable cuando un equipo pasa a Disponible.
- Almacenamiento del inventario en un archivo CSV local.
- Recuperación de los datos al iniciar el programa.
- Presentación de mensajes sobre el resultado de las operaciones.
- Pruebas con datos ficticios.

### 5.2 Funcionalidades excluidas

- Conexión con bases de datos institucionales o servicios en la nube.
- Importación automática de archivos Excel.
- Inicio de sesión y administración de contraseñas.
- Permisos diferenciados por usuario.
- Interfaz gráfica con Swing o JavaFX.
- Aplicación web o móvil.
- Acceso simultáneo de varios usuarios.
- Integración con otros sistemas de Profonanpe.
- Reportes estadísticos y gráficos.
- Historial detallado de préstamos, devoluciones o reparaciones.
- Modificación de información institucional real.

### 5.3 Usuarios y roles del sistema

**Administrador del inventario:** operador que registra equipos, consulta información, asigna áreas y responsables y actualiza estados.

Este rol representa al usuario funcional del prototipo. No implica la existencia de autenticación o permisos implementados.

Luis Medina Quispe realizará las pruebas utilizando este rol y asumirá, además, el desarrollo y la documentación del proyecto.

### 5.4 Plataformas y tecnologías

| Elemento | Tecnología o característica |
|---|---|
| Lenguaje | Java |
| Interfaz | Consola |
| Organización | Clases, atributos, métodos y encapsulamiento |
| Colección | ArrayList para almacenar equipos durante la ejecución |
| Persistencia | Archivo local inventario.csv |
| Entornos de desarrollo | Visual Studio Code o NetBeans |
| Plataforma de referencia | Windows |
| Versión de compilación prevista | Java 17 |
| Control de versiones | Git |
| Repositorio remoto | GitHub |

### 5.5 Delimitación

El prototipo permitirá demostrar operaciones básicas de inventario en un equipo local, utilizando datos ficticios. Su entrega académica no implica que esté preparado para sustituir un sistema institucional completo.

Los requerimientos siguientes describen el comportamiento esperado. Su inclusión en este documento no sustituye la verificación mediante pruebas.

## 6. Requerimientos funcionales

Todos los requerimientos tienen como responsable a Luis Medina Quispe.

| ID | Descripción del requerimiento | Prioridad | Responsable |
|---|---|---|---|
| RF-01 | El sistema debe permitir registrar un equipo informático con sus datos de identificación. | Alta | Luis Medina Quispe |
| RF-02 | El sistema debe solicitar el código del equipo durante el registro. | Alta | Luis Medina Quispe |
| RF-03 | El sistema debe solicitar el tipo de equipo durante el registro. | Alta | Luis Medina Quispe |
| RF-04 | El sistema debe solicitar la marca del equipo durante el registro. | Alta | Luis Medina Quispe |
| RF-05 | El sistema debe solicitar el modelo del equipo durante el registro. | Media | Luis Medina Quispe |
| RF-06 | El sistema debe solicitar el número de serie del equipo durante el registro. | Alta | Luis Medina Quispe |
| RF-07 | El sistema debe establecer Disponible como estado inicial de un equipo nuevo. | Alta | Luis Medina Quispe |
| RF-08 | El sistema debe establecer Sin asignar como área inicial de un equipo nuevo. | Alta | Luis Medina Quispe |
| RF-09 | El sistema debe establecer Sin asignar como responsable inicial de un equipo nuevo. | Alta | Luis Medina Quispe |
| RF-10 | El sistema debe rechazar el registro de un equipo cuyo código esté vacío o contenga únicamente espacios. | Alta | Luis Medina Quispe |
| RF-11 | El sistema debe rechazar el registro de un equipo cuyo número de serie esté vacío o contenga únicamente espacios. | Alta | Luis Medina Quispe |
| RF-12 | El sistema debe impedir el registro de un código que ya exista en el inventario. | Alta | Luis Medina Quispe |
| RF-13 | El sistema debe impedir el registro de un número de serie que ya exista en el inventario. | Alta | Luis Medina Quispe |
| RF-14 | El sistema debe rechazar campos de texto que contengan punto y coma o saltos de línea, por ser incompatibles con el formato CSV definido. | Media | Luis Medina Quispe |
| RF-15 | El sistema debe mostrar una confirmación cuando el registro de un equipo termine correctamente. | Media | Luis Medina Quispe |
| RF-16 | El sistema debe listar todos los equipos registrados en el inventario. | Alta | Luis Medina Quispe |
| RF-17 | El sistema debe mostrar el código de cada equipo en el listado. | Alta | Luis Medina Quispe |
| RF-18 | El sistema debe mostrar el tipo, la marca y el modelo de cada equipo en el listado. | Alta | Luis Medina Quispe |
| RF-19 | El sistema debe mostrar el número de serie de cada equipo en el listado. | Alta | Luis Medina Quispe |
| RF-20 | El sistema debe mostrar el área y el responsable de cada equipo en el listado. | Alta | Luis Medina Quispe |
| RF-21 | El sistema debe mostrar el estado actual de cada equipo en el listado. | Alta | Luis Medina Quispe |
| RF-22 | El sistema debe informar cuando se solicite un listado y el inventario esté vacío. | Media | Luis Medina Quispe |
| RF-23 | El sistema debe permitir buscar un equipo mediante su código. | Alta | Luis Medina Quispe |
| RF-24 | El sistema debe realizar la búsqueda por código sin distinguir entre mayúsculas y minúsculas. | Media | Luis Medina Quispe |
| RF-25 | El sistema debe ignorar los espacios iniciales y finales del código ingresado en una búsqueda. | Media | Luis Medina Quispe |
| RF-26 | El sistema debe informar cuando el código buscado no corresponda a un equipo registrado. | Alta | Luis Medina Quispe |
| RF-27 | El sistema debe mostrar código, tipo, marca, modelo, serie, área, responsable y estado del equipo encontrado. | Alta | Luis Medina Quispe |
| RF-28 | El sistema debe permitir establecer el área de un equipo mediante una operación de asignación válida. | Alta | Luis Medina Quispe |
| RF-29 | El sistema debe permitir establecer el responsable de un equipo mediante una operación de asignación válida. | Alta | Luis Medina Quispe |
| RF-30 | El sistema debe rechazar una asignación cuyo campo de área esté vacío o contenga únicamente espacios. | Alta | Luis Medina Quispe |
| RF-31 | El sistema debe rechazar una asignación cuyo campo de responsable esté vacío o contenga únicamente espacios. | Alta | Luis Medina Quispe |
| RF-32 | El sistema debe impedir la asignación de un equipo cuyo estado sea Mantenimiento. | Alta | Luis Medina Quispe |
| RF-33 | El sistema debe impedir la asignación de un equipo cuyo estado sea Baja. | Alta | Luis Medina Quispe |
| RF-34 | El sistema debe cambiar automáticamente el estado de un equipo a En uso después de una asignación válida. | Alta | Luis Medina Quispe |
| RF-35 | El sistema debe permitir actualizar el estado de un equipo registrado cuando se cumplan las reglas de transición definidas. | Alta | Luis Medina Quispe |
| RF-36 | El sistema debe limitar los estados admitidos a Disponible, En uso, Mantenimiento y Baja. | Alta | Luis Medina Quispe |
| RF-37 | El sistema debe restablecer el área y el responsable a Sin asignar cuando un equipo cambie a Disponible. | Alta | Luis Medina Quispe |
| RF-38 | El sistema debe guardar los datos de los equipos en un archivo CSV local. | Alta | Luis Medina Quispe |
| RF-39 | El sistema debe cargar automáticamente los equipos de un archivo CSV válido al iniciar el programa. | Alta | Luis Medina Quispe |
| RF-40 | El sistema debe comunicar el resultado de las operaciones mediante mensajes de confirmación o de error que identifiquen el problema detectado. | Media | Luis Medina Quispe |

### 6.1 Criterio de prioridad

- **Alta:** comportamiento necesario para registrar, consultar, asignar o conservar información consistente del inventario.
- **Media:** comportamiento complementario que facilita la captura de datos o la interpretación del resultado de las operaciones.

Los requerimientos detallan operaciones, datos y validaciones del prototipo. No representan 40 módulos independientes.

## 7. Reglas de negocio propuestas

Estas reglas corresponden al prototipo académico y deberán validarse con la organización antes de una implementación institucional.

1. Cada equipo debe tener un código único.
2. Cada equipo debe tener un número de serie único.
3. Los datos obligatorios no pueden estar vacíos.
4. Un equipo nuevo debe iniciar como Disponible, con área y responsable Sin asignar.
5. Una asignación requiere un área y un responsable válidos.
6. No se permite asignar equipos en Mantenimiento o Baja.
7. Una asignación válida cambia el estado a En uso.
8. El estado En uso requiere que el equipo tenga una asignación válida.
9. Al cambiar a Disponible, el área y el responsable deben quedar Sin asignar.
10. Una operación rechazada debe conservar los datos anteriores del equipo.
11. Los campos no deben contener punto y coma ni saltos de línea que alteren la estructura del CSV.

## 8. Historias de usuario y trazabilidad

Las historias de usuario se encuentran en el archivo:

[Historias de usuario](historias_usuario.md)

Se utiliza una relación directa entre identificadores:

- RF-01 se relaciona con HU-01.
- RF-02 se relaciona con HU-02.
- La numeración continúa hasta RF-40 y HU-40.

Cada historia incluye el rol del usuario, la funcionalidad solicitada, su beneficio y criterios de aceptación.

Luis Medina Quispe es responsable de los 40 requerimientos y de las 40 historias.

## 9. Gestión de evidencias en GitHub

El repositorio del proyecto es:

https://github.com/lmedina2193/inventario-profonanpe-luis-medina

### 9.1 Estado registrado

Las historias de usuario se incorporaron inicialmente mediante el Pull Request #6, fusionado directamente en main.

Esta integración inicial no siguió el paso intermedio por develop solicitado en la guía. Se conserva el historial real del trabajo y se adopta el flujo requerido para los siguientes aportes.

### 9.2 Flujo para completar la documentación

1. Preparar el análisis y las correcciones en feature/luis-documentacion-semana4.
2. Registrar únicamente los documentos correspondientes mediante un commit.
3. Subir la rama a GitHub.
4. Revisar los cambios mediante un Pull Request hacia develop.
5. Integrar la documentación consolidada desde develop hacia main.
6. Capturar el historial final de commits.

Estos pasos se documentarán como realizados únicamente cuando se completen.

### 9.3 Evidencias que se incorporarán al informe

- Tabla de restricciones y alternativas.
- Objetivo general y cinco objetivos específicos.
- Alcance incluido y excluido.
- Tabla de los 40 requerimientos funcionales.
- Historias de usuario con criterios de aceptación.
- Capturas de commits y publicación de la documentación.
- Capturas de las integraciones hacia develop y main.
- Historial final de Git.

## 10. Conclusión

El análisis delimita un prototipo individual de inventario desarrollado en Java. Se identifican sus restricciones, objetivos, alcance y comportamientos esperados mediante 40 requerimientos relacionados con sus historias de usuario.

La documentación servirá como referencia para verificar el programa y organizar las siguientes mejoras, manteniendo la autoría y la trazabilidad del trabajo de Luis Medina Quispe.