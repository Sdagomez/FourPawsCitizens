package edu.unbosque.fourpawscitizens.model.dtos;

public class Pet {
    private String id, species, sex , size, neighborhood;
    private long microchip;
    private boolean potenDangerous;

    public Pet(){

    }

    public Pet(String id, String species, String sex, String size, String neighborhood, long microchip, boolean potenDangerous) {
        this.id = id;
        this.species = species;
        this.sex = sex;
        this.size = size;
        this.neighborhood = neighborhood;
        this.microchip = microchip;
        this.potenDangerous = potenDangerous;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public long getMicrochip() {
        return microchip;
    }

    public void setMicrochip(long microchip) {
        this.microchip = microchip;
    }

    public boolean isPotenDangerous() {
        return potenDangerous;
    }

    public void setPotenDangerous(boolean potenDangerous) {
        this.potenDangerous = potenDangerous;
    }
}
