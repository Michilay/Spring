import com.michilay.pojo.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //对象都交给spring管理，使用对象直接取出
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
