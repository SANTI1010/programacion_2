
public class Jugador {

	private String nombre;
	private int puntos;
	
	public Jugador(String nn)  {
		nombre = nn;
		puntos = 0;
	}

	public int getPuntos() {
		return puntos;
	}

	public int tirarDados(Cubilete vaso) {
		return vaso.tirar(); //tiro el cubilete
	}

	public void incremetarPuntos() {
		puntos ++;
	}


	public String getNombre(){
		return nombre;
	}
	


	
	
}
