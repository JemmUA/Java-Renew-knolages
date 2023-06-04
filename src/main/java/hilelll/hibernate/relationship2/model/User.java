package hilelll.hibernate.relationship2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "portal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    private Role role;

//    @OneToOne(mappedBy = "role")
//    private Role role;

//    @ManyToMany(mappedBy = "users")
//            private Set<Role> roles;

}
