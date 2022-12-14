package edu.ifgoiano.example.events.dtos;

import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.RepresentationModel;

public class PlaceDTO extends RepresentationModel<PlaceDTO>
{
    
    @NotBlank
    private String name;
    @NotBlank
    private String capacity;
    @NotBlank
    private String latitude;
    @NotBlank
    private String longitude;

    public PlaceDTO(String name, String latitude, String longitude, String capacity) 
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacity = capacity;
    }

    public PlaceDTO()
    {
        
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(String capacity) 
    {
        this.capacity = capacity;
    }

    public String getLatitude() 
    {
        return latitude;
    }

    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }

    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }
}
