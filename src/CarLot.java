import java.util.HashMap;

public class CarLot {
    private HashMap<Integer, Car> carMap;

    public CarLot() {
        carMap = new HashMap<Integer, Car>();
    }

    public void addCar(Car theCar) {
        carMap.put(carMap.size(), theCar);
    }

    public int getSize() {
        return carMap.size();
    }

    public void removeCar(int index) {
        carMap.remove(index);
    }

    public void printCar(int index) {
        carMap.get(index).printString();
    }

    public void listCars() {
        for (int i = 0; i < carMap.size(); ++i) {
            carMap.get(i).printString();
        }
    }
}
