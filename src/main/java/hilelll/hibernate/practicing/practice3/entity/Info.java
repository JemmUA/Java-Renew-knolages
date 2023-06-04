package hilelll.hibernate.practicing.practice3.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Info {
    private String city;
    private String country;
    private LocalDateTime date;
    private String about;
}
