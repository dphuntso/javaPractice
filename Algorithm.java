import java.util.ArrayList;
import java.util.List;

class Algorithm {
    private List<Vehicle> vehicles;
    private List<Orbit> orbits;
    private Weather weather;
    private Data data;


    Algorithm(Weather weather) {
        vehicles = new ArrayList<>();
        orbits = new ArrayList<>();
        this.weather = weather;
        data = null;
    }
    /**
     * @return the weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    private class Data {
        private double speed;
        private Vehicle vehicle;
        private Orbit orbit;

        /**
         * @return the speed
         */
        public double getSpeed() {
            return speed;
        }

        /**
         * @param speed the speed to set
         */
        public void setSpeed(double speed) {
            this.speed = speed;
        }

        /**
         * @return the orbit
         */
        public Orbit getOrbit() {
            return orbit;
        }
        /**
         * @param orbit the orbit to set
         */
        public void setOrbit(Orbit orbit) {
            this.orbit = orbit;
        }

        /**
         * @return the vehicle
         */
        public Vehicle getVehicle() {
            return vehicle;
        }

        /**
         * @param vehicle the vehicle to set
         */
        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addOrbit(Orbit orbit) {
        orbits.add(orbit);
    }

    public void run() {
        for(Orbit orbit: orbits) {
            // System.out.println("\nOrbit => " + orbit.getName());
            // System.out.println("Weather => " + weather.getWeather());

            for(Vehicle vehicle: vehicles) {
                double speed ;
                if (vehicle.canTravel(weather) == true) {
                    speed = vehicle.travel(orbit);
                    // System.out.println("Vehicle " + vehicle.getName() + " speed => " + speed + "  orbit distance => " + orbit.getDistance() + "  orbit crater => " + orbit.getCrater());
                    if (data == null) {
                        data = new Data();
                        data.setSpeed(speed);
                        data.setVehicle(vehicle);
                        data.setOrbit(orbit);
                    }
                    else if (speed < data.getSpeed()) {
                        data.setSpeed(speed);
                        data.setVehicle(vehicle);
                        data.setOrbit(orbit);
                    }
                }
            }
        }
        // System.out.println("hellow\n");
        // System.out.println(data.vehicle.getName());
    }
    
    public void result() {
        System.out.println("\n");
        System.out.println("\nVehicle " + data.vehicle.getName() + " on " + data.orbit.getName());
        System.out.println("\n");
    }
}