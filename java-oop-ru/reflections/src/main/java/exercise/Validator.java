package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// BEGIN
public class Validator {
    public static List<String> validate(Object instance) {
        Field[] fields = instance.getClass().getDeclaredFields();
        List<String> invalidFields = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);
                    if (field.get(instance) == null) {
                        invalidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return invalidFields;
    }

    public static Map<String, List> advancedValidate(Object instance) {
        Map<String, List> invalidFields = new HashMap<>();
        Field[] fields = instance.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);
                    if (field.get(instance) == null) {
                        invalidFields.put(field.getName(), List.of("can not be null"));
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

            if (field.isAnnotationPresent(MinLength.class)) {
                try {
                    field.setAccessible(true);
                    MinLength annotation = field.getAnnotation(MinLength.class);
                    int minLength = annotation.minLength();
                    String value = (String) field.get(instance);
                    if (value.length() < minLength) {
                        invalidFields.put(field.getName(), List.of("length less than " + minLength));
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return invalidFields;
    }
}
// END
