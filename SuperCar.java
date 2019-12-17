class SuperCar extends Vehicle {

    public SuperCar() {
        super("Super Car", 20, 3);
    }

    // @Override
    // public double getTravelTime(String weather) {
    //     return 1;
    // }

    @Override
    public boolean canTravel(Weather weather) {
        return true;
    }
}