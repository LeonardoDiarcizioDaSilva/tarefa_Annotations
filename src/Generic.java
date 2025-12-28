import java.lang.reflect.Field;

public class Generic<T> {

    public String getNome(T entity) {
        Field[] fields = entity.getClass().getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ITable.class)) {
                return field.getAnnotation(ITable.class).value();

            }
        }
        return null;
    }
}
