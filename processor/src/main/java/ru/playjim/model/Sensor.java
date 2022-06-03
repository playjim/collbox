package ru.playjim.model;

import java.util.Date;
public class Sensor {
    private Long id;
    private Integer value;
    private Date date;
    private Type type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", value=" + value +
                ", date=" + date +
                ", type=" + type +
                '}';
    }
}
