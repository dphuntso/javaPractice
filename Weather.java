class Weather {
    private String weather;

    public Weather(String weather) {
        this.weather = weather;
        if (this.weather == "")
            this.weather = "SUNNY";
    }

    public void setWeather(String weather) {
        if (weather == "") {
            this.weather = "SUNNY";
            return ;
        }
        this.weather = weather;
    }

    public String getWeather() {
        return this.weather;
    }
}