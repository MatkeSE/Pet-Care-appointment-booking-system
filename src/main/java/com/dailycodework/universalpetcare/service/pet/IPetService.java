package com.dailycodework.universalpetcare.service.pet;

import com.dailycodework.universalpetcare.model.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> savePetsForAppointment(List<Pet> pets);
    Pet updatePet(Pet pet, Long petId);
    void deletePet(Long petId);
    Pet getPetById(Long petId);
}
