package hilelll.hibernate.practicing.practice1.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sports")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String sport;
    @ManyToMany(mappedBy = "sports")
    private Set<Apprentice> apprentices;
}
