package pl.rybczynski.pcstore.application;

import java.util.Arrays;
import java.util.List;

public class Computer {

    private Integer id;
    private String name;
    private double commission;
    private List<Component> components;

    public Computer(Integer id, String name, double commission, List<Component> components) {
        this.id = id;
        this.name = name;
        this.commission = commission;
        this.components = components;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", commission=" + commission +
                ", components=" + Arrays.toString(components.toArray()) +
                '}';
    }
}
