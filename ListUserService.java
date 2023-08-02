import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ListUserService  {

    @Autowired
    private UserRepository userRepository;

    public Object execute() {
        return userRepository.findAll();
    }

}
