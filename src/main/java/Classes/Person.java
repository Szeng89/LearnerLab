package Classes;

public class Person {
    final long id;
    private String name;

    public Person() {
        this.id = 0L;
    }

    public Person(long id){
        this.id = id;
    }

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
