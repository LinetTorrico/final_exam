package com.dh.project.finalExam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Linet on 22/6/2017.
 */
@Document
public class Buyer {
    @Id
    private String id;

    private String name;
    private String ci;
    private String profession;
    private long cell;

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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public long getCellphone() {
        return cell;
    }

    public void setCellphone(long cellphone) {
        this.cell = cellphone;
    }
}
