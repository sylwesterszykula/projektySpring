package okreslanieZasieguBeanaAdnotacjaScope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("singletonCounter")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SingletonCounter extends Counter{

}
