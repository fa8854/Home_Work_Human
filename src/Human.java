public class Human {
   public int yearOfBrith;
   public String name;
   public String town;
   public String jobTitle;

    Human(int yearOfBrith, String name,String town, String jobTitle){
        this.name = name;
        this.yearOfBrith = yearOfBrith;
        this.town = town;
        this.jobTitle = jobTitle;
        }

    public int getYearOfBrith() {
        return yearOfBrith;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town  + " Я родился в " + yearOfBrith  + " году. Я работаю на должности " +
                jobTitle +  " .Будем знакомы! ";
    }
}
