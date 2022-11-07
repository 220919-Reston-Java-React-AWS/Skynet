package revature.cars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import revature.cars.model.Car;

@Repository
public interface CarDao extends JpaRepository<Car, Integer> {

}
