package cn.isdev.springmvc.bean;

import java.util.Date;

/**
 * Created by lsh134667 on 2018/7/25.
 */
public class User {

    private Integer id;
    private String name;
    private String password;
    private Date hiredate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }
}
