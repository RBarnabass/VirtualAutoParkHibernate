package dao;

import logic.Bus;
import logic.Driver;
import logic.Route;

import java.util.Collection;
import java.sql.SQLException;

public interface BusDAO {

    void addBus(Bus bus) throws SQLException;

    void updateBus(Long bus_id, Bus bus) throws SQLException;

    Bus getBusById(Long bus_id) throws SQLException;

    Collection getAllBusses() throws SQLException;

    void deleteBus(Bus bus) throws SQLException;

    Collection getBussesByDriver(Driver driver) throws SQLException;

    Collection getBussesByRoute(Route route) throws SQLException;

}