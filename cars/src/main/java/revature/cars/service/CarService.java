package revature.cars.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import revature.cars.dao.CarDao;
import revature.cars.model.Car;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public Car AddCar(Car car) {
        return carDao.save(car);
    }

    public Car GetCar(int id) {
        Optional<Car> foundCar = carDao.findById(id);
        if (foundCar.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        } else {
            return foundCar.get();
        }
    }

}
