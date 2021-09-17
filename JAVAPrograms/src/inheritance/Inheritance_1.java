package inheritance;

class Animal
{
    String eyes,nose,mouth,ears;

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }
}

class Dog extends Animal{
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
public class Inheritance_1 {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Dog d = new Dog();
        d.setName("RAJAPALYAM");
        d.setEars("White");
        d.setEyes("Black");
        d.setNose("Pink");
        d.setMouth("Teeth & Tounge");
        System.out.println(d.getName());
        System.out.println(d.getEars());
        System.out.println(d.getEyes());
        System.out.println(d.getNose());
        System.out.println(d.getMouth());
    }
}
