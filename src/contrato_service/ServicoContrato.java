package contrato_service;

import java.util.Calendar;
import java.util.Date;

import sistema_contrato.Contrato;
import sistema_contrato.Parcelas;

public class ServicoContrato {

	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processarContrato(Contrato contrato, int mes) {
		
		double basicQuota = contrato.getValorTotal() / mes;
        for (int i = 1; i <= mes; i++) {
            Date date = addMonths(contrato.getData(), i);
            double updatedQuota = basicQuota + servicoPagamentoOnline.juros(basicQuota, i);
            double fullQuota =  updatedQuota + servicoPagamentoOnline.taxaDePagamento(updatedQuota);
            contrato.addParcela(new Parcelas(date, fullQuota));
        }
	    }
	
        private Date addMonths(Date date, int n) {
    		Calendar cal = Calendar.getInstance();
    		cal.setTime(date);
    		cal.add(Calendar.MONTH, n);
    		return cal.getTime();
    	}
	
}
