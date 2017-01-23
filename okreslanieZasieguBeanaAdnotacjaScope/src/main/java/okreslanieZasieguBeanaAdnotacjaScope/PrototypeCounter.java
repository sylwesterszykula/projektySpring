package okreslanieZasieguBeanaAdnotacjaScope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("prototypeCounter")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeCounter extends Counter{

}
