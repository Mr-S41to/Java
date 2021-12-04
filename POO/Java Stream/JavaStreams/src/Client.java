public class Client {
    private String name;
    private boolean status;
    private String password;
    private int pts;

    public Client(String name, boolean status, String password, int pts) {
        this.name = name;
        this.status = status;
        this.password = password;
        this.pts = pts;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPts() {
        return this.pts;
    }

    public boolean checkPassword(String password) {
        if (this.password != password) {
            System.out.println("Password Error! ");
            return false;
        } else {
            return  true;
        }
    }
}