//Разработать статическую функцию типа static bool isCorrect(String str),
// принимающую на вход строку и проверяющую, корректно ли заданы:
// фамилия, имя, отчество, дата, год и место рождения
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean Info(String name) {
        Pattern pattern = Pattern.compile("\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]\\s*[0-9]{1,2}\\s[A-ZА-Я][a-zа-я]{3,9}\\s*[#]\\s*[12][098][0-9]{2}\\s*[#]\\s*[A-ZА-Я][a-zа-я]{2,30}([-][A-ZА-Я][a-zа-я]{2,30})?(\\s[A-ZА-Я]?[a-zа-я]{2,30}){0,2}\\s*[#]");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {

        /*System.out.println(Info("Иванов # Иван # Иванович # 20 июня # 1998 # Vladivostok"));
        System.out.println(Info("Иванов # Иван # Иванович # 20 июня # 19778 # Vladivostok"));
        System.out.println(Info("Иванов # Иван # Иванович # 20 июня # 1998 # Vladivostok and Moscow"));
        System.out.println(Info("Иванов # Иван # Иванович # 20 июня # 1998 # Vladivostok-vl"));
        System.out.println(Info("Иванов #Иван # Иванович # 20 Июня # 1998 # Vladivostok"));
        System.out.println(Info(" Иванов # Иван # Иванович # 20 июня # 1998 # Vladivostok"));
        System.out.println(Info("Иванов # Иван # Иванович # 201 июня # 1998 # Vladivostok"));
        System.out.println(Info("Иванов # Иван # Иванович # 20 июня # 1998 # Vladivostok"));*/
        System.out.println(Info("иванов # иван # иванович # 20 июня # 1998 # Vladivostok"));
        System.out.println(Info("  Нипачук #Сергей # Вячесалавович # 05 Октября # 1972 # Russia-Moscow #"));

        personalInfo a = new personalInfo();
        System.out.println(personalInfo.surname("  Нипачук #"));
        System.out.println(personalInfo.name(" Сергей #"));
        System.out.println(personalInfo.patronymic(" Вячесалавович #"));
        System.out.println(personalInfo.Data(" 5 октября #"));
        System.out.println(personalInfo.Data(" 05 Октября #"));
        System.out.println(personalInfo.Year(" 1972 #"));
        System.out.println(personalInfo.Place(" Russia-Moscow #"));
        System.out.println(personalInfo.Place(" Vladivostok #"));
        System.out.println(personalInfo.Place(" Vladivostok and Moscow #"));
    }
}
