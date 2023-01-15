//фамилия, имя, отчество, дата, год и место рождения

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class personalInfo {

    public static boolean surname(String name) //фамилия
    {
        Pattern pattern = Pattern.compile("\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean name(String name)  //имя
    {
        Pattern pattern = Pattern.compile("\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean patronymic(String name)  //отчество
    {
        Pattern pattern = Pattern.compile("\\s*[A-ZА-Я][a-zа-я]{1,20}\\s*[#]");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean Data(String year)  //дата рождения, формат "3 Мая", между словами 1 пробел, после и перед без пробелов
    {
        Pattern pattern = Pattern.compile("(\\s*[0-9]{1,2}\\s[A-ZА-Я][a-zа-я]{3,9}\\s*){1,5}[#]");
        Matcher matcher = pattern.matcher(year);
        return matcher.matches();
    }

    public static boolean Year(String year)  //год, формат "1998", никаких пробелов, всего 4 цифры
    {
        Pattern pattern = Pattern.compile("\\s*[12][098][0-9]{2}\\s*[#]");
        Matcher matcher = pattern.matcher(year);
        return matcher.matches();
    }

    public static boolean Place(String name)  //Название города. Слово, два слова или название через дефис. После слова может быть пробел
    {
        Pattern pattern = Pattern.compile("\\s*[A-ZА-Я][a-zа-я]{2,30}([-][A-ZА-Я][a-zа-я]{2,30})?(\\s[A-ZА-Я]?[a-zа-я]{2,30}){0,2}\\s*[#]");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

}
