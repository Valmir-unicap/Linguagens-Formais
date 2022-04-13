package teste;
import java.util.regex.*;
public class Teste {
    public static void main(String[]args){
        String regex_teste;
        System.out.println("==================================================");  
        System.out.println("Resolução da atividade 2.1");
        System.out.println("Alfabeto: {a,b}");
        System.out.println("==================================================");    
        System.out.println("Resposta para a questão - Começa com aa");
        regex_teste= "a[a]+b";
        System.out.println(Pattern.matches(regex_teste,"aab"));
        regex_teste= "a[ab]+a";
        System.out.println(Pattern.matches(regex_teste,"aaba"));
        System.out.println("==================================================");
        System.out.println("Resposta para a questão - Não começa com aa");
        regex_teste = "b[ba]+a";
        System.out.println(Pattern.matches(regex_teste,"bbaa"));
        regex_teste = "b[ba]+b";
        System.out.println(Pattern.matches(regex_teste,"bbab"));
        System.out.println("==================================================");
        System.out.println("Resposta para a questão - Termina em bbb");
        regex_teste = "a[b]+bb";
        System.out.println(Pattern.matches(regex_teste,"abbb"));
        regex_teste = "a[a]+bbb";
        System.out.println(Pattern.matches(regex_teste,"aabbb"));        
        System.out.println("==================================================");
        System.out.println("Resposta para a questão - Não termina em bbb");
        regex_teste = "b[a]+ba";
        System.out.println(Pattern.matches(regex_teste,"baba"));
        regex_teste = "b[b]+aa";
        System.out.println(Pattern.matches(regex_teste,"bbaa"));
        System.out.println("==================================================");
        System.out.println("Resposta para a questão - Contém a subcadeia aabbb");
        regex_teste = "a[ab]+bb";
        System.out.println(Pattern.matches(regex_teste,"aabbb"));
        regex_teste = "ba[ab]+bb";
        System.out.println(Pattern.matches(regex_teste,"baabbb"));
        System.out.println("==================================================");
    }
}
