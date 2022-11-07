package revature.cars.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import revature.cars.model.Car;
import revature.cars.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car AddCar(@RequestBody Car car) {
        return carService.AddCar(car);
    }

    @GetMapping("/{carId}")
    public Car GetCarById(@PathVariable("carId") int carId) {
        return carService.GetCar(carId);
    }
}
