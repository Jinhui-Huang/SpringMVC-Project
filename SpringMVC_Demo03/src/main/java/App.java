import com.itstudy.config.SpringConfig;
import com.itstudy.controller.UserController;
import com.itstudy.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        String select = userService.select(1);
        System.out.println(select);

    }
}
