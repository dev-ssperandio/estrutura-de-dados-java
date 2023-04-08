import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Sidney");
        aluno.put("Idade", "27");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "Bootcamp Java");
        
        System.out.println(aluno);
        
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        
        List<Map<String, String>> listaAlunos = new ArrayList<>();
        
        listaAlunos.add(aluno);
        
        Map<String, String> aluno2 = new HashMap<>();
        
        aluno2.put("Nome", "Ivanessa");
        aluno2.put("Idade", "29");
        aluno2.put("Media", "9.5");
        aluno2.put("Turma", "Bootcamp Java");
        
        listaAlunos.add(aluno2);
        
        System.out.println(listaAlunos);
        
        System.out.println(aluno.containsKey("Nome"));
    }
}
