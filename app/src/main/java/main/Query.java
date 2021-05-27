package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Query {

    public static int queryAge() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = "How old are you?";
        String errorMessage = "Please key in digital.";
        Method method = Query.class.getMethod("queryAge");
        InputNormalization.regularize(method, "int", tipMessage, errorMessage);
        return checkAge(InputNormalization.digital);
    }

    public static int checkAge(int age) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (age < 3) {
            System.out.println("Your age is too young.");
            queryAge();
        } else if (age > 75) {
            System.out.println("Your age doesn't meet the requirements.");
            queryAge();
        }
        return age;
    }

    public static boolean queryGroup() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = "Are you a group? (Y/N)";
        String errorMessage = "Please enter Y or N.";
        Method method = Query.class.getMethod("queryGroup");
        InputNormalization.regularize(method, "boolean", tipMessage, errorMessage);
        return InputNormalization.bool;
    }

    public static boolean queryMember() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String tipMessage = "Are you a member? (Y/N)";
        String errorMessage = "Please enter Y or N.";
        Method method = Query.class.getMethod("queryMember");
        InputNormalization.regularize(method, "boolean", tipMessage, errorMessage);
        return InputNormalization.bool;
    }
}
