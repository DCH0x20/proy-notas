package com.notas.notas.models;

import java.time.LocalDateTime;

public class Notas {

    public String name , description;
    public Long id;
    public LocalDateTime created , updated;
    public boolean isActive , isDelete;

    

    public Notas(String name, String description, Long id, LocalDateTime created, LocalDateTime updated,
            boolean isActive, boolean isDelete) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.isActive = isActive;
        this.isDelete = isDelete;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getCreated() {
        return created;
    }
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    public LocalDateTime getUpdated() {
        return updated;
    }
    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public boolean isDelete() {
        return isDelete;
    }
    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
