public class Bicycle implements Vehicle {

    @Override
    public void stop() {
        System.out.println("Остановка двигателя мотоцикла");
    }

    @Override
    public void start() {
        System.out.println("Запуск двигателя мотоцикла");
    }
}
