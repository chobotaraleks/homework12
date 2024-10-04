public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    // Приватні методи, які є частиною внутрішньої логіки
    private void startElectricity() {
        System.out.println("Electricity started.");
    }

    private void startCommand() {
        System.out.println("Command system started.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }
}
