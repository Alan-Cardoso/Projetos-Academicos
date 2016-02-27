package AulasCursoExtencao;

public class TipoSala extends Sala {
	
	public void getSala() {

		Sala sala = new Sala();
		
		tipo = "Informatica";

	}
	
	public static void main (String[] args){
		
		TipoSala tipoSala = new TipoSala();
		tipoSala.getSala();
		
		System.out.println(Sala.tipo);
	}
	
	

}
