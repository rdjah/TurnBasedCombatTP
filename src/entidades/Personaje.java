package entidades;

public class Personaje {
	static int PUNTOSTOTALES_INICIALES=200;
	static int PUNTOSEVASION_MAXIMOS=80;
	static int PUNTOSDEFENSA_MAXIMO=20;
	static int PUNTOSPORPARTIDAGANADA=10;
	
	private int codigo;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	
	private int usoEnergia;
	private int daño;
	
	
	//es necesario?
	//en base de datos esta igual
	public Personaje(){
		this.vida=0;
		this.defensa=0;
		this.energia=0;
		this.evasion=0;
		this.puntosTotales=PUNTOSTOTALES_INICIALES;
		//?
		this.usoEnergia=0;
		this.daño=0;
	}
	
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


    //se puede mejorar?
	public boolean validarPuntosAsignados() {
		boolean rta;
		int aux;
		
		aux=defensa+vida+energia+evasion;
		
		if (aux<=puntosTotales && evasion<=PUNTOSEVASION_MAXIMOS && defensa<=PUNTOSEVASION_MAXIMOS) {
			rta=true;
		} else {
			rta=false;

		}
		return rta;
	}
	

	public int getUsoEnergia() {
		return usoEnergia;
	}

	public void setUsoEnergia(int usoEnergia) {
		this.usoEnergia = usoEnergia;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public boolean equals(String nombre){
		return  (nombre == this.getNombre());
	}
	
	//esta bien?
	public boolean equals(Object p){
		return ((p instanceof Personaje) && ((Personaje)p).getNombre().equals(this.getNombre()) );
	}
	
		
	public boolean evadeAtaque(){
	    boolean respuesta;
		double numAleatorio=Math.random();
		
		if ((numAleatorio*100)>this.getEvasion()) {
			respuesta=true;
		} else {
			respuesta=false;
		}
	    
	    return respuesta;
	}
	
	
	public int getEnergiaActual(){
		return energia-usoEnergia;
	}
	
	
	public int getVidaActual(){
		return vida-daño;
	}
	
	public void recibeAtaque(int puntosAtaque){
		if(!evadeAtaque()){
		daño=daño+puntosAtaque;
		}
	}
	
	
	public void ataca(int puntosAtaque){
		usoEnergia=usoEnergia+puntosAtaque;
	}
	
	
	public void aumentaPuntosTotales(){
		puntosTotales=puntosTotales+PUNTOSPORPARTIDAGANADA;
	}

}
