package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Component
public class CarDaoImpl implements CarDao {
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1, "Rio", "black"));
        car.add(new Car(2, "Rio", "rose"));
        car.add(new Car(3, "Tesla", "yellow"));
        car.add(new Car(4, "LC", "black"));
        car.add(new Car(5, "Polo", "white"));

    }

    @Override
    public List<Car> show(int id) {

        return car.stream().limit(id).collect(Collectors.toList());

    }


}
