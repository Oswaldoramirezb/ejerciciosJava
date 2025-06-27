package com.monkys.tower.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Un POJO (Plain Old Java Object) es una clase Java simple,
 * que no hereda ni depende de clases específicas
 *
 * Características:
 * - Tiene atributos privados.
 * - Usa getters y setters.
 * - Puede tener un constructor vacío y otro con parámetros.
 * - No contiene lógica de negocio compleja ni anotaciones
 * especiales.
 */

@Entity
@Table(name="categories")
public class Category {

    @Id // El atributo será la clave primaria
    // Indica como se generará automáticamente las claves primarias
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre", length=50, nullable = false )
    private String name;
    @Column(name="description", length=100, nullable = false )
    private String description;

    public Category() {

    }

    public Category(Long id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Category [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", description=");
        builder.append(description);
        builder.append("]");
        return builder.toString();
    }

}