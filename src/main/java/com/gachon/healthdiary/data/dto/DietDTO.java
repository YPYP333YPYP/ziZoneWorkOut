package com.gachon.healthdiary.data.dto;

public class DietDTO {
    private Long id;
    private String name;
    private String description;
    private Float calorie;

    public DietDTO(Long id, String name, String description, float calorie) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.calorie = calorie;
    }

    public DietDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Float getCalorie(){
        return calorie;
    }

    public void setCalorie(Float calorie){
        this.calorie = calorie;
    }
}
