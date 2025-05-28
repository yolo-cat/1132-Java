public class Car {

    private String carNumber;
//    private String color;
//    private int doors;
//    private int seats;

//    Car() {
//        carNumber = "ABC-8888";
//        color = "white";
//        doors = 4;
//        seats = 5;
//    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

//    Car(String carNumber, String color, int doors, int seats) {
//        this.carNumber = carNumber;
//        this.color = color;
//        this.doors = doors;
//        this.seats = seats;
//    }
//
//    Car(String carNumber) {
//        this.carNumber = carNumber;
//    }
//
//    //    定義一個建構方法，讓呼叫者初始化車牌號碼和顏色，car的開發者指定door 4, seats 5。
//    Car(String carNumber, String color) {
//        this.carNumber = carNumber;
//        this.color = color;
//        this.doors = 4;
//        this.seats = 5;
//    }

    void printCar() {
        System.out.println("Car Number: " + carNumber);
//        System.out.println("Color: " + color);
//        System.out.println("Doors: " + doors);
//        System.out.println("Seats: " + seats);
    }
//
//    void drive() {
//    }
//
//    void stop() {
//    }
//

}
