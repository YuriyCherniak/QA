package youtubeCourse;

public class mersedes extends car{
    public mersedes(String stay, int wheels){
        setStay(stay);
        setWheels(wheels);
    }
    void stop() {
        System.out.println(getStay() + " стоїть на своїх " + getWheels() + "ьох колесах");
    }
}
