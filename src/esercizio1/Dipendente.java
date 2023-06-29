package esercizio1;

public class Dipendente {
	private double stipendioBase = 1000;
	private int matricola;
    private double stipendio;
    private double importoOraStra;
	private Livello livello;
	private Dipartimento dipartimento;
	
	
	public Dipendente(int matricola, double importoOraStra, Livello type, Dipartimento tipo) {
		this.matricola = matricola;
		this.stipendio = calcStipendio(this.livello);
		this.importoOraStra = importoOraStra;
		this.livello = type;
		this.dipartimento = tipo;
	}
	
	public Dipendente(int matricola, Dipartimento tipo ) {
		this.matricola = matricola;
		this.dipartimento = tipo;
		this.stipendio = this.stipendioBase;
		this.importoOraStra = 30;
		this.livello = Livello.OPERAIO;
	}
	
	public double calcStipendio(Livello liv) {
		if (liv == Livello.IMPIEGATO) {
			return this.stipendio = this.stipendioBase * 1.2;
		} else if (liv == Livello.QUADRO) {
			return this.stipendio = this.stipendioBase * 1.5;
		} else if (liv == Livello.DIRIGENTE) {
			return this.stipendio = this.stipendioBase * 2;
		}
		return this.stipendio = this.stipendioBase;
	}

	//Get

	public double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}


	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOraStra() {
		return importoOraStra;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	//Set
	
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public void setLivello(Livello livello) {
		this.livello = livello;
	}
	
	//Metodi
	
	public void stampaDatiDipendente() {
		System.out.println("Dati dipendente: \n Matricola: " + this.matricola + "\n Stipendio: " + this.stipendio
				+ "\n Importo Straordinario all'ora: " + this.importoOraStra + "\n Livello: " + this.livello
				+ "\n Dipartimento: " + this.dipartimento);
	}
	
	public void dichiaraPromozione(String promozione) {
				switch (promozione) {
				case "operaio": {
				System.out.println("Da operaio sei stato promosso a impiegato");
				this.livello = Livello.IMPIEGATO;
				this.stipendio = (this.stipendio * 1.2);
					break;
				}
				case "impiegato": {
					System.out.println("Da impegato sei stato promosso a quadro");
					this.livello = Livello.QUADRO;
					this.stipendio = (this.stipendio * 1.5);
					break;
				}
				case "quadro": {
					System.out.println("Da quadro sei stato promosso a dirigente");
					this.livello = Livello.DIRIGENTE;
					this.stipendio = (this.stipendio * 2);
					break;
				}
				case "dirigente": {
					System.out.println("Non lo puoi promuovere");
					break;
				}
				}
	}

	// Metodi statici

	public static double calcolaPaga(Dipendente d) {
		return d.stipendio;
	}
//
//	public static double calcolaPaga(Dipendente d, int ore) {
//		return d.stipendio;
//	}
	
}
