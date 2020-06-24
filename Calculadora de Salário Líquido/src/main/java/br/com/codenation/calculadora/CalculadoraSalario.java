package br.com.codenation.calculadora;


public class CalculadoraSalario {
	public long calcularSalarioLiquido(double salarioBase) {
		if (salarioBase<1039.00) {
			return Math.round(0.0);
		} else {
			double salarioBruto = calcularInss(salarioBase);
			double salarioLiquido = calcularIRRF(salarioBruto);
			return Math.round(salarioLiquido);
		}
	}

	private double calcularInss(double salarioBase) {
		if (salarioBase<0) {
			throw new IllegalArgumentException("Não é possível inserir números negativos");
		} else if (salarioBase<=1500.00) {
			salarioBase -= salarioBase*0.08;
		} else if (salarioBase<=4000.00) {
			salarioBase -= salarioBase * 0.09;
		} else {
			salarioBase -= salarioBase * 0.11;
		}
		return salarioBase;
	}

	private double calcularIRRF(double salarioBruto) {
		if (salarioBruto<=3000.00) {
			salarioBruto = salarioBruto;
		} else if (salarioBruto<=6000.00) {
			salarioBruto -= salarioBruto*0.075;
		} else if (salarioBruto>6000.00) {
			salarioBruto -= salarioBruto*0.15;
		}
		return salarioBruto;
	}

}
