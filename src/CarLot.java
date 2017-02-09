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

    public void getCar(int index) {
        carMap.get(index).printString();
    }
    
    public void removeCar(int index) {
        carMap.remove(index);

        // pushes everything after that index to the left
        while (index < carMap.size()) {
            carMap.put(index, carMap.get(index + 1));
            index += 1;
        }

        // last key will have a duplicate so delete the last item in map
        carMap.remove(carMap.size() - 1);

        System.out.println("size " + carMap.size());
    }

    public void replaceCar(int index, Car newCar) {
        carMap.put(index, newCar);
    }

    public void listCars() {
        for (int i = 0; i < carMap.size(); ++i) {
            System.out.print((i + 1) + ". ");
            carMap.get(i).printString();
        }
    }

    public void listByMake(String make) {
        int counter = 1;

        for (int i = 0; i < carMap.size(); ++i) {
            if (carMap.get(i).getMake().toLowerCase().equals(make.toLowerCase())) {
                System.out.print(counter + ". "); 
                carMap.get(i).printString();
                counter += 1;
            }
        }
    }

    public void listByYear(int year) {
        int counter = 1;
        
        for (int i = 0; i < carMap.size(); ++i) {
            if (carMap.get(i).getYear() == year) {
                System.out.print(counter + ". "); 
                carMap.get(i).printString();
                counter += 1;
            }
        }
    }

    public void listByPrice(int price) {
        int counter = 1;
        
        for (int i = 0; i < carMap.size(); ++i) {
            if (carMap.get(i).getPrice() <= price) {
                System.out.print(counter + ". "); 
                carMap.get(i).printString();
                counter += 1;
            }
        }
    }

    public void listByUsed(String input) {
        int counter = 1;
        if (input.toLowerCase().equals("used")) {
            for (int i = 0; i < carMap.size(); ++i) {
                if (carMap.get(i).getUsed()) {
                    System.out.print(counter + ". ");
                    carMap.get(i).printString();
                }
            }
        }
        else if (input.toLowerCase().equals("new")) {
            for (int i = 0; i < carMap.size(); ++i) {
                if (!carMap.get(i).getUsed()) {
                    System.out.print(counter + ". ");
                    carMap.get(i).printString();
                }
            }
        }
    }
}
