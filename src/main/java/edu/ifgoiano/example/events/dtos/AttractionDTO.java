package edu.ifgoiano.example.events.dtos;

import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.RepresentationModel;

public class AttractionDTO extends RepresentationModel<AttractionDTO>
{
    
    @NotBlank
    private String name;
    @NotBlank
    private String description;
   
    public AttractionDTO(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public AttractionDTO()
    {
        
    }
    
    public String getdescription() 
    {
        return description;
    }

    public void setdescription(String description) 
    {
        this.description = description;
    }

    public String getName() 
    {
        return name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
}
