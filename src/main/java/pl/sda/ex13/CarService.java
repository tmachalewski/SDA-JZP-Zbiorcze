package pl.sda.ex13;

import pl.sda.ex12.Car;
import pl.sda.ex12.EngineEnum;
import pl.sda.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarService {
    List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public List<Car> listOFCars(){
        return cars;
    }

    public List<Car> carsWithV12Engine(){
        List<Car> output = new ArrayList<>();
        for(Car car : cars){
            if(car.getEngine().equals(EngineEnum.V12)){
                output.add(car);
            }
        }
        return output;
    }

    public List<Car> carsProducedBefore1999(){
        List<Car> output = new ArrayList<>();
        for(Car car : cars){
            if(car.getProductionYear()<1999){
                output.add(car);
            }
        }
        return output;
    }

    public Car returnMostExpensiveCar(List<Car> cars){
        if(cars.isEmpty())
        {
            return null;
        }
        Car max = cars.get(0);
        for(Car car : cars){
            if(car.getPrice()>max.getPrice()){
                max=car;
            }
        }
        return max;
    }

    public Car returnMostExpensiveCar(){
        return returnMostExpensiveCar(cars);
    }


    public Car returnCheapestCar(List<Car> cars){
        if(cars.isEmpty())
        {
            return null;
        }
        Car min = cars.get(0);
        for(Car car : cars){
            if(car.getPrice()<min.getPrice()){
                min=car;
            }
        }
        return min;
    }

    public Car returnCheapestCar(){
        return returnCheapestCar(cars);
    }

    public Car returnCarWith3Manufacturers(){
        for(int i=0; i<cars.size(); i++)
        {
            if(cars.get(i).getManufacturers().size()>=3){
                return cars.get(i);
            }
        }
        return null;
    }

    public List<Car> returnCarsSortedByPrice(boolean ascending)
    {
        List<Car> output = new ArrayList<>();
        List<Car> sortingHelper = new ArrayList<>(cars);
        while(!sortingHelper.isEmpty()){
            Car car;
//            if(ascending)
//            {
//                car = returnCheapestCar(sortingHelper);
//            }
//            else{
//                car = returnMostExpensiveCar(sortingHelper);
//            }
            car = (ascending) ? returnCheapestCar(sortingHelper) : returnMostExpensiveCar(sortingHelper);
            output.add(car);
            sortingHelper.remove(car);
        }
        return output;
    }

    public boolean containsCar(Car car)
    {
        return cars.contains(car);
    }

    public List<Car> carsProducedByManufacturer(Manufacturer man){
        List<Car> output = new ArrayList<>();
        for(Car car : cars){
            if(car.getManufacturers().contains(man)){
                output.add(car);
            }
        }
        return output;
    }

    public List<Car> returnCarsManufactureByManufacturerWithCreationYearsSpecifiedWithComparator(int creationYear, CarServiceComparatorEnum comparator){
        Set<Car> output = new HashSet<>();
        for(Car car : cars){
            for(Manufacturer man : car.getManufacturers())
            {
                switch(comparator){
                    case LESS_THAN:
                        if(man.getCreationYear()<creationYear)
                        {
                            output.add(car);
                        }
                        break;
                    case MORE_THAN:
                        if(man.getCreationYear()>creationYear)
                        {
                            output.add(car);
                        }
                        break;
                    case LESS_OR_EQUAL:
                        if(man.getCreationYear()<=creationYear)
                        {
                            output.add(car);
                        }
                        break;
                    case MORE_OR_EQUAL:
                        if(man.getCreationYear()>=creationYear)
                        {
                            output.add(car);
                        }
                        break;
                    case EQUAL:
                        if(man.getCreationYear()==creationYear)
                        {
                            output.add(car);
                        }
                        break;
                    case DIFFERENT:
                        if(man.getCreationYear()!=creationYear)
                        {
                            output.add(car);
                        }
                        break;
                }

            }

        }
        List<Car> outputList = new ArrayList<>(output);
        return outputList;
    }
}
