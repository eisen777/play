package registrator;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return  name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
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

    public void showUserInfo() {
        System.out.println("Имя: " + this.getName() + " возраст: " + age);
    }


}