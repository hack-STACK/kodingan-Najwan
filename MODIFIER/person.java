//CLASS 1
package MODIFIER;

import javax.security.auth.kerberos.ServicePermission;

public class person 
                                    {
    private String name;

    public void setName /*changeName*/(String name) 
    {
        this.name = name;
    }
    public void changeName(String name)
    {
        this.name = name;
    }

    public String setName() {
        return this.name;
    }
    public String getName() 
    {
        return name;

    }
    public static void main(String[] args) 
    {
        person p = new person();
        p.setName("abc"); //misal abc
        System.out.println(p.setName());
    }
                                    }


     