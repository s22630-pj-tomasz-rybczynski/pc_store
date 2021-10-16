package pl.rybczynski.pcstore.application;

import java.math.BigDecimal;

public class Component {
    private Integer id;
    private String brand;
    private String model;
    private BigDecimal price;
    public ComponentType componentType;

    public Component(Integer id, String brand, String model, BigDecimal price, ComponentType componentType) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.componentType = componentType;
    }

    public Component() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", componentType=" + componentType +
                '}';
    }
}
