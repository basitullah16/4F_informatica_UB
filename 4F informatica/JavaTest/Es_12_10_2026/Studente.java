public static class Studente {
    private final String nome;
    private final String cognome;

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    public void lavoro() {
        System.out.println("sto studiando");
    }
    public String getnome(){return nome;}
    public String getcognome(){return cognome;}
}
public static class Persona extends Studente {

    public Persona(String nome, String cognome) {
        super(nome, cognome); 
    }

    @Override
    public void lavoro() {
        System.out.println("sto lavorando");
    }
}
    public static void main(String[] args) {
        Studente s1 = new Studente("Luca", "Rossi");
        Persona p1 = new Persona("Daniele", "Marras");

        s1.lavoro();
        p1.lavoro();  
    }