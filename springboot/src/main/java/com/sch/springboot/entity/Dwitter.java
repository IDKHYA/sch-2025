package com.sch.springboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Dwitter {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String message;
    private String image;


    @Column(name = "sdate", nullable = true)
    private LocalDateTime sdate;

    @PrePersist // else if를 통해서 지속적으로 뭐가 null값인지 확인해서 실행, 즉 계속 새로 만드는 것이 아님, 여기다 추가하는 방식
    public void prePersist() {
        if (this.sdate == null) {
            this.sdate = LocalDateTime.now();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getSdate() {
        return sdate;
    }


}
