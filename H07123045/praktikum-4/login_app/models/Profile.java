package login_app.models;

public class Profile {

        /* 
     * :
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
    */

    private String fullName, hobby, nickName;
    private int age;
    

    public Profile() {};    


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
    
