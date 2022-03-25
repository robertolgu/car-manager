package com.vexiza.carmanager.controller.car;


import com.vexiza.carmanager.component.car.CarComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class CarController {

    @Autowired
    private CarComponent carComponent;

    @GetMapping("cars")
    public List<CarDto> getAllCars(){
        return this.carComponent.getAllCars();
    }

    @GetMapping("car/{id}")
    public CarDto getCarById(@PathVariable final Integer id){
        return this.carComponent.getCarById(id);
    }
}
