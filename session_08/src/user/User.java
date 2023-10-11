package user;

public class User {
    public String userName;
    public String password;
    public int id;

    public User() {
    }

    public User(String userName, String password, int id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public boolean login(String userName, String password){
       if (this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
           System.out.println("thành công");
           return true;
       }else {
           System.out.println("thất bại");
           return false;
       }
    }

    public void displaUser() {
        System.out.println(
                "User" +'\n' +
                "userName: " + userName + '\n' +
                "password: " + password + '\n' +
                "id: " + id);
    }
}
