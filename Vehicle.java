abstract class Vehicle {
    private String name;
    private double speed;
    private double craterSpeed;

    public Vehicle(String name, double speed, double craterSpeed) {
        this.name = name;
        this.setSpeed(speed);
        this.craterSpeed = craterSpeed;
    }

    public String getName() {
        return this.name;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        if (speed < 0) {
            speed = 0;
            return ;
        }
        this.speed = speed;
    }

    public double getCraterTime(Orbit orbit) {
        return orbit.getCrater() * craterSpeed;
    }
    
    public double travel(Orbit orbit) {
        double speed;
        speed = this.getSpeed();
        if (speed > orbit.getSpeed()) {
            speed = orbit.getSpeed();
        }
        speed = 60 / speed;
        speed = speed * orbit.getDistance();
        speed = speed + this.getCraterTime(orbit);
        return speed;
    }

    abstract public boolean canTravel(Weather weather);

}