package se.salt.elmira.restserviceaddressbook.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    public Contact(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Contact() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
