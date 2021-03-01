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

    public String mostrarAnimal(long mc , ArrayList<Pet> pts) {
        String contenido = "";
        for (Pet pet : pets) {
            if (pet.getMicrochip() == mc) {
                contenido = "ID :" + pet.getId() + "\n" + "Species :" + pet.getSpecies() + "\n" + "Gender :" + pet.getSex() + "\n" + "Size :" + pet.getSize() + "\n" + "Potentially Dangerous  :" + pet.getPotenDangerous() + "\n" + "neighborhood :" + pet.getNeighborhood();

            }
        }
        return contenido;
    }

    public String animalesLocalidad(int n, String p, String ngh, ArrayList<Pet> pts) {
        String contenido = "";
        for (Pet pet : pets) {
            if (pet.getNeighborhood().equals(ngh)) {
                contenido = "ID :" + pet.getId() + "\n" + "Species :" + pet.getSpecies() + "\n" + "Gender :" + pet.getSex() + "\n" + "Size :" + pet.getSize() + "\n" + "Potentially Dangerous  :" + pet.getPotenDangerous() + "\n" + "neighborhood :" + pet.getNeighborhood();

            }
        }
        return contenido;
    }



    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
