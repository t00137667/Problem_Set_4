public class APerson {
    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "APerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public APerson() {
        this("Unknown",0,0.0);
    }

    public APerson(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
