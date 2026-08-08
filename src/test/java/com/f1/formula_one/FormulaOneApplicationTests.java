package com.f1.formula_one;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.f1.formula_one.driver.Driver;
import com.f1.formula_one.driver.DriverController;
import com.f1.formula_one.driver.DriverService;

@SpringBootTest
class FormulaOneApplicationTests {

	@Autowired
	private DriverService driverService;

	@Autowired
	private DriverController driverController;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(driverService);
		Assertions.assertNotNull(driverController);
	}

	@Test
	void testGetDrivers() {
		List<Driver> drivers = driverService.getDrivers(null, null, null, null);
		Assertions.assertNotNull(drivers);
	}

	@Test
	void testGetDriversByNation() {
		List<Driver> drivers = driverService.getDrivers(null, "GBR", null, null);
		Assertions.assertNotNull(drivers);
	}
}


