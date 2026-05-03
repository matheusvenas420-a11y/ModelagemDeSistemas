package com.mycompany;

import com.mycompany.model.OrdemServico;
import com.mycompany.model.Servico;
import com.mycompany.model.Orcamento;
import com.mycompany.model.Pecas;
import com.mycompany.model.Veiculo;

public class TesteClasseOS {

    public static void main(String[] args) {

        // Criar veiculo
        Veiculo v = new Veiculo("ABC-1234", "Toyota", "Corolla", 2020, 45000);

        // Criar ordem de servico
        OrdemServico os = new OrdemServico("Revisao completa");

        // Associar veiculo
        os.setVeiculo(v);

        // Criar servicos
        Servico s1 = new Servico("Troca de oleo", 1, 50);
        Servico s2 = new Servico("Alinhamento", 1, 30);

        s1.setTempoReal(1);
        s2.setTempoReal(1);

        // Adicionar servicos
        os.addServico(s1);
        os.addServico(s2);

        // Criar orcamento
        Orcamento orc = new Orcamento(200);

        Pecas p1 = new Pecas("Filtro de oleo", 40);
        Pecas p2 = new Pecas("Oleo", 80);

        orc.addPecas(p1);
        orc.addPecas(p2);

        // Associar orcamento
        os.setOrcamento(orc);

        // Fluxo da OS
        os.executada();
        os.concluir();

        // Teste final
        os.getInfo();
    }
}