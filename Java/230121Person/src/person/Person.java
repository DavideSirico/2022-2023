package person;
public class Person {
    private String name;
    private String birthDate;
    

    public Person() {
    }
    
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    boolean isBirthday(String today)
    {
        
    }
}
