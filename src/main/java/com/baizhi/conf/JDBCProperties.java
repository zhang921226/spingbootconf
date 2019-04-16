package com.baizhi.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "mysql")
public class JDBCProperties{
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private User user;

//    public JDBCProperties() {
//    }
//
//    public JDBCProperties(String driverClassName, String url, String username, String password) {
//
//        this.driverClassName = driverClassName;
//        this.url = url;
//        this.username = username;
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "JDBCProperties{" +
//                "driverClassName='" + driverClassName + '\'' +
//                ", url='" + url + '\'' +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}