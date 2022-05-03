package respostas;
import java.util.regex.*;
/*
autor @Valmir Alves da Cunha Júnior
*/
public class Respostas {
    public static void main(String[]args){
        //Dúvida: Precisa validar todas as regras?
        String regex_teste;
        System.out.println("=========================================================================");  
        System.out.println("Resolução da atividade 2.1");
        System.out.println("Alfabeto: {a,b}");
        System.out.println("=========================================================================");    
        System.out.println("Resposta para a questão - Começa com aa");//validado!
        regex_teste= "aa[ab]+";
        System.out.println(Pattern.matches(regex_teste,"aaa"));
        System.out.println(Pattern.matches(regex_teste,"aaba"));
        System.out.println("=========================================================================");
        System.out.println("Resposta para a questão - Não começa com aa");//validado!
        regex_teste = "b+[ba]+";
        System.out.println(Pattern.matches(regex_teste,"ba"));
        System.out.println(Pattern.matches(regex_teste,"bbbbbbaa"));
        System.out.println("=========================================================================");
        System.out.println("Resposta para a questão - Termina em bbb");//validado!
        regex_teste = "[ab]+bbb";
        System.out.println(Pattern.matches(regex_teste,"babbb"));
        System.out.println(Pattern.matches(regex_teste,"abbb"));        
        System.out.println("==========================================================================");
        System.out.println("Resposta para a questão - Não termina em bbb");//validado!
        regex_teste = "[ab]+a";
        System.out.println(Pattern.matches(regex_teste,"ba"));
        System.out.println(Pattern.matches(regex_teste,"aa"));
        System.out.println("===========================================================================");
        System.out.println("Resposta para a questão - Contém a subcadeia aabbb");//validado!
        regex_teste = "[ab]+aabbb";
        System.out.println(Pattern.matches(regex_teste,"aaabbb"));
        System.out.println(Pattern.matches(regex_teste,"baabbb"));
        System.out.println("===========================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento maior ou igual a 3");//validado!
        regex_teste= "a[ab]+b";
        System.out.println(Pattern.matches(regex_teste,"abb"));
        System.out.println(Pattern.matches(regex_teste,"aaaabbbb"));
        System.out.println("============================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento menor ou igual a 3");//validado!
        regex_teste= "b[ba]";
        System.out.println(Pattern.matches(regex_teste,"ba"));
        System.out.println(Pattern.matches(regex_teste,"bb"));
        System.out.println("===========================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento diferente de 3");//validado
        regex_teste= "b[ba]";
        System.out.println(Pattern.matches(regex_teste,"ba"));
        System.out.println(Pattern.matches(regex_teste,"bb"));
        System.out.println("===========================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento par");//
        regex_teste= "b[ab]+b";
        System.out.println(Pattern.matches(regex_teste,"babb"));
        System.out.println(Pattern.matches(regex_teste,"baab"));        
        System.out.println("==========================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento ímpar");//
        regex_teste= "b+[ab]+b";
        System.out.println(Pattern.matches(regex_teste,"bab"));
        System.out.println(Pattern.matches(regex_teste,"bbb"));           
        System.out.println("==========================================================================");
        System.out.println("Resposta para a questão - Possuem comprimento múltiplo de 4"); //
        regex_teste= "aa+[ab]+b";
        System.out.println(Pattern.matches(regex_teste,"aaab"));
        System.out.println(Pattern.matches(regex_teste,"aabb"));                       
        System.out.println("==========================================================================");
        System.out.println("Resposta para a questão - Possuem quantidade par de símbolos a");//  
        regex_teste= "aa+[ba]+a";
        System.out.println(Pattern.matches(regex_teste,"aabaa"));
        System.out.println(Pattern.matches(regex_teste,"aaaa"));              
        System.out.println("==========================================================================");
        System.out.println("Resposta para a questão - Possuem quantidade ímpar de símbolos b"); //
        regex_teste= "b+[ab]+b";
        System.out.println(Pattern.matches(regex_teste,"babb"));
        System.out.println(Pattern.matches(regex_teste,"bbb"));   
        System.out.println("==========================================================================");
        System.out.println("                    Fim!                                    ");
    }
}
