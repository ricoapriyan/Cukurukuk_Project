package GUI;

public class Nama {
    private static Nama instance;
    private String username;

    private Nama() {
        
    }

    public static synchronized Nama getInstance() {
        if (instance == null) {
            instance = new Nama();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

    

