/**
 * @author admin
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2020年09月19日 13:15:00
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, String age) {
        this.name = name;
        this.age = Integer.parseInt(age);
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

    public void setAge(String age) {

        this.age = Integer.parseInt(age);
    }


}
