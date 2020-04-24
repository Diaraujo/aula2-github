package application_contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import contrato_service.PaypalService;
import contrato_service.ServicoContrato;
import sistema_contrato.Contrato;
import sistema_contrato.Parcelas;



public class Application {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Number: ");
		int numero = sc.nextInt();
		
		System.out.print("Data (dd/MM/aaaa): ");
		Date data = sdf.parse(sc.next());
		System.out.println("Valor do Contrato: ");
		Double valorTotal = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com o numero de Parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new PaypalService());
		
		servicoContrato.processarContrato(contrato, n);
		
		System.out.println("Parcelas: ");
		for(Parcelas x: contrato.getParcela()) {
			System.out.println(x);
		}
		
		
		sc.close();
	}

}
