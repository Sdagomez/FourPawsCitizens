package edu.unbosque.fourpawscitizens.model;

import edu.unbosque.fourpawscitizens.model.dtos.Pet;

import java.io.*;
import java.util.ArrayList;

public class Archive {
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    public void OpreacionArchivo(){

    }
    /**
     * Este metodo permite escribir en el archivo .csv
     * <b>pre</b> Tiene que existir el archivo .csv <br>
     * <b>post</b> Se agregaran al archivo .csv<br>
     *
     * @param pets Es el arraylist donde se almacenan los datos del animal
     *                  ingresado
     * @param petscitizens   Es el archivo donde se van a guardar los datos ingresados
     *                  por el usuario
     */
    public void escribirEnArchivo(ArrayList<Pet> pets, File petscitizens) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream(petscitizens));
            salida.writeObject(petscitizens);
            salida.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     *Esye metodo  permite leer el archivo .csv
     *<b>pre</b> Tiene que existir el archivo .csv <br>
     *<b>post</b> Se agregaran al archivo .csv<br>
     * @param petscitizens Es el archivo que contiene toda la informacion agregada
     * @return  pets
     */
    public ArrayList<Pet> leerArchivo(File petscitizens) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        if (petscitizens.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(petscitizens));
                pets = (ArrayList<Pet>) entrada.readObject();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return pets;
    }
        }

