package entidades;

public class Personaje {
	
	private int codigo;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getEvasion() {
		return evasion;
	}
	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}
	public int getPuntosTotales() {
		return puntosTotales;
	}
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	//valida que la suma total de los puntos del personaje sea la correcta
	//es necesario validar un tope minimo o maximo en alguno de los atributos?
	public boolean validarPuntosAsignados() {
		boolean rta;
		int aux;
		aux=defensa+vida+energia+evasion;
		//remplazar el 200 por una variable?
		if (aux==200) {
			rta=true;
		} else {
			rta=false;

		}
		return rta;
	}

}