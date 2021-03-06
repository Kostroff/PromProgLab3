import java. util. regex. Matcher;
import java. util. regex. Pattern;

public class Test {

    public static void main(String[ ] args) {
        System.out.println("Results of checking: ");
        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));
        System.out.println(checkWithRegExp("Ko-ko-ko-kostroff"));
        System.out.println(checkWithRegExp("kostroff"));
        System.out.println(checkWithRegExp("k0str0ff"));
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}