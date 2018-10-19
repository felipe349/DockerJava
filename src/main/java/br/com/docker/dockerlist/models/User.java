package br.com.docker.dockerlist.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    public Integer id;

    public String email;
    public String password;
}
