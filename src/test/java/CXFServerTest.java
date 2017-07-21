import com.wentuotuo.service.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by Ekimin on 2017/7/21.
 */
public class CXFServerTest {
    public void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/ws/HelloWorld");
        jaxWsProxyFactoryBean.create();

        System.out.println("Server started...");
    }
}
