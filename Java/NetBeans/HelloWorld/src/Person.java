public class Person {
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String email;
    private String birthplace;
    private String birthdate;
    private String CodiceFiscale;
    private String sex;

    public Person(String name, String surname, String address, String phone, String email, String birthplace, String birthdate, String codiceFiscale, String sex) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        CodiceFiscale = codiceFiscale;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        CodiceFiscale = codiceFiscale;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", CodiceFiscale='" + CodiceFiscale + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person() {
    }

}
