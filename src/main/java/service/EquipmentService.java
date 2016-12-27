package service;

import equipment.SportsEquipment;

import java.util.List;

public interface EquipmentService {

    SportsEquipment getOne (Integer id);

    List<SportsEquipment> getAll ();

    boolean equipmentAdd (SportsEquipment sportsEquipment);

    boolean equipmentRemove (Integer id);

    public void equipmentUpdate (SportsEquipment sportsEquipment);
}
