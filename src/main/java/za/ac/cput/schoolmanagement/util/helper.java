package za.ac.cput.schoolmanagement.util;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Range;
import org.apache.commons.validator.routines.EmailValidator;


import java.time.temporal.ValueRange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class helper {
    public static boolean isEmptyOrNull(String str){
        return StringUtils.isEmpty(str);
    }

    public static boolean isValidString(String firstName) {
        if(!firstName.isEmpty())
            return true;
        else
            return false;
    }

<<<<<<< HEAD
    public static void checkStringParam(String studentId, String studentId1) {
    }
}
=======
    public static void checkStringPara(String paraName, String paraValue) {
        if (isEmptyOrNull(paraValue))
            throw new IllegalArgumentException("Invalid Value for " + paraValue);

    }

    public static void checkEmail(String s){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(s))
            throw new IllegalArgumentException("Email not valid");
    }

    public static void checkIfObjectNull(String objectName, Object object) {
        if (object == null) {
            throw new IllegalArgumentException(String.format("%s is null", objectName));
        }
    }

}
>>>>>>> upstream/master
