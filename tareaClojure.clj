(ns user)

;;Definicion de la funcion hello world
(defn holaMundo []
  ;;Print mensaje Hello World
  (println "Hello World"))
;;Ejecutamos la funcion holaMundo
(holaMundo)

;;Definicion de la funcion argumentosClojure
(defn argumentosClojure []
  ;;Si existen argumentos de la linea de comandos
  (if (seq *command-line-args*)
    ;;Hacemos una secuencia/para cada uno de ellos...
    (doseq [arg *command-line-args*]
      ;;Imprimimos "Argumento: 'el argumento' "
      (println "Argumento: " arg))
    ;;Si no existen argumentos, retornamos un error
    (throw (Exception. "No hay argumentos"))))
;;Ejecutamos la funcion argumentosClojure
(argumentosClojure)

;;Definicion de la funcion inputOutputUsuario
(defn inputOutputUsuario []
  ;;Preguntamos la edad mediante un print
  (println "¿Cuántos años tienes?")
  ;;Capturamos el input del usuario
  (def edad (read-line))
  ;;Damos el output junto a lo capturado anteriormente
  (println "No sabía que tenías" edad "años"))
;;Ejecutamos la funcion inputOutputUsuario
(inputOutputUsuario)

;;Definicion de la funcion escribirArchivoYLeer
(defn escribirArchivoYLeer []
  ;;Escribirmos al archivo el texto "prueba2"
  (spit "Archivo.txt" "prueba2")
  ;;Leemos el archivo.txt
  (slurp "Archivo.txt"))
;;Ejecutamos la funcion escribirArchivoYLeer
(escribirArchivoYLeer)

;;Definicion de la funcion manejoErrores
(defn manejoErrores []
  ;;Inicializamos bloque try/catch
   (try
     ;;Definicion de la variable archivo, que lee el .txt "error.txt"
      (def archivo (slurp "error.txt"))
     ;;Imprimimos el contenido del .txt
      (println archivo)
     ;;Capturamos el error y lo imprimimos
      (catch Exception e (println (str "Error: " (.getMessage e))))))
;;Ejecutamos la funcion manejoErrores
(manejoErrores)

;;Definicion de la funcion networkIO
(defn networkIO []
  ;;Al utilizar slurp hacia una pagina web, inicializamos un request de lectura a la misma
  ;;El contenido se imprime en consola
  (slurp "https://www.google.com"))
;;Ejecutamos la funcion networkIO
(networkIO)