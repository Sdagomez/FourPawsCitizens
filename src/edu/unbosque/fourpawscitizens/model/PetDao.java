package edu.unbosque.fourpawscitizens.model;

import edu.unbosque.fourpawscitizens.model.dtos.Pet;

import java.util.ArrayList;

public class PetDao {
    private Archive archive;
    private ArrayList<Pet> pets;

    public PetDao() {
        pets = new ArrayList<Pet>();
        archive = new Archive();
    }

    /**
     *Este metodo sirve para mostrar cuantos animales de una especie hay
     *<b>pre</b>   LLenar todos los campos requeridos <b>
     *<b>post</b> muestra la cantidad de animales
     * @param especie es la especie del animal
     * @param pts  es el Arraylist de pets
     * @return contenido
     */
    public String mostrarInfo(String especie, ArrayList<Pet> pts) {
        String contenido = "";
        int m = 0;
        for (Pet pet : pets) {
            if (pet.getSpecies().equals(especie)) {
                m++;

            }
        }
        contenido = "El numero de especies es  " + m;
        return contenido;
    }

    /**
     *Este metodo sirve para mostrar la informacion de un animal por su microchip
     *<b>pre</b>   LLenar todos los campos requeridos <b>
     *<b>post</b> muestra la informacion del animal
     * @param mc es el numero de microchip
     * @param pts  es el Arraylist de pets
     * @return contenido
     */
    public String mostrarAnimal(long mc , ArrayList<Pet> pts) {
        String contenido = "";
        for (Pet pet : pets) {
            if (pet.getMicrochip() == mc) {
                contenido = "ID :" + pet.getId() + "\n" + "Species :" + pet.getSpecies() + "\n" + "Gender :" + pet.getSex() + "\n" + "Size :" + pet.getSize() + "\n" + "Potentially Dangerous  :" + pet.getPotenDangerous() + "\n" + "neighborhood :" + pet.getNeighborhood();

            }
        }
        return contenido;
    }

    /**
     *Este metodo sirve para buscar los animales por localidad
     *<b>pre</b>   LLenar todos los campos requeridos <b>
     *<b>post</b> Busca los animales peligrosos por localidad
     * @param n este es el numero del animal que se quiere coger
     * @param p es de que parte de la lista se quiere tomar el animal
     * @param ngh es el vecindario del animal
     * @param pts es el Arraylist de pets
     * @return contenido
     */
    public String animalesLocalidad(int n, String p, String ngh, ArrayList<Pet> pts) {
        String contenido = "";
        for (Pet pet : pets) {
            if (pet.getNeighborhood().equals(ngh)) {
                contenido = "ID :" + pet.getId() + "\n" + "Species :" + pet.getSpecies() + "\n" + "Gender :" + pet.getSex() + "\n" + "Size :" + pet.getSize() + "\n" + "Potentially Dangerous  :" + pet.getPotenDangerous() + "\n" + "neighborhood :" + pet.getNeighborhood();

            }
        }
        return contenido;
    }


    /**
     *Devuelve archive
     * @return archive
     */
    public Archive getArchive() {
        return archive;
    }

    /**
     *Modifica archive
     * @param archive
     */
    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    /**
     *Devuelve pets
     * @return pets
     */
    public ArrayList<Pet> getPets() {
        return pets;
    }

    /**
     *Modifica pets
     * @param pets
     */
    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
