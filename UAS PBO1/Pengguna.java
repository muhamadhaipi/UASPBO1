//class pengguna
public class Pengguna{

    //atribut pengguna
    private int id;
    private String username;
    private String password;

//method constructor
public Pengguna(){
    System.out.println("Object telah diciptakan, constructor berjalan");  
}

// method pengguna
public void login(){
    System.out.println("ini method untuk login");
}

public void lupaPassword(){
   System.out.println("ini method lupa password"); 
}

public void daftar(){
    System.out.println("ini method daftar user baru");
}
    // method getter pengguna
    public int getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

//method setter
public void setId(int id){
    this.id =id;
}

public void setUsername(String username){
    this.username =username;
}

public void setPassword(String password){
    this.password =password;
}


}
