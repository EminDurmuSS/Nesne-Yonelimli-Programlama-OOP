import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternAndMatches {
    public static void main(String[] args) {
        //Regular expression,bir kalıbın (pattern) tanımlamasıdır. Bir dizgide arama ve değiştirme gibi
        //işlemleri Regular EXpression ile daha kolay yapabiliriz.
        //Herhangi bir dizgi bir kalıba uyuyorsa buna match diyoruz.
        // Pattern Matcher denildiğinde,Regular Expression'u
        //işleme sokan makine olarak düşünebiliriz. Bunun için Java da Matcher sınıfı vardır.
        //Pattern sınıfı ise ön derlemede kullanılmaktadır.
        //String sınıfı ve Pattern sınıfı matches()methodunu bize sunmaktadır.
        //Regular Expression u 3 şekilde de yazabiliriz.Aşağıdaki örnekte inceleyelim.

        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("js");
        //1'nci yol
        boolean boolean1 = m.matches();
        System.out.println(boolean1);
        //2'nci yol
        boolean boolean2=Pattern.compile(".s").matcher("js").matches();
        System.out.println(boolean2);
        //3'üncü yol
        boolean boolean3 = Pattern.matches(".s", "js");
        System.out.println(boolean3);
        //OUTPUT : true,
        //         true,
        //         true