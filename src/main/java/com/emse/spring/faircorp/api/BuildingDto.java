package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.HeaterStatus;

public class BuildingDto {
    private Long id;
    private String name;
    private String roomName;
    private Long roomId;
    public BuildingDto(){}
    public BuildingDto(Building building){

    }
}
