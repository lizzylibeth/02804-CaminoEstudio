/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //constantes   
        final double CAMINO = 980.0;

        //variables
        double traslado;
        double jornada;

        //Mensaje    
        try {

            //Pedir desplazamiento diario en km
            System.out.print("Desplazamiento diario (km) ...: ");
            traslado = SCN.nextDouble();

            //Operación
            jornada = CAMINO / traslado;

            //Resultado
            System.out.printf(Locale.ENGLISH,"Días de Clases/Camino ........: %d días%n", (int) jornada < jornada ? (int) jornada + 1 : (int) jornada);

        } catch (Exception e) {

            System.out.println("Error de entrada");
        } finally {

            SCN.nextLine();
        }

    }//main

}//class
