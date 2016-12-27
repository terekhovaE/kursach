package controller;


import equipment.SportsEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EquipmentService;
import service.EquipmentServiceImpl;

import java.util.List;

@RequestMapping("/SportEquipment")
@RestController

public class EquipmentController {

    @Autowired
    EquipmentService service;

    @GetMapping(value = "/(id)")
    public SportsEquipment read (@PathVariable Integer id) {
        return service.getOne(id);
    }

    @GetMapping
    public List<SportsEquipment> readAll () {
        return service.getAll();
    }

    @GetMapping(value = "/(addEquipment)")
    public boolean addEquipment (@PathVariable SportsEquipment sportsEquipment) {
        return service.equipmentAdd(sportsEquipment);
    }

    @GetMapping(value = "/(idRemove)")
    public boolean removeEquipment (@PathVariable Integer id) {
        return service.equipmentRemove(id);
    }

    @GetMapping(value = "/(updateEquipment)")
    public void updateEquipment (@PathVariable SportsEquipment sportsEquipment) {
        service.equipmentUpdate(sportsEquipment);
    }
}
