package cadastropoo;

import model.PessoaFisica;

public class CadastroPOO {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica =
                new PessoaFisica(
                        2,
                        "André Luis Kunert",
                        "041.975.389-36",
                        44

                );

        PessoaJuridica pessoaJuridica =
                new PessoaJuridica(
                );

        System.out.println("===== PESSOA FÍSICA =====");
        pessoaFisica.exibir();

        System.out.println();

        System.out.println("===== PESSOA JURÍDICA =====");
        pessoaJuridica.exibir();
    }
}