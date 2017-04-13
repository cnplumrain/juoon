package root;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication()//exclude = MybatisAutoConfiguration.class)
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!ZZZ" );
        SpringApplication.run(App.class, args);
    }
}
