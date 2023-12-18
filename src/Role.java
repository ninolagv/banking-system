import java.util.ArrayList;

public class Role {
    String name;
    ArrayList<Permission> permissions;

    Role(String  name, ArrayList<Permission> permissions){
        name=this.name;
        permissions= this.permissions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }

}
