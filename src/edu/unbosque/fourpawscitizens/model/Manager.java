package edu.unbosque.fourpawscitizens.model;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import edu.unbosque.fourpawscitizens.model.dtos.Pet;

import javax.swing.plaf.basic.BasicListUI;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    Pet pet = new Pet();

    public String assignID(){


        return null;
    }
    public static void ExportarCsv(List<Pet> pets){
        String salidaArchivo = "Pet.csv";
        boolean existe = new File(salidaArchivo).exists();

        //si exite el archivo
        if (existe){
            File archivoPet = new File(salidaArchivo);
            archivoPet.delete();
        }
        try{
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ';');

            salidaCSV.write("ID");
            salidaCSV.write("microchip");
            salidaCSV.write("species");
            salidaCSV.write("sex");
            salidaCSV.write("size");
            salidaCSV.write("potentDangerous");
            salidaCSV.write("neighborhood");

            salidaCSV.endRecord();

            for (Pet p :pets){
                salidaCSV.write(p.getId());
                salidaCSV.write(String.valueOf(p.getMicrochip()));
                salidaCSV.write(p.getSpecies());
                salidaCSV.write(p.getSex());
                salidaCSV.write(p.getSize());
                salidaCSV.write(String.valueOf(p.isPotenDangerous()));
                salidaCSV.write(p.getNeighborhood());

                salidaCSV.endRecord();
            }

            salidaCSV.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void ImportarCSV(){
        try{
            List<Pet> pets = new ArrayList<Pet> ();
            CsvReader leerPets = new CsvReader("Pet.csv");
            leerPets.readHeaders();

            while(leerPets.readRecord()){
                String id = leerPets.get(0);
                String microchip = leerPets.get(1);
                String species = leerPets.get(2);
                String sex = leerPets.get(3);
                String size = leerPets.get(4);
                String potentDangerous = leerPets.get(5);
                String neighborhood = leerPets.get(6);

                //  pets.add(new Pet( id,  species,  sex,  size,  neighborhood,  microchip, potentDangerous));

            }
            leerPets.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void leerCsv(){
        ArrayList<ArrayList<String>> datos =  new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("pet.csv");
        try{
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ( (linea = br.readLine())!= null){
                String[] datosDeLinea = linea.split(";");
                ArrayList<String> datosTem = new ArrayList<String>();
                for(String dato : datosDeLinea){
                    datosTem.add(dato);
                }
                datos.add(datosTem);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}