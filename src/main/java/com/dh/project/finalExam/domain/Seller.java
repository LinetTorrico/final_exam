package com.dh.project.finalExam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Linet on 22/6/2017.
 */
@Document
public class Seller {
    @Id
    private String id;
    private String name;
    private long age;
    private long ci;
    private long numCarsOfSold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public long getNumCarsSold() {
        return numCarsOfSold;
    }

    public void setNumCarsSold(long numCarsSold) {
        this.numCarsOfSold = numCarsSold;
    }
}
