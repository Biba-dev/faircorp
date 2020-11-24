package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Room;


public class RoomDto {
    private Long id;
    private String name;
    private Double currenttmp;


    public RoomDto() {
    }

    public RoomDto(Room room) {

        this.name = room.getName();
        this.id = room.getId();
        this.currenttmp = room.getCurrenttmp();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getCurrenttmp() {
        return currenttmp;
    }
    public void setCurrenttmp(Double currenttmp) {
        this.currenttmp = currenttmp;
    }


    public void setName(String name) {
        this.name = name;
    }


}
