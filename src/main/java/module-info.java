module demo {
    requires javafx.controls;
    requires jakarta.persistence;
    requires spring.context;
    requires com.fasterxml.jackson.annotation;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;
    requires spring.beans;
    requires spring.data.jpa;

    opens com.example.demo;
}