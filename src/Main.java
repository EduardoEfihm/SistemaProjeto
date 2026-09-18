import dao.ProjetoCSV;
import java.util.List;
import model.Projeto;
import service.ProjetoService;

public class Main {

    public static void main(String[] args)
        throws Exception {

        ProjetoService service = new ProjetoService();

        ProjetoCSV dao = new ProjetoCSV();

        Projeto p1 = new Projeto(
            1,
            "Sistema Academico",
            "Sistema para gerenciamento academico",
            "Software",
            "Em desenvolvimento"
        );

        Projeto p2 = new Projeto(
            2,
            "Site Institucional",
            "Website institucional",
            "Web",
            "Concluido"
        );

        service.adicionar(p1);
        service.adicionar(p2);

        dao.salvar(service.listar());


        List<Projeto> projetos =
        dao.listar();

        for (Projeto projeto : projetos) {

        projeto.exibirDados();

        }
        System.out.println("Dados salvos com sucesso!");
    }
}
