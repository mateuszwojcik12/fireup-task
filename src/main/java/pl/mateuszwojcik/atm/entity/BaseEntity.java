package pl.mateuszwojcik.atm.entity;

import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Getter
public class BaseEntity {

    private String id;

    public BaseEntity() {
        generateId();
    }

    private void generateId() {
        this.id = UUID.randomUUID().toString();
    }

    protected void setId(String id) {
        this.id = id;
    }
}
