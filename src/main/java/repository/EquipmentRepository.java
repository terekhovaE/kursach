package repository;


import equipment.SportsEquipment;
import equipment.Weight;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class EquipmentRepository {

    private List<SportsEquipment> sportsEquipments = new ArrayList<SportsEquipment>();

    EquipmentRepository() {

        sportsEquipments.add(new Weight(5, "металл", 10, "ASD"));
    }

    public List<SportsEquipment> getAll() {

        return sportsEquipments;
    }

    public SportsEquipment getOne (Integer id) {
        return sportsEquipments.get(id);
    }

    public boolean equipmentAdd (SportsEquipment sportsEquipment) {

        return sportsEquipments.add(sportsEquipment);
    }

    public boolean equipmentRemove (Integer id) {

        return sportsEquipments.remove(id);
    }

    public void equipmentUpdate (SportsEquipment sportsEquipment) {

        SportsEquipment foundEquipment;
        for (int i=0;i<sportsEquipments.size();i++) {
            if(sportsEquipment.equals(sportsEquipments.get(i))) {
                sportsEquipments.get(i).Update(sportsEquipment);

                break;
            }
        }
    }
}
