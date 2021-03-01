package edu.unbosque.fourpawscitizens.model.dtos;

public class Pet {
    private String id, species, sex , size, neighborhood;
    private long microchip;
    private boolean potenDangerous;

    public Pet(){

    }

    /**
     *Este es un constructor con 7 parametros
     * <b>pre</b> Lllenar todos los campos requeridos<br>
     * <b>post</b>se añadira la informacion al ArrayList<br>
     * @param id es el ide del animal
     * @param species es la especia del animal
     * @param sex es el sexo del animal
     * @param size es el tamaño del animal
     * @param neighborhood es del vecindario del animal
     * @param microchip es el  numero de microchip del animal
     * @param potenDangerous es si es potencialmente peligroso
     */
    public Pet(String id, String species, String sex, String size, String neighborhood, long microchip, boolean potenDangerous) {
        this.id = id;
        this.species = species;
        this.sex = sex;
        this.size = size;
        this.neighborhood = neighborhood;
        this.microchip = microchip;
        this.potenDangerous = potenDangerous;
    }

    /**
     *Devuelve id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *Modifica id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *Devuelve species
     * @return species
     */
    public String getSpecies() {
        return species;
    }

    /**
     *Modifica species
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     *Devuelve sex
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     *Modifica sex
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *Devuelve size
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     *Modifica size
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *Devuelve neighborhood
     * @return neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     *Modifica neighborhood
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     *Devuelve microchip
     * @return microchip
     */
    public long getMicrochip() {
        return microchip;
    }

    /**
     *Modifica microchip
     * @param microchip
     */
    public void setMicrochip(long microchip) {
        this.microchip = microchip;
    }

    /**
     *Devuelve potenDangerous
     * @return potenDangerous
     */
    public boolean getPotenDangerous() {
        return potenDangerous;
    }

    /**
     *Modifica potenDangerous
     * @param potenDangerous
     */
    public void setPotenDangerous(boolean potenDangerous) {
        this.potenDangerous = potenDangerous;
    }
}
