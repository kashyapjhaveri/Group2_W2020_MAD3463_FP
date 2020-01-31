package Group2_W2020_MAD3463_FP.PersonPack;

import Group2_W2020_MAD3463_FP.Enums.Gender;
import Group2_W2020_MAD3463_FP.IDisplay;

import java.time.LocalDate;

abstract public class Person implements IDisplay {
    //Common member Variables
    /*Common member methods*/

    private String id;
    private String firstName,lastName;
    private Gender gender;
    private LocalDate birthDate;
    private Integer age;
    private String mobileNumber;
    private String email;
    private String userName;
    private String password;

    final private Byte key = 5;

    public Person(){}

    public Person(String id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String email, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.userName = userName;
        this.password = encryptPassword(password);
        calculateAge();
    }

    private void calculateAge()
    {
        this.age = LocalDate.now().getYear()-this.birthDate.getYear();
    }

    private String encryptPassword(String originalPassword)
    {
        char originalPasswordArray[] = originalPassword.toCharArray();

        for (int i=0;i<originalPassword.length();i++)
        {
            int temp=originalPasswordArray[i];
            temp+=key;
            originalPasswordArray[i]=(char)temp;
        }
        return new String(originalPasswordArray);
    }

    private String decryptPassword(String originalPassword)
    {
        char originalPasswordArray[] = originalPassword.toCharArray();

        for (int i=0;i<originalPassword.length();i++)
        {
            int temp=originalPasswordArray[i];
            temp-=key;
            originalPasswordArray[i]=(char)temp;
        }
        return new String(originalPasswordArray);
    }

    public String getId() {
        return id;
    }

    /*public void setId(Integer id) {
        this.id = id;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return decryptPassword(this.password);
    }

    public void setPassword(String password) {
        this.password = encryptPassword(this.password);
    }
}
