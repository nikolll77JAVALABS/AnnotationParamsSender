package nikolll77.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
	Class<?> cls=classForReflect.class;
    Method[] methods = cls.getMethods();
    for(Method m:methods){
        if (m.isAnnotationPresent(aParams.class)) {
            aParams params = m.getAnnotation(aParams.class);
            int result = (int)m.invoke(null,params.a(),params.b());
            System.out.print(result);
        }
    }

    }
}
