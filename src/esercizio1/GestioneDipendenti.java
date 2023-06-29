package esercizio1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente op1 = new Dipendente(279226, 10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente op2 = new Dipendente(385326, 10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente imp1 = new Dipendente(339401, 20, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dir1 = new Dipendente(410206, 50, Livello.DIRIGENTE, Dipartimento.VENDITE);
		System.out.println(op1.getDipartimento());
		System.out.println(op1.getMatricola());
		System.out.println(op1.getStipendio());

		op1.dichiaraPromozione("operaio");
		System.out.println();
		imp1.dichiaraPromozione("impiegato");
		System.out.println();
		// Stampo i loro stati
		op1.stampaDatiDipendente();
		System.out.println();
		op2.stampaDatiDipendente();
		System.out.println();
		imp1.stampaDatiDipendente();
		System.out.println();
		dir1.stampaDatiDipendente();
		System.out.println();

		Dipendente.calcolaPaga(op1);
		System.out.println("Operaio promosso. Nuovo stipendio: \n" + Dipendente.calcolaPaga(op1));

		System.out.println();
		System.out.println("Paga con ore in più:");
		Dipendente.calcolaPaga(op1, 5);
		System.out.println("Operaio promosso a Impiegato:");
		System.out.println(Dipendente.calcolaPaga(op1, 5));
		System.out.println("Operaio2");
		System.out.println(Dipendente.calcolaPaga(op2, 5));
		System.out.println("Impiegato promosso a Quadro:");
		System.out.println(Dipendente.calcolaPaga(imp1, 5));
		System.out.println("Dirigente");
		System.out.println(Dipendente.calcolaPaga(dir1, 5));
	}

}
