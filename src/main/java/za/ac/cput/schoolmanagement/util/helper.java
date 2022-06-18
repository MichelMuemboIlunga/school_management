package za.ac.cput.schoolmanagement.util;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Range;
import org.apache.commons.validator.routines.EmailValidator;



public class helper {


    public static boolean isEmptyOrNull(String str) {
        return StringUtils.isEmpty(str);
    }
}

