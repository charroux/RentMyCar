package com.example.rentMyCar;

import javax.persistence.*;

@Entity
public class Dates {

    long id;
    String begin;
    String end;
    Car car;

    @OneToOne
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
