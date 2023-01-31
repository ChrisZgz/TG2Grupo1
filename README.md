# TG1Grupo1
## Introducción

    # Estructuras de datos
        Adapter {
            SerieAdapter: Aqui se hacen los modelos para las estadisticas, donde en este caso
            se encontrarían (las ultimas 10 partidas) o (las 10 partidas mas cortas(que menos turnos han tenido))
        }

        Controlers {
            LecturaEscrituraDatos: Esta clase como su nombre indica se ocupa de la recogida de los datos de las partidas
            para poder mostrarlos luego en la parte de estadisticas
            Logica: Aqui se desarrolla todo el codigo que haga que funcione el juego
            Sonidos: En esta clase se encuentran los sonidos a utilizar en la aplicación
            Utilidades: Aqui se encuentran los métodos para comprobar los campos, entre otras cosas
        }

        Modelo {
            Fichas: Esto es el constructor donde se encuentran las variables de las fichas
            Serie: Esto es el constructor donde se encuentran las variables de las estadisticas
        }

        Vista {
            Inicio: Aqui se encuentran las distintas opciones de Inicio de nueva partida y Ver estadísticas
            Juego: Desde donde se podrá jugar al juego (en este caso Tres en Raya)
            MainActivity: Basicamente desde aquí se inicia toda la aplicación y es donde se encuentra el Splash 
        }

        

    #Estructuras de proyecto
        #Actividades
            #(Nicolas Del Amo)
                Se encargará un poco como todos de la programación en general, ademas de buscar
                material para la app (imagenes, recursos, etc..)
                    Recursos / Programación

            #(Daniel Alvaro del Rio)
                Se encargará principalmente de los Adapters y de los modelos
                    Adapters / Programación / Modelos

            #(Christian Martinez - Jefe de Proyecto)
                Se encargará de la interfaz (que se vea fresco)
                    Interfaz / Programación

            #(Miguel Lizaranzu)
                Se encargará de ayudar al jefe de equipo con el diseño de la app
                    Diseño / Programación

        # Controles:
            - 9 Botones que actuarán de tal manera que mostrarán las fichas

        # Lógica de negocio
            - El jugador jugará contra la máquina y dependiendo de como juegue ganará o perderá

    #Descripción del proyecto
        #Descripción general
            Nuestra aplicación empezará con un Splash el cual tratará de un Gif de una partida entera de
            Tres en Raya (no durará mas de 5 segundos), al acabar el Splash, nos llevará automaticamente a la pantalla de Inicio
            desde donde se podrá iniciar una nueva partida o ver unas estadisticas (no se que estadisticas aún xD)
            Al iniciar una partida se activa un cronometro para contar lo que dura la partida (aún no sabemos si lo incluiremos
            en la pantalla o no) y será por turnos como es obvio, el cronometro se detendrá al empatar o al ganar uno de los
            dos jugadores (en caso de no incluirlo gráficamente lo pondremos al acabar la partida).
            Al empatar o acabar la partida se podrá iniciar una nueva partida desde la misma ventana o volver a la pantalla de Inicio

        #Descripción detallada de cada uno
            (Nicolas del amo)
            [Se ocupó de la pantalla de presentación de la aplicación, la cual se trata de un gif
             Después de la base principal del tablero del juego en si (Tres en Raya)
             Y por ultimo la clase adapter con la cual se muestran de forma correcta las estadisticas]

            (Daniel del rio)
            [Se ocupó de toda la parte de Lógica, el funcionamiento del juego, creación de metodos y funcionamiento
            óptimo de la aplicación]

            (Christian martinez)
            [Se ocupó de la búsqueda de las imagenes de las fichas, el tablero y de la interfaz arcade de la aplicación]

            (Miguel Lizaranzu)
            [Se ocupó de la parte de diseño junto al Jefe de equipo, importando la debida fuente de arcade
            y el diseño de los campos de texto, así como los botones]
