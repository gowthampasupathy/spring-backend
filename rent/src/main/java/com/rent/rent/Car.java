package com.rent.rent;


import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imgurl;
    private String car_name;
    private String gear_type;
    private int seat_no;
    private int price;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImgurl() {
        return this.imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getCar_name() {
        return this.car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getGear_type() {
        return this.gear_type;
    }

    public void setGear_type(String gear_type) {
        this.gear_type = gear_type;
    }

    public int getSeat_no() {
        return this.seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", imgurl='" + getImgurl() + "'" +
            ", car_name='" + getCar_name() + "'" +
            ", gear_type='" + getGear_type() + "'" +
            ", seat_no='" + getSeat_no() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }


    
}
