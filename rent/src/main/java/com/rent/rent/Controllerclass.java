package com.rent.rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000/")
public class Controllerclass {
    
    private final Serviceclass serviceclass;
    @Autowired
    public Controllerclass(Serviceclass serviceclass){
        this.serviceclass=serviceclass;
    }

    @GetMapping("/cardetails")
    public List<Car> getallcar() {
        List<Car> cars= serviceclass.getcardetail();
        return cars;
    }
    @PostMapping("/addcar")
    public String addcar(@RequestBody Car newCar){
        serviceclass.addcars(newCar);
        return "redirect:/cardetails";
    }
    
}
