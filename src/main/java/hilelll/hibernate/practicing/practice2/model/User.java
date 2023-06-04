package hilelll.hibernate.practicing.practice2.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private String surname;
    private String password;
    private String email;
    private int age;

}
