package zone.sesh.Person;

import java.lang.String;
import java.util.logging.Logger;


public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        age = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int value) {
        height = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int value) {
        weight = value;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String value) {
        eyeColor = value;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String value) {
        gender = value;
    }

    private static void main() {
        Person p = new Person("Colton Aubrey Hooke", 21, 173, 82, "Hazel", "MALE");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("Name: " + p.getName());
        l.info("Age: " + p.getAge());
        l.info("Height (cm}: " + p.getHeight());
        l.info("Weight (cm): " + p.getWeight());
        l.info("Eye Color: " + p.getEyeColor());
        l.info("Gender: " + p.getGender());
    }
}
