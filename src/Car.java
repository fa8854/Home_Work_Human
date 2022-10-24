public class Car {
    String barnd;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String barnd,String model,String color, String country, double engineVolume, int year){
        this.barnd = defaultDrValue(barnd, "Информация не указана");
        this.model = defaultDrValue(model,"Информация не указана");
        this.color= color;
        this.country = defaultDrValue(country,"Информация не указана");
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (year <=0){
            this.year = 2000;
        }else {
            this.year = year;
        }
    }
    public String getBarnd() {
        return barnd;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    private String defaultDrValue(String value, String defaultValue){
        if (value == null || value.isBlank()){
            return defaultValue;
        }else {
            return value;
        }
    }

    @Override
    public String toString() {
        return barnd + " " + model + ", " + year + " год выпуска, сборка в " + country + " ," + color + "  цвета, объем двигателя — " + engineVolume + " л.";
    }
}
