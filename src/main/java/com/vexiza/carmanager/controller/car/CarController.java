package com.vexiza.carmanager.controller.car;


import com.vexiza.carmanager.repository.car.CarRepository;
import com.vexiza.carmanager.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class CarController {

    @Autowired
    private CarRepository carRepository;


    @GetMapping("cars")
    public List<CarDto> getAllCars(){
        return DataUtils.mapToDtos(this.carRepository.findAll());
    }
}
