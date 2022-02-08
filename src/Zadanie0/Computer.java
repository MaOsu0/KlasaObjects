package Zadanie0;

import java.util.Objects;

public class Computer {
  private String manufacturer;
  private int model;

    public Computer(String manufacturer, int model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return model == computer.model && Objects.equals(manufacturer, computer.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model);
    }

    @Override
    public String toString() {
        return "Producent " + manufacturer + ", model: " + model;
    }
}
