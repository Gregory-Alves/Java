package com.gregory.cursojava.aula52.exer;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void addContato(Contato contato) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }

        if(cheia){
            //lancar exceotion aqui
            throw new AgendaCheiaException();
        }
    }

    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (Contato c : contatos) {
            if (c != null && c.getNome().equalsIgnoreCase(nome)) {
                System.out.println(c);
                return c.getId();
            }
        }
        //lancar exception contato nao existe
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
