package sistema_contrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

	public Date dataVenc;
	public Double quantidade;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelas() {
		
	}

	public Parcelas(Date dataVenc, Double quantidade) {
		this.dataVenc = dataVenc;
		this.quantidade = quantidade;
	}
	
	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataVenc) + " - " + String.format("%.2f", quantidade);
	
}

}