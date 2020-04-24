package sistema_contrato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	
	public Integer numero;
	public Date data;
	public Double valorTotal;
	
	private List<Parcelas> parcela = new ArrayList<>();
	
	public Contrato() {
		
	}


	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public List<Parcelas> getParcela() {
		return parcela;
	}
	
	public void addParcela(Parcelas parcelas) {
		parcela.add(parcelas);
	}


	public void removeParcela(Parcelas parcelas) {
		parcela.remove(parcelas);
	}
	
	
}
