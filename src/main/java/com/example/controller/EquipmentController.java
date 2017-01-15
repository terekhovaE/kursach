package com.example.controller;


import com.example.equipment.SportsEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.service.EquipmentService;

import java.util.List;

@RestController
@RequestMapping("/SportEquipments")
public class EquipmentController {

    @Autowired
    EquipmentService service;

    @GetMapping(value = "/{id}")
    public SportsEquipment read (@PathVariable Integer id) {
        return service.getOne(id);
    }

    @GetMapping
    public List<SportsEquipment> readAll () {
        return service.getAll();
    }

    @PostMapping(value = "/{addEquipment}")
    public boolean addEquipment (@PathVariable SportsEquipment addEquipment) {
        return service.equipmentAdd(addEquipment);
    }

    @PostMapping(value = "/{idRemove}")
    public boolean removeEquipment (@PathVariable Integer idRemove) {
        return service.equipmentRemove(idRemove);
    }

    @PostMapping(value = "/{updateEquipment}")
    public void updateEquipment (@PathVariable SportsEquipment updateEquipment) {
        service.equipmentUpdate(updateEquipment);
    }
}
