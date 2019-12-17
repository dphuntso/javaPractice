class TukTuk extends Vehicle {

    public TukTuk() {
        super("TukTuk", 12, 1);
    }

    // @Override
    // public double getTravelTime(String weather) {
    //     return 1;
    // }

    @Override
    public boolean canTravel(Weather weather) {
        if (weather.getWeather() == "WINDY")
            return false;
        return true;
    }
}