package br.tec.itlabs;

public class Principal {

    public static void main(String[] args) {
        InnerServicoEmail servico = new InnerServicoEmail();

        InnerServicoEmail.Mensagem mensagem = new InnerServicoEmail.Mensagem(
                "joao@algaworks.com", "maria@algaworks.com",
                "Olá, tudo bem?");

        servico.enviar(mensagem);
    }
}
