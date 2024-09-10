package com.rent.rent;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class Carrepo {

    private final JdbcClient jdbcClient ;
    Carrepo(JdbcTemplate template,JdbcClient jdbcClient){
        this.jdbcClient=jdbcClient;
    }

    public java.util.List<Car> getcardetails(){
         return jdbcClient.sql("SELECT * FROM CAR").query(
           (req,res)->{
            return new Car(req.getLong("id"),req.getString("imgurl"),req.getString("car_name"),req.getString("gear_type"),req.getInt("seat_no"),req.getInt("price"));
           }
        ).list();
    }
    public void addcar(Car car){
        KeyHolder keyHolder =new GeneratedKeyHolder();
        jdbcClient.sql("INSERT INTO CAR (IMGURL,CAR_NAME,GEAR_TYPE,SEAT_NO,PRICE) VALUES (?,?,?,?,?)")
        .params(car.getImgurl(),car.getCar_name(),car.getGear_type(),car.getSeat_no(),car.getPrice()).update(keyHolder);
    }
    
    
}

