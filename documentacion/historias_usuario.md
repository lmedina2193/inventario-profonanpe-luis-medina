# Historias de usuario

Proyecto: Sistema de Inventario para Profonanpe  
Autor: Luis Medina Quispe  
Rol: Administrador del inventario y desarrollador

# Historias de usuario

Proyecto: Sistema de Inventario para Profonanpe  
Autor: Luis Medina Quispe  
Responsable de todas las historias: Luis Medina Quispe

## HU-01 - Registrar equipo

**RF-01.** Como administrador, quiero registrar un equipo informático, para mantener actualizado el inventario.

**Criterios de aceptación:**
- Con datos válidos, el equipo queda registrado.
- El sistema confirma la operación.

## HU-02 - Solicitar código

**RF-02.** Como administrador, quiero ingresar el código del equipo, para identificarlo de forma única.

**Criterios de aceptación:**
- El sistema solicita el código.
- No permite continuar si está vacío.

## HU-03 - Solicitar tipo

**RF-03.** Como administrador, quiero registrar el tipo de equipo, para conocer qué clase de dispositivo es.

**Criterios de aceptación:**
- El sistema solicita el tipo.
- El tipo queda guardado en el inventario.

## HU-04 - Solicitar marca

**RF-04.** Como administrador, quiero registrar la marca, para identificar al fabricante del equipo.

**Criterios de aceptación:**
- El sistema solicita la marca.
- La marca queda asociada al equipo.

## HU-05 - Solicitar modelo

**RF-05.** Como administrador, quiero registrar el modelo, para conocer las características del equipo.

**Criterios de aceptación:**
- El sistema solicita el modelo.
- El modelo se muestra al listar el equipo.

## HU-06 - Solicitar número de serie

**RF-06.** Como administrador, quiero registrar el número de serie, para identificar físicamente el equipo.

**Criterios de aceptación:**
- El sistema solicita el número de serie.
- No permite registrar un número vacío.

## HU-07 - Estado inicial disponible

**RF-07.** Como administrador, quiero que un equipo nuevo inicie como Disponible, para conocer que puede ser asignado.

**Criterios de aceptación:**
- Todo equipo nuevo queda como Disponible.
- El estado se muestra al listar.

## HU-08 - Área inicial sin asignar

**RF-08.** Como administrador, quiero que un equipo nuevo tenga el área Sin asignar, para indicar que aún no fue ubicado.

**Criterios de aceptación:**
- El área inicial es Sin asignar.
- El valor se muestra en la consulta.

## HU-09 - Responsable inicial sin asignar

**RF-09.** Como administrador, quiero que un equipo nuevo tenga responsable Sin asignar, para indicar que aún no fue entregado.

**Criterios de aceptación:**
- El responsable inicial es Sin asignar.
- El valor se muestra en la consulta.

## HU-10 - Rechazar código vacío

**RF-10.** Como administrador, quiero que el sistema rechace códigos vacíos, para garantizar registros identificables.

**Criterios de aceptación:**
- Un código vacío genera un error.
- El equipo no se registra.

## HU-11 - Rechazar serie vacía

**RF-11.** Como administrador, quiero que el sistema rechace números de serie vacíos, para mantener información completa.

**Criterios de aceptación:**
- Una serie vacía genera un error.
- El equipo no se registra.

## HU-12 - Evitar códigos duplicados

**RF-12.** Como administrador, quiero evitar códigos repetidos, para no duplicar equipos.

**Criterios de aceptación:**
- Un código existente genera un error.
- El nuevo equipo no se agrega.

## HU-13 - Evitar series duplicadas

**RF-13.** Como administrador, quiero evitar números de serie repetidos, para identificar correctamente cada equipo.

**Criterios de aceptación:**
- Una serie existente genera un error.
- El nuevo equipo no se agrega.

## HU-14 - Rechazar separadores inválidos

**RF-14.** Como administrador, quiero rechazar datos con separadores inválidos, para proteger el formato CSV.

**Criterios de aceptación:**
- El sistema detecta el carácter inválido.
- El registro es rechazado.

## HU-15 - Confirmar registro

**RF-15.** Como administrador, quiero recibir un mensaje de confirmación, para saber que el equipo fue registrado.

**Criterios de aceptación:**
- El sistema muestra un mensaje exitoso.
- El equipo aparece en el listado.

## HU-16 - Listar equipos

**RF-16.** Como administrador, quiero listar los equipos, para consultar el inventario completo.

**Criterios de aceptación:**
- El sistema muestra todos los equipos.
- La información aparece ordenada por registro.

## HU-17 - Mostrar código

**RF-17.** Como administrador, quiero ver el código de cada equipo, para identificarlo rápidamente.

**Criterios de aceptación:**
- Cada registro muestra su código.
- El código coincide con el registrado.

## HU-18 - Mostrar datos básicos

**RF-18.** Como administrador, quiero ver tipo, marca y modelo, para conocer los datos principales del equipo.

**Criterios de aceptación:**
- Los tres datos aparecen en el listado.
- Los valores corresponden al equipo.

## HU-19 - Mostrar número de serie

**RF-19.** Como administrador, quiero ver el número de serie, para reconocer físicamente el equipo.

**Criterios de aceptación:**
- La serie aparece en la información.
- La serie coincide con el registro.

## HU-20 - Mostrar asignación

**RF-20.** Como administrador, quiero ver el área y responsable, para conocer quién utiliza cada equipo.

**Criterios de aceptación:**
- El área y responsable aparecen.
- Si no existe asignación, se muestra Sin asignar.

## HU-21 - Mostrar estado

**RF-21.** Como administrador, quiero ver el estado actual, para conocer la disponibilidad del equipo.

**Criterios de aceptación:**
- El estado aparece en el listado.
- El estado coincide con el valor guardado.

## HU-22 - Informar inventario vacío

**RF-22.** Como administrador, quiero recibir un aviso si no hay equipos, para saber que el inventario está vacío.

**Criterios de aceptación:**
- El sistema detecta que no existen registros.
- Muestra un mensaje informativo.

## HU-23 - Buscar por código

**RF-23.** Como administrador, quiero buscar por código, para consultar un equipo específico.

**Criterios de aceptación:**
- El sistema acepta un código.
- Muestra el equipo encontrado.

## HU-24 - Aceptar minúsculas

**RF-24.** Como administrador, quiero buscar códigos en minúsculas, para realizar consultas con mayor facilidad.

**Criterios de aceptación:**
- Una búsqueda en minúsculas encuentra el equipo.
- El resultado es igual al de una búsqueda en mayúsculas.

## HU-25 - Eliminar espacios

**RF-25.** Como administrador, quiero que se eliminen espacios innecesarios, para evitar errores de búsqueda.

**Criterios de aceptación:**
- Los espacios iniciales y finales se ignoran.
- La búsqueda devuelve el resultado correcto.

## HU-26 - Informar código inexistente

**RF-26.** Como administrador, quiero recibir un aviso cuando no exista un código, para saber que la búsqueda no tuvo resultados.

**Criterios de aceptación:**
- El sistema informa que no encontró el código.
- No muestra un equipo incorrecto.

## HU-27 - Mostrar equipo encontrado

**RF-27.** Como administrador, quiero ver todos los datos del equipo encontrado, para revisar su información completa.

**Criterios de aceptación:**
- Se muestran todos sus atributos.
- La información corresponde al código buscado.

## HU-28 - Asignar área

**RF-28.** Como administrador, quiero asignar un equipo a un área, para controlar su ubicación.

**Criterios de aceptación:**
- El área se guarda correctamente.
- El área aparece en consultas posteriores.

## HU-29 - Asignar responsable

**RF-29.** Como administrador, quiero asignar un responsable, para saber quién utiliza el equipo.

**Criterios de aceptación:**
- El responsable se guarda correctamente.
- El responsable aparece en el listado.

## HU-30 - Rechazar área vacía

**RF-30.** Como administrador, quiero impedir áreas vacías, para mantener asignaciones completas.

**Criterios de aceptación:**
- Un área vacía genera un error.
- La asignación anterior se conserva.

## HU-31 - Rechazar responsable vacío

**RF-31.** Como administrador, quiero impedir responsables vacíos, para mantener datos válidos.

**Criterios de aceptación:**
- Un responsable vacío genera un error.
- El equipo no se asigna.

## HU-32 - Bloquear mantenimiento

**RF-32.** Como administrador, quiero impedir asignar equipos en mantenimiento, para evitar entregarlos mientras están reparándose.

**Criterios de aceptación:**
- Un equipo en mantenimiento no se asigna.
- El sistema muestra un mensaje de error.

## HU-33 - Bloquear equipos dados de baja

**RF-33.** Como administrador, quiero impedir asignar equipos dados de baja, para evitar utilizar equipos retirados.

**Criterios de aceptación:**
- Un equipo dado de baja no se asigna.
- El sistema conserva su estado.

## HU-34 - Cambiar a En uso

**RF-34.** Como administrador, quiero que un equipo asignado pase a En uso, para reflejar su utilización.

**Criterios de aceptación:**
- Una asignación válida cambia el estado.
- El listado muestra En uso.

## HU-35 - Cambiar estado

**RF-35.** Como administrador, quiero cambiar el estado de un equipo, para actualizar su situación.

**Criterios de aceptación:**
- El sistema permite seleccionar un nuevo estado.
- El cambio queda guardado.

## HU-36 - Validar estados permitidos

**RF-36.** Como administrador, quiero utilizar solo estados válidos, para mantener consistencia en el inventario.

**Criterios de aceptación:**
- Se aceptan Disponible, En uso, Mantenimiento y Baja.
- Un estado diferente es rechazado.

## HU-37 - Liberar equipo disponible

**RF-37.** Como administrador, quiero limpiar área y responsable al dejar un equipo Disponible, para indicar que está libre.

**Criterios de aceptación:**
- El área cambia a Sin asignar.
- El responsable cambia a Sin asignar.

## HU-38 - Guardar CSV

**RF-38.** Como administrador, quiero guardar el inventario en un archivo CSV, para conservar los datos.

**Criterios de aceptación:**
- El archivo se crea o actualiza.
- Los equipos registrados aparecen en el archivo.

## HU-39 - Cargar CSV

**RF-39.** Como administrador, quiero cargar el inventario al iniciar, para continuar trabajando con los datos anteriores.

**Criterios de aceptación:**
- El sistema lee el archivo existente.
- Los equipos aparecen después de reiniciar.

## HU-40 - Mostrar mensajes

**RF-40.** Como administrador, quiero recibir mensajes claros, para conocer el resultado de cada operación.

**Criterios de aceptación:**
- Las operaciones exitosas muestran confirmación.
- Los errores explican qué debe corregirse.

## Trazabilidad

Todas las historias fueron redactadas individualmente por Luis Medina Quispe y se relacionan directamente con los requerimientos RF-01 a RF-40.