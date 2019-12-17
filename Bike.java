class Bike extends Vehicle {

    public Bike() {
        super("Bike", 10, 2);
    }

    // @Override
    // public double travel(Orbit orbit) {
    //     double speed = this.getSpeed() / 60;
    //     speed = speed * orbit.getDistance();
    //     speed = speed + this.getCraterTime(orbit);
    //     return speed;
    // }

    @Override
    public boolean canTravel(Weather weather) {
        if (weather.getWeather() == "RAINY")
            return false;
        return true;
    }
}