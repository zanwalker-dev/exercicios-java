package generics;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> lista ){ //versãos SEM o generics
        return lista.getLast();
    }

    public static <T> T getUltimo2(List<T> lista ){ //versãos COM o generics
        return lista.getLast();
    }

}
