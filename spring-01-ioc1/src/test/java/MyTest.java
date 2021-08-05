import com.michilay.dao.UserDaoImpl;
import com.michilay.dao.UserDaoMySqlImpl;
import com.michilay.service.UserService;
import com.michilay.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        //用户实际上调用业务层，dao层不需要接触
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        //userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    }
    
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserServiceImpl  userServiceImpl= (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
