package contrato_service;

public interface ServicoPagamentoOnline {

	
	double taxaDePagamento(double valor);
	double juros(double valor, int mes);
	
	
}
