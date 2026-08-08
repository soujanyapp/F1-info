package com.f1.formula_one.driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String>{

    void deleteByDriver(String driverName);

    Optional<Driver> findByDriver(String driver);
}


