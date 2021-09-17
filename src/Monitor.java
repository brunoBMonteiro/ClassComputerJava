
public class Monitor {
	private String marca;
	private String modelo;
	private String tamanhoMonitor;
	
	public Monitor(String marca, String modelo, String tamanhoMonitor) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanhoMonitor = tamanhoMonitor;  
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanhoMonitor() {
		return tamanhoMonitor;
	}
	public void setTamanhoMonitor(String tamanhoMonitor) {
		this.tamanhoMonitor = tamanhoMonitor;
	}
	
	public void exibeDados() {
		System.out.println("------CONFIGURAÇÔES DO MONITOR------");
		System.out.println("Modelo de processador :" + marca);
		System.out.println("Modelo de processador :" + modelo);
		System.out.println("Modelo de processador :" + tamanhoMonitor);
		System.out.println("-------------------------------------");
	}
}
