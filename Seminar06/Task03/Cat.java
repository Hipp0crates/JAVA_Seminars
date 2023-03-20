package JAVA_Seminars.Seminar06.Task03;

import java.util.Date;
import java.util.Random;

public class Cat {

    private String name;
    private int age;
    private boolean isVaccinated;
    private char male;
    private String breed;
    private Date birthDate;

    public Cat() {
    }

    public Cat(String name, int age, boolean isVaccinated, char male, String breed, Date birthDate) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.male = male;
        this.breed = breed;
        this.birthDate = birthDate;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getMale() {
        return male;
    }

    public void setMale(char male) {
        this.male = male;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void meow() {
        Random random = new Random();
        if (male == 'ж')
            System.out.println(name + " мяукнула " + random.nextInt(0, 10) + " раз.");
        else
            System.out.println(name + " мяукнул " + random.nextInt(0, 10) + " раз.");
    }

    public void meow(int count) {
        if (male == 'ж')
            System.out.println(name + " мяукнула " + count + " раз.");
        else
            System.out.println(name + " мяукнул " + count + " раз.");
    }

    public int humanAge() {
        return age * 4;
    }

    public void vaccinate() {
        if (isVaccinated)
            System.out.println(name + " уже вакцинирован/а");
        else {
            isVaccinated = true;
            System.out.println("Мы вакцинировали " + name);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                ", male=" + male +
                ", breed='" + breed + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}