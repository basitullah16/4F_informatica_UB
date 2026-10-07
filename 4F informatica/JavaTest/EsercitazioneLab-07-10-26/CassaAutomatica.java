 public class CassaAutomatica {
    private double totale;

    public CassaAutomatica() {
        this.totale = 0.0;
    }

    public void aggiungiPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.totale += prezzo;
        }
    }

    public double getTotale() {
        return this.totale;
    }

    public double calcolaResto(double importoPagato) {
        if (importoPagato >= this.totale) {
            double resto = importoPagato - this.totale;
            this.totale = 0.0;
            return resto;
        } else {
            return -1.0;
        }
    }

    public void nuovaSpesa() {
        this.totale = 0.0;
    }

    public static void main(String[] args) {
        CassaAutomatica cassa = new CassaAutomatica();

        cassa.aggiungiPrezzo(2.50);
        cassa.aggiungiPrezzo(1.20);
        cassa.aggiungiPrezzo(5.30);

        System.out.println("Totale: " + cassa.getTotale());

        double pagamento = 10.00;
        double resto = cassa.calcolaResto(pagamento);

        if (resto >= 0) {
            System.out.println("Pagamento: " + pagamento);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Importo insufficiente");
        }
    }
}