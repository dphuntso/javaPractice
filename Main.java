class Main {
    public static void main(String[] args) {
        Weather weather = new Weather("SUNNY");
        Algorithm algo = new Algorithm(weather);
        algo.addVehicle(new Bike());
        algo.addVehicle(new TukTuk());
        algo.addVehicle(new SuperCar());
        algo.addOrbit(new Orbit("Orbit1", 20, 18, 12));
        algo.addOrbit(new Orbit("Orbit2", 10, 20, 10));
        algo.run();
        algo.result();
    }
}