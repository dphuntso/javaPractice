
class Orbit{
    private String name;
    private double speed;
    private double crater;
    private double distance;
    public Orbit(String name, double crater, double distance, double speed) {
        this.name = name;
        this.crater = crater;
        this.distance = distance;
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    /**
     * @return the crater
     */
    public double getCrater() {
        return crater;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCrater(Weather weather) {
        String tmp = weather.getWeather();
        if (tmp == "RAINY") {
            this.crater = this.crater + 2 * (this.crater / 10);
        }
        else if (tmp == "Sunny") {
            this.crater = this.crater - (this.crater / 10);
        }
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }
}