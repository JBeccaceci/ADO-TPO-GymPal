/*package test;

import static org.junit.Assert.assertTrue;

import entrenamiento.Ejercicio;
import entrenamiento.Entrenamiento;
import enums.ExigenciaMuscular;
import enums.GruposMusculares;
import enums.Sexo;
import objetivo.MantenerFigura;
import socio.Socio;
import org.junit.Test;

public class AppTest {


    @Test
    public void shouldAnswerWithTrue() {
        Ejercicio bancoPlano = new Ejercicio("Banco Plano", GruposMusculares.Pecho, ExigenciaMuscular.Alto, 4, 12, 3, 10);
        Ejercicio bancoInclinado = new Ejercicio("Banco Inclinado", GruposMusculares.Pecho, ExigenciaMuscular.Alto, 4, 12, 3, 10);

        Ejercicio dominada = new Ejercicio("Dominada", GruposMusculares.Espalda, ExigenciaMuscular.Alto, 4, 8, 2, 0);
        Ejercicio sentadilla = new Ejercicio("Sentadilla", GruposMusculares.Piernas, ExigenciaMuscular.Alto, 4, 8, 2, 15);

        Ejercicio pressMilitar = new Ejercicio("Press Militar con Barra", GruposMusculares.Hombros, ExigenciaMuscular.Alto, 4, 8, 2, 10);
        Ejercicio bicepScout = new Ejercicio("Bicep con barra Scout", GruposMusculares.Brazos, ExigenciaMuscular.Alto, 4, 5, 8, 10);

        Ejercicio bicicleta = new Ejercicio("Bicicleta", GruposMusculares.Piernas, ExigenciaMuscular.Bajo, 4, 5, 8, 0);
        Ejercicio cinta = new Ejercicio("Cinta", GruposMusculares.Piernas, ExigenciaMuscular.Bajo, 4, 5, 7, 0);


        //  Entrenamiento para bajar peso (aerobico >= 3)
        Entrenamiento entramientoBajarPeso = new Entrenamiento();
        entramientoBajarPeso.agregarEjercicio(bancoPlano);
        entramientoBajarPeso.agregarEjercicio(bancoInclinado);

        //  Entrenamiento tonificar cuerpo (aerobico <= 4 && ExigenciaMuscular = ALTO)
        Entrenamiento entramientoTonificar = new Entrenamiento();
        entramientoTonificar.agregarEjercicio(dominada);
        entramientoTonificar.agregarEjercicio(sentadilla);

        //  Entrenamiento mantener figura (aerobico >= 2 && aerobico <= 4 && ExigenciaMuscular = MEDIO || ExigenciaMuscular = BAJO)
        Entrenamiento entramientoFigura = new Entrenamiento();
        entramientoFigura.agregarEjercicio(bicicleta);
        entramientoFigura.agregarEjercicio(cinta);

        MantenerFigura figura = new MantenerFigura();
        figura.crearRutina(entramientoFigura);

        Socio socio = new Socio(20, Sexo.Masculino, 1, new MantenerFigura());
        assertTrue( true );
    }


}
*/
