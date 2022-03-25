package com.vexiza.carmanager.model.car;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String code;
    private String name;
    private Float intake;
    private Integer maxSpeed;
    private Date purchaseDate;
    private CarType carType;


    public Car(){
        super();
    }

    public Car(String code, String name, Float intake, Integer maxSpeed, Date purchaseDate, CarType carType) {
        this.code = code;
        this.name = name;
        this.intake = intake;
        this.maxSpeed = maxSpeed;
        this.purchaseDate = purchaseDate;
        this.carType = carType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getIntake() {
        return intake;
    }

    public void setIntake(Float intake) {
        this.intake = intake;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", intake=" + intake +
                ", maxSpeed=" + maxSpeed +
                ", purchaseDate=" + purchaseDate +
                ", carType=" + carType +
                '}';
    }
}
