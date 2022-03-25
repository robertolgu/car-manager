package com.vexiza.carmanager.utils;

import com.vexiza.carmanager.controller.car.CarDto;
import com.vexiza.carmanager.model.car.Car;

import java.util.List;
import java.util.stream.Collectors;

public class DataUtils {

    public static CarDto mapToDto(Car car){
        return new CarDto(car.getId(), car.getCode(), car.getName(), car.getIntake(), car.getMaxSpeed(), car.getPurchaseDate(), car.getCarType());
    }

    public static List<CarDto> mapToDtos(List<Car> cars){
        return cars.stream().map(c -> mapToDto(c)).collect(Collectors.toList());
    }

    public static Car mapToEntity(CarDto dto){
        return new Car(dto.getCode(), dto.getName(), dto.getIntake(), dto.getMaxSpeed(), dto.getPurchaseDate(), dto.getCarType());
    }

}
