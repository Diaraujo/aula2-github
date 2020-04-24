package contrato_service;

public class PaypalService implements ServicoPagamentoOnline {

	
	private static final double PORCENTAGEM_TAXA = 0.02;
	private static final double JUROS_MENSAL = 0.01;

	@Override
	public double taxaDePagamento(double amount) {
		return amount * PORCENTAGEM_TAXA;
	}

	@Override
	public double juros(double amount, int months) {
		return amount * JUROS_MENSAL * months;
	}
	
}
