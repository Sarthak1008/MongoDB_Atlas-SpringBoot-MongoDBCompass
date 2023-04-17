package com.example.JobPosting.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobpost")
public class Post {
    @Override
    public String toString() {
        return "Post [id=" + id + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs) + "]";
    }
    private String id;
    private String desc;
    private int exp;
    private String[] techs;
    public Post() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public String[] getTechs() {
        return techs;
    }
    public void setTechs(String[] techs) {
        this.techs = techs;
    }
}
