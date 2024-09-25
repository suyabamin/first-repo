public class Person {
    public String name, gender;
    private int age; // private = restricted access

    // Write constructor to initialize name and gender with this reference keyword;
    Person(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
    // Write getter method for age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age= age;
    }


    // Write setter method for age;

    public static void main(String[] args) {
        Person p1 = new Person("Prof. Albert Einstein", "Male");
        System.out.println("Name:"+p1.name+" Gender:"+p1.gender);
        p1.setAge(50);
        System.out.println("Age:"+p1.getAge());
    }
}