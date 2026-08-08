package com.f1.formula_one.driver;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    @Autowired 
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDrivers(){
        return driverRepository.findAll();
    }

    public List<Driver> getDrivers(String nation, String constructor, String driver, String age){
        if (constructor != null && nation != null) {
            return getDriversByNationAndConstructors(nation, constructor);
        } else if (constructor != null) {
            return getDriversFromConstructor(constructor);
        } else if (nation != null) {
            return getDriversByNation(nation);
        } else if (driver != null) {
            return getDriversByName(driver);
        } else {
            return getDrivers();
        }
    }

    public List<Driver> getDriversFromConstructor(String constructorName){
        if (constructorName == null) return getDrivers();
        return driverRepository.findAll().stream()
                .filter(driver -> driver.getConstructor() != null && 
                        driver.getConstructor().toLowerCase().contains(constructorName.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Driver> getDriversByName(String searchText){
        if (searchText == null) return getDrivers();
        return driverRepository.findAll().stream()
                .filter(driver -> driver.getDriver() != null && 
                        driver.getDriver().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());  
    }

    public List<Driver> getDriversByNation(String searchText){
        if (searchText == null) return getDrivers();
        return driverRepository.findAll().stream()
                .filter(driver -> driver.getNation() != null && 
                        driver.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Driver> getDriversByNationAndConstructors(String nation, String constructor){
        if (nation == null && constructor == null) return getDrivers();
        if (nation == null) return getDriversFromConstructor(constructor);
        if (constructor == null) return getDriversByNation(nation);

        return driverRepository.findAll().stream()
                .filter(driver -> driver.getConstructor() != null && 
                        driver.getConstructor().toLowerCase().contains(constructor.toLowerCase()) &&
                        driver.getNation() != null && 
                        driver.getNation().toLowerCase().contains(nation.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Driver addDriver(Driver driver){
        return driverRepository.save(driver);
    }

    public Driver updateDriver(String driverName, Driver updatedDriver) {
        Optional<Driver> existingDriver = driverRepository.findByDriver(driverName);

        if (existingDriver.isPresent()) {
            Driver driverToUpdate = existingDriver.get();
            if (updatedDriver.getDriver() != null) driverToUpdate.setDriver(updatedDriver.getDriver());
            if (updatedDriver.getConstructor() != null) driverToUpdate.setConstructor(updatedDriver.getConstructor());
            if (updatedDriver.getNation() != null) driverToUpdate.setNation(updatedDriver.getNation());
            if (updatedDriver.getNo() != null) driverToUpdate.setNo(updatedDriver.getNo());
            if (updatedDriver.getAge() != null) driverToUpdate.setAge(updatedDriver.getAge());
            if (updatedDriver.getGp() != null) driverToUpdate.setGp(updatedDriver.getGp());
            if (updatedDriver.getStarts() != null) driverToUpdate.setStarts(updatedDriver.getStarts());
            if (updatedDriver.getLaps() != null) driverToUpdate.setLaps(updatedDriver.getLaps());
            if (updatedDriver.getWins() != null) driverToUpdate.setWins(updatedDriver.getWins());
            if (updatedDriver.getPodiums() != null) driverToUpdate.setPodiums(updatedDriver.getPodiums());
            if (updatedDriver.getPoles() != null) driverToUpdate.setPoles(updatedDriver.getPoles());
            if (updatedDriver.getPens() != null) driverToUpdate.setPens(updatedDriver.getPens());
            if (updatedDriver.getDnf() != null) driverToUpdate.setDnf(updatedDriver.getDnf());
            if (updatedDriver.getFl() != null) driverToUpdate.setFl(updatedDriver.getFl());
            if (updatedDriver.getPts() != null) driverToUpdate.setPts(updatedDriver.getPts());

            return driverRepository.save(driverToUpdate);
        }

        return null;
    }

    @Transactional
    public void deleteDriver(String driverName){
        driverRepository.deleteByDriver(driverName);
    }
}


