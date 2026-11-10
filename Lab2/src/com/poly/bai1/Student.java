package com.poly.bai1;

public class Student {
    private String id;
    private String name;
    private StudentType type;

    public Student() {
    }
    public Student(String id, String name, StudentType type) {
        this.setId(id);
        this.setName(name);
        this.type = type;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
    public StudentType getType() {
        return type;
    }
    public void setType(StudentType type) {
        if (type != null) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Student type cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", type=" + type + "]";
    }
}
