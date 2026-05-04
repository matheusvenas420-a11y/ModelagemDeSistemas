package com.mycompany;

import com.mycompany.model.Cliente;
import com.mycompany.model.Veiculo;
import com.mycompany.model.OrdemServico;
import com.mycompany.model.Servico;
import com.mycompany.model.Mecanico;
import com.mycompany.model.Orcamento;
import com.mycompany.model.Pecas;

public class TesteClasseOS {

    public static void main(String[] args) {
        Cliente c = new Cliente("Rua A", "Matheus", "123456789", "99999-9999");
        
        Veiculo v = new Veiculo("ABC-1234", "Toyota", "Corolla", 2020, 45000);
        
        c.addVeiculo(v);
        
        OrdemServico os = new OrdemServico("Revisao geral");
        
        os.setCliente(c);
        os.setVeiculo(v);
        
        Mecanico m = new Mecanico(2500, "Motor");
        Mecanico m2 = new Mecanico(300, "Suspencao");
        
        Servico s1 = new Servico("Troca de oleo", 1, 50);
        Servico s2 = new Servico("Alinhamento", 1, 30);
        
        s1.setMecanico(m);
        s2.setMecanico(m2);

        s1.setTempoReal(1);
        s2.setTempoReal(1);

        os.addServico(s1);
        os.addServico(s2);

        Orcamento orc = new Orcamento(200);

        Pecas p1 = new Pecas("Filtro de oleo", 40);
        Pecas p2 = new Pecas("Oleo", 80);

        orc.addPecas(p1);
        orc.addPecas(p2);

        os.setOrcamento(orc);

        os.execucao();
        os.concluir();

        os.getInfo();
    }
}