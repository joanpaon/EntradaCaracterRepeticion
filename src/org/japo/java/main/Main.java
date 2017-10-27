/* 
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner --- > Entrada de acentos con Windows
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        // Dato a introducir
        char c = '\u0000';

        // Control REPETICION
        // - true  ---> REPETIR
        // - false ---> SALIR
        boolean testOK = true;

        // Bucle
        do {
            // Cuarentena
            try {
                // Entrada dato
                System.out.print("Carácter ...: ");
                c = scn.nextLine().charAt(0);

                // Dato OK ---> SALIR
                testOK = false;
            } catch (Exception e) {
                // Entrada incorrecta
                System.out.println("Error de entrada");
            }
        } while (testOK);

        // Utilizar dato
        System.out.println("---");
        System.out.printf("Carácter ...: %c\n", c);
    }
}
