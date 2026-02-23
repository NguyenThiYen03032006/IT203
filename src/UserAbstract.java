public abstract class UserAbstract {
    // lop truu tuong : co phuong thuc truu tuong
    // la lop nen co day du thnah phan cua lop
    // co phuong thuc tuu tuong
    private String name;
    private String userName;
    private String password;

    // phuong thuc tuu tuong
    public abstract void printfInfor();

    // constructor
    public UserAbstract() {
    }

    public UserAbstract(String name, String password, String userName) {
        this.name = name;
        this.password = password;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
