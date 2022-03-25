package com.vexiza.carmanager.component.car;

import com.vexiza.carmanager.controller.car.CarDto;
import com.vexiza.carmanager.repository.car.CarRepository;
import com.vexiza.carmanager.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarComponent {
    @Autowired
    private CarRepository carRepository;


    public List<CarDto> getAllCars(){
        return DataUtils.mapToDtos(this.carRepository.findAll());
    }

    public CarDto getCarById(final Integer id){
        return DataUtils.mapToDto(this.carRepository.getById(id));
    }

}
