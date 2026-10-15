import java.util.Objects;
 class Squadra {
    private String nome;
    private int goalFatti;

    // Costruttore standard
    public Squadra(String nome, int goalFatti) {
        this.nome = nome;
        this.goalFatti = goalFatti;
    }

    // 1. SOLUZIONE PROBLEMA 1: Costruttore di copia (Copy Constructor)
    public Squadra(Squadra altraSquadra) {
        this.nome = altraSquadra.nome;
        this.goalFatti = altraSquadra.goalFatti;
    }

    // Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getGoalFatti() { return goalFatti; }
    public void setGoalFatti(int goalFatti) { this.goalFatti = goalFatti; }
    
    // 2. SOLUZIONE PROBLEMA 2: Override di equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Squadra squadra = (Squadra) o;
        return goalFatti == squadra.goalFatti && Objects.equals(nome, squadra.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, goalFatti);
    }
}


public class Main {
    public static void main(String[] args) {
        // 1. Creiamo la squadra originale
        Squadra s1 = new Squadra("Leoni", 12);

        // --- PROBLEMA 1 RISOLTO ---
        // Usiamo il costruttore di copia invece di assegnare il riferimento
        Squadra s2 = new Squadra(s1); 
        
        s2.setGoalFatti(20); // Modifichiamo i goal della copia
        
        System.out.println("Goal squadra originale (s1): " + s1.getGoalFatti()); 
        // Stampa 12 (Corretto! L'originale rimane intatto)

        // --- PROBLEMA 2 RISOLTO ---
        // Creiamo una terza squadra con gli stessi identici dati di s1
        Squadra s3 = new Squadra("Leoni", 12);
        
        System.out.println("s1 è uguale a s3? " + s1.equals(s3));
        // Stampa true perché confrontiamo i valori interni anziché i riferimenti in memoria
    }
}