
       package edu.ejercicios;

import edu.ejercicios.Hijo.ScrumMaster;
import edu.ejercicios.Padre.Empleado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public class Main {



            public  static void imprime(Empleado emp){
                System.out.println("objeto"+emp.obntenerDetalles());


            }
            public static void main(String[] args) {
                Empleado em= new Empleado("Nombre",3500.0);
imprime(em);

                //em.setNombre("Garrido");
                //em.setSueldo(3500.0);
                //System.out.println(em.obntenerDetalles());
                //System.out.println("nombre"+em.getNombre()+"Sueldo"+ em.getSueldo());
                //System.out.println(em.toString());
                ScrumMaster sm= new ScrumMaster("Juan",3500.0,"Informatica");
                imprime(sm);
                //System.out.println(sm.obntenerDetalles());
                //System.out.println(sm.toString());



            }
        }