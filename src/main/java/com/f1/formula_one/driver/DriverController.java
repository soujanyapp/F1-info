package com.f1.formula_one.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/drivers")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getDrivers(
            @RequestParam(required = false) String nation,
            @RequestParam(required = false) String constructor,
            @RequestParam(required = false) String driver,
            @RequestParam(required = false) String age) {

        if (constructor != null && nation != null) {
            return driverService.getDriversByNationAndConstructors(nation, constructor);
        } else if (constructor != null) {
            return driverService.getDriversFromConstructor(constructor);
        } else if (nation != null) {
            return driverService.getDriversByNation(nation);
        } else if (driver != null) {
            return driverService.getDriversByName(driver);
        } else {
            return driverService.getDrivers();
        }
    }

    @PostMapping
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
        Driver createdDriver = driverService.addDriver(driver);
        return new ResponseEntity<>(createdDriver, HttpStatus.CREATED);
    }

    @PutMapping("/{driver}")
    public ResponseEntity<Driver> updateDriver(
            @PathVariable String driver,
            @RequestBody Driver updatedDriver) {
        Driver result = driverService.updateDriver(driver, updatedDriver);
        if (result != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{driver}")
    public ResponseEntity<Void> deleteDriver(@PathVariable String driver) {
        if (driverService.getDriversByName(driver).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        driverService.deleteDriver(driver);
        return ResponseEntity.noContent().build();
    }

}
