public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("Запуск двигателя автомобиля");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля остановлен");
    }
}
