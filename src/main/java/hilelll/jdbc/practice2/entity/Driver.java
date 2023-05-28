package hilelll.jdbc.practice2.entity;

import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Driver {
    private int id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private Integer age;

}
