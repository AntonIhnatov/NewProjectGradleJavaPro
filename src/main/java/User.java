import lombok.*;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@Log4j2

public class User {
    private String name;
    private int age;
    private int height;
}
