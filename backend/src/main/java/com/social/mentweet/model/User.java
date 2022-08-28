package com.social.mentweet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;
@Entity
@Table(name = "User")
public class User {
    @Id
    private UUID id;
    @NotNull
    private String name;

    private String biografy;
    @NotNull
    private String username;
    @NotNull
    private String senha;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiografy() {
        return biografy;
    }

    public void setBiografy(String biografy) {
        this.biografy = biografy;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
