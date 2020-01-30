package Group2_W2020_MAD3463_FP;

import java.time.LocalDate;
import java.util.Arrays;

abstract public class Person implements IDisplay {
    //Common member Variables
    /*Common member methods*/

    private Integer id;
    private String firstName,lastName;
    private Gender gender;
    private LocalDate birthDate;
    private Integer age;
    private String mobileNumber;
    private String email;
    private String userName;
    private String password;

    private Byte key = 5;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDate getBirthDate() {
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
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
