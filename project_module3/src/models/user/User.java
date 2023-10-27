package models.user;

public class User {
    private String fullName;
    private String id;
    private int age;
    private String phoneNumber;
    private String address;
    private String userName;
    private String passWord;

    public User(String fullName, String id, int age, String phoneNumber, String address, String userName, String passWord) {
        this.fullName = fullName;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Mã người dùng: " + id +
                " - Họ và tên: " + fullName +
                " - Tuổi: " + age+
                " - SĐT: " + phoneNumber+
                " - Địa chỉ: " + address+
                " - Tên đăng nhập: " + userName+
                " - Mật khẩu: " + passWord;
    }

    public String writeString() {
        return id + "," + fullName + "," + age + "," + phoneNumber + "," + address +
                "," + userName + "," + passWord + "\n";
    }
}
