package app;

import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Contato> agenda = new ArrayList<Contato>();

    public Agenda(){}

    public void addContato(Contato contato){
        int id = agenda.size();
        contato.setId(id);
        this.agenda.add(contato);
    }

    public ArrayList<Contato> getAgenda(){
        return this.agenda;
    }

    public Contato getContato(int id){
        return agenda.get(id);
    }

    public void editContato(Contato contato) {
        int id = contato.getId();
        agenda.get(id).setNome(contato.getNome());
        agenda.get(id).setTelefone(contato.getTelefone());
        agenda.get(id).setEmail(contato.getEmail());
    }

    public void removeContato(int id) {
        agenda.remove(getContato(id));
    }
}
