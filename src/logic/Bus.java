package logic;

import java.util.HashSet;
import java.util.Set;

public class Bus {

    private Long id;
    private String number;
    private Set drivers = new HashSet();
    private Long routeId;

    public Bus() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set getDrivers() {
        return drivers;
    }

    public void setDrivers(Set drivers) {
        this.drivers = drivers;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }
}
