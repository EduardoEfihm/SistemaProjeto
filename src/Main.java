import model.Projeto;

public class Main {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(
            1,
            "Sistema Acadêmico",
            "Sistema para gerenciamento acadêmico",
            "Software",
            "Em desenvolvimento"
        );
        
        Projeto projeto2 = new Projeto(
            2,
            "Site Institucional",
            "Website de uma instituição",
            "Web",
            "Concluído"

        );
        
        projeto.exibirDados();

        System.out.println();

        projeto2.exibirDados();
    }
}
