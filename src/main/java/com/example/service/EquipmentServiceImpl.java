package com.example.service;

import com.example.equipment.SportsEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.EquipmentRepository;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
    EquipmentRepository repository;

    public SportsEquipment getOne(Integer id) {
        return repository.getOne(id);
    }

    public List<SportsEquipment> getAll() {
        return repository.getAll();
    }

    public boolean equipmentAdd(SportsEquipment sportsEquipment) {
         return repository.equipmentAdd(sportsEquipment);
    }

    public boolean equipmentRemove(Integer id) {
        return repository.equipmentRemove(id);
    }

    public void equipmentUpdate (SportsEquipment sportsEquipment) {
        repository.equipmentUpdate(sportsEquipment);

    }
}
