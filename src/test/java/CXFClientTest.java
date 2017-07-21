import com.wentuotuo.service.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by Ekimin on 2017/7/21.
 */
public class CXFClientTest {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/ws/HelloWorld");
        jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
        HelloWorld helloWorld = (HelloWorld) jaxWsProxyFactoryBean.create();
        System.out.println(helloWorld.sayHi("pgu"));
    }
}
