import com.michilay.pojo.Student;
import com.michilay.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user1 = context.getBean("user2", User.class);
        User user = context.getBean("user2", User.class);
        System.out.println(user1.hashCode());
        System.out.println(user.hashCode());
        System.out.println(user == user1);
    }
}
