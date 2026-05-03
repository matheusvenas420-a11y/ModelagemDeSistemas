import com.mycompany.model.OrdemServico;
import com.mycompany.model.Servico;
import com.mycompany.model.Orcamento;
import com.mycompany.model.Pecas;

public class Main {

    public static void main(String[] args) {

        // Criar Ordem de Serviço
        OrdemServico os = new OrdemServico("Manutencao completa");

        // Criar serviços
        Servico s1 = new Servico("Troca de HD", 2, 50);
        Servico s2 = new Servico("Limpeza interna", 1, 30);

        // Definir tempo real
        s1.setTempoReal(3);
        s2.setTempoReal(1);

        // Adicionar serviços na OS
        os.addServico(s1);
        os.addServico(s2);

        // Criar orçamento
        Orcamento orc = new Orcamento(200);

        // Criar peças
        Pecas p1 = new Pecas("HD", 150);
        Pecas p2 = new Pecas("Memoria RAM", 100);

        // Adicionar peças ao orçamento
        orc.addPecas(p1);
        orc.addPecas(p2);

        // Associar orçamento à OS
        os.setOrcamento(orc); // ⚠️ precisa ter esse método

        // Fluxo da OS
        os.executada();
        os.concluir();

        // 🔥 TESTE DO GETINFO
        os.getInfo();
    }
}