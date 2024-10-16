public class Boat implements Vehicle {

    @Override
    public void start() {
        System.out.println("Запуск двигателя лодки");
    }

    @Override
    public void stop() {
        System.out.println("Остановка двигателя лодки");
    }
}
