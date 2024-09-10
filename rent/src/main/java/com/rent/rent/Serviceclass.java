package com.rent.rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Serviceclass {
    private final Carrepo carrepo;

    @Autowired
    public Serviceclass(Carrepo carrepo){
        this.carrepo=carrepo;
    }

    public List<Car> getcardetail(){
        return carrepo.getcardetails();
    }
    public void addcars(Car car){
        carrepo.addcar(car);
    }

}

