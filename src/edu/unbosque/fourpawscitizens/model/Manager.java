package edu.unbosque.fourpawscitizens.model;

import edu.unbosque.fourpawscitizens.model.dtos.Pet;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Manager extends Component {
    private Pet pet;
    private  Archive archive;
    private PetDao petDao;
    private  File petscitizens = new File("petscitizens.csv");


    public Manager() throws ParseException, IOException {
        petDao = new PetDao();
        archive = new Archive();
        petDao.setPets(archive.leerArchivo(petscitizens));
        int x = 0;

        while (x != 7) {

            System.out.println("----------------------------------------------------------------------------------------- ");
            System.out.println("Bienvenido  a PPDBYBA ");
            System.out.println("Seleccione un numero para una funcionalidad ");
            System.out.println("1. Cargar los datos del archivo ");
            System.out.println("2. Asignar un ID a todas las mascotas ");
            System.out.println("3. Buscar mascota por microchip ");
            System.out.println("4. Contar cuantos animales de una especie hay ");
            System.out.println("5. Buscar animales peligrosos en una zona ");
            System.out.println("6. Buscar animales con parametros (sexo , especie, tamaño y peligro potencial ");
            System.out.println("7. Salir del programa ");
            System.out.println("------------------------------------------------------------------------------------------ ");


            Scanner n = new Scanner(System.in);
            x = n.nextInt();
            if (x == 1) {
                System.out.println("Holaaa ");
                String aux = "";
                String texto = "";
                try {
                    JFileChooser file = new JFileChooser();
                    file.showOpenDialog(this);

                    File abre = file.getSelectedFile();


                    if (abre != null) {
                        FileReader archivos = new FileReader(abre);
                        BufferedReader lee = new BufferedReader(archivos);
                        while ((aux = lee.readLine()) != null) {
                            texto += aux + "\n";
                            System.out.print(texto);
                        }
                        lee.close();
                        System.out.println("El proceso de carga de archivos ha finalizado ");


                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex + "" +
                                    "\nNo se ha encontrado el archivo",
                            "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
                }

            }
            if (x == 2) {
                System.out.println("hola 2 ");
            }
            if (x == 3) {
                System.out.println("Ingrese el MicroChip ");
                Scanner p = new Scanner(System.in);
                long q = p.nextLong();
                long mc = q;

                String informacion = petDao.mostrarAnimal(mc);
                System.out.println(informacion);
            }
            if (x == 4) {
                System.out.println("Ingrese la especie ");
                Scanner o = new Scanner(System.in);
                String  a = o.next();
                String especie = a;

                String informacion = petDao.mostrarInfo(especie);
                System.out.println(informacion);

            }
            if (x == 5) {
                System.out.println("hola 5 ");
            }
            if (x == 6) {
                System.out.println("hola 6 ");
            }
            if (x == 7) {

                System.out.println(" Vuelva Pronto");
                System.exit(0);
            }
        }
    }
}
