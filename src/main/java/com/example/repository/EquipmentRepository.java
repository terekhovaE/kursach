package com.example.repository;


import com.example.equipment.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EquipmentRepository {

    private List<SportsEquipment> sportsEquipments = new ArrayList<SportsEquipment>();

    EquipmentRepository() {

        sportsEquipments.add(new Ball(20, "резина", 50, "POI"));
        sportsEquipments.add(new Bat(5, 25, 85, "Ракетка"));
        sportsEquipments.add(new Fitness("ткань", 40, "QWE"));
        sportsEquipments.add(new Javelin(3, 15, 58, "FGH"));
        sportsEquipments.add(new TennisBall(50, 15, "резина", 9, "Теннис"));
        sportsEquipments.add(new VolleyBall("GHJ", 8, "резина", 20, "TYU"));
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
