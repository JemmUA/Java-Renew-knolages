package hilelll.patternsDesign.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Human implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private Parrot parrot;
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
