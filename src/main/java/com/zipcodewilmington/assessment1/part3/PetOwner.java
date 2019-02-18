package com.zipcodewilmington.assessment1.part3;

import java.security.acl.Owner;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String name;
    public Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.addPet(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.removePet(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.isOwnerOf(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return this.getYoungetPetAge();
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return this.getOldestPetAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return this.getAveragePetAge();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.getNumberOfPets();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.getName();
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.getPets();
    }
}
