package service;

import equipment.SportsEquipment;
import repository.EquipmentRepository;

import java.util.List;


public class EquipmentServiceImpl implements EquipmentService{

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
