class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    Car car = new Car(
        "ABC-123",
        new Account("João", "123.456.789-00", "rluis747", "ilidans"));

    car.printDataCar();

    Car monza = new Car(
        "ABC-123",
        new Account("Luis", "123.456.789-00", "rluis747", "ilidans"));
    monza.printDataCar();

    Card card = new Card(34534535, 456, "4-09-1990", 34.99f);
    card.id = 33;
    card.print();
  }
}