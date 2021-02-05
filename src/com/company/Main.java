package lambda;
import lambdas.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        public static void print (Persona persona){
            System.out.println(personag);
        }

        public static void Main (String[]args){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("introdueix la data: 00/00/0000");

            lambdas.Persona persona1 = new lambdas.Persona("Dylan", Persona.Genere.HOME, LocalDate.parse("25/12/2002", format));

            lambdas.Persona persona2 = new lambdas.Persona("Marc", lambdas.Persona.Genere.HOME, LocalDate.parse("12/10/1980", format));

            lambdas.Persona persona3 = new lambdas.Persona("Oriol", Persona.Genere.HOME, LocalDate.parse("10/01/1984", format));

            lambdas.Persona persona4 = new lambdas.Persona("Diana", Persona.Genere.DONA, LocalDate.parse("24/04/1974", format));

            lambdas.Persona persona5 = new lambdas.Persona("CARLA", lambdas.Persona.Genere.DONA, LocalDate.parse("24/04/1992", format));

            List<lambdas.Persona> llistaPersones = new ArrayList<>();

            llistaPersones.add(persona1);

            llistaPersones.add(persona2);

            llistaPersones.add(persona3);

            llistaPersones.add(persona4);

            llistaPersones.add(persona5);
        }
    }
}