# fdaTareaLenguajesProgramacion
Repositorio para la materia de Tendencias en desarollo de aplicaciones para INTEC. Tarea Lenguajes de programación. Profesor Lorenzo Martinez.

### Propósito
Es un lenguaje de propósito general, del dialecto de Lisp.

### Paradigma
Es un lenguaje de paradigma general, pero a su vez multiparadigma.

### Ventajas y desventajas (Características)
⋅⋅⋅ Desarrollo dinámico con una consola de evaluación (en inglés, REPL: read eval print loop).
⋅⋅⋅ Representación de funciones como valores, y preferencia por la recursión y el uso de higher order functions sobre de la iteración basada en efectos secundarios.

⋅⋅⋅ Números de precisión arbitraria, y representación literal de fracciones, generadas en las divisiones no enteras.

⋅⋅⋅ Secuencias con evaluación perezosa (los elementos de la secuencia no se computan hasta que son necesarios, lo que permite representar conjuntos infinitos en potencia).

⋅⋅⋅ Sistema integrado de estructuras de datos persistentes e inmutables.

⋅⋅⋅ Control del estado (conjunto de valores que puede adquirir una entidad en el tiempo) en situaciones de concurrencia a través de sistemas transaccionales, de agentes y mediante bindings locales.

⋅⋅⋅ Interacción con java: al compilarse a bytecode de la JVM, las aplicaciones escritas en Clojure pueden ser fácilmente integradas en servidores de aplicaciones u otros entornos Java con escasa complejidad adicional. Se implementan por defecto todas las interfaces posibles a nivel de clases, estructuras de datos y concurrencia para minimizar los esfuerzos requeridos para conseguir esta portabilidad.

### Implementación
Es un lenguaje interpretado. Corre a través de las maquinas de Java o C# y puede ser compilado a JS.

### Runtime
JVC, CLR, Javascript.

### Plataformas soportadas
Mac y Linux. Está en Alpha para Windows.

### Usuarios notables
Atlassian, Walmart, MailOnline, etc.

### Historia
[Historia](https://download.clojure.org/papers/clojure-hopl-iv-final.pdf)

### Estado
Activo