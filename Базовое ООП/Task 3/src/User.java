public class User {
    private String name;
    private Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setAge(Integer age) {this.age = age;}
    public Integer getAge() {return age;}

    public String toString() {
        return String.format("%s, возраст %d лет", name, age);
    }
}
