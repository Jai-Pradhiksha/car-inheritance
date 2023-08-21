import java.util.Scanner;

abstract class Car {
    abstract boolean getIsSedan();
    abstract int getSeats();
    abstract String getMileage();
}

class WagonR extends Car {
    int mileage;

    public WagonR(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return false;
    }

    @Override
    int getSeats() {
        return 4;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

class HondaCity extends Car {
    int mileage;

    public HondaCity(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return true;
    }

    @Override
    int getSeats() {
        return 4;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

class InnovaCrysta extends Car {
    int mileage;

    public InnovaCrysta(int mileage) {
        this.mileage = mileage;
    }

    @Override
    boolean getIsSedan() {
        return false;
    }

    @Override
    int getSeats() {
        return 6;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int carType = scanner.nextInt();
        int mileage = scanner.nextInt();

        Car car;

        if (carType == 0) {
            car = new WagonR(mileage);
        } else if (carType == 1) {
            car = new HondaCity(mileage);
        } else {
            car = new InnovaCrysta(mileage);
        }

        String sedanInfo = car.getIsSedan() ? "Sedan" : "not Sedan";
        System.out.println("A " + car.getClass().getSimpleName() + " is " + sedanInfo + ", is " + car.getSeats() + "-seater, and has a mileage of around " + car.getMileage() + ".");
    }
}
