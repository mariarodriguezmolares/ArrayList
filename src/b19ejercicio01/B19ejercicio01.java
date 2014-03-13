package b19ejercicio01;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author mrodriguezmolares
 */
public class B19ejercicio01 {

    public static void main(String[] args) {

        ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
        //Map<String,Alumnos> alumnos = new HashMap<String,Alumnos>;
        Alumnos.introAlumno(alumnos);
        Alumnos.verFor(alumnos);
        Alumnos.verForeach(alumnos);
        Alumnos.verIterator(alumnos);
        Alumnos.verNota(alumnos);
        Alumnos.introAlumno(alumnos);
        Alumnos.verFor(alumnos);
        Alumnos.borraAlumno(alumnos);
        Alumnos.verFor(alumnos);
        Alumnos.consultaAlumno(alumnos);
        Alumnos.ordear(alumnos);
        Alumnos.verFor(alumnos);
    }
}

