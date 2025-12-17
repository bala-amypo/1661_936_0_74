
package pom.example.demo.entity
@Entity
public class StudentEntity(){
private Integer id;
private String username;
private String email;
private String password;
private Date createAt;

public void setId(Integer id){
    this.id=id;
}
public Integer getId(){
     return id;
}
public String getUsername(){
    return username;
}
public void setUsername(String username){
    this.username=username;
}
public String getEmail(String Email){
    return email;
}
public void setEmail(String email){
    this.email=email;
}

public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public Date getCreateAt(){
    return createAt;
}
public void setCreateAt(Date createAt){
    this.createAt=createAt;
}
public StudentEntity(Integer id,String username,String email,String password,Date createAt ){
    this.id=id;
    this.username=username;
    this.email=email;
    this.password=password;
    this.createAt=createAt;

}
public StudentEntity(){

}

}