package classe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alan_
 *
 */
@SuppressWarnings("rawtypes")
public class TesteEstagio {

	@SuppressWarnings("unchecked")
	static class Venda {

		static int codvendedor;
		static String mes_ano;
		static double valor;

		public static int getCodvendedor() {
			return codvendedor;
		}

		public void setCodvendedor(int codvendedor) {
			Venda.codvendedor = codvendedor;
		}

		public static String getMes_ano() {
			return mes_ano;
		}

		public void setMes_ano(String mes_ano) {
			Venda.mes_ano = mes_ano;
		}

		public static double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			Venda.valor = valor;
		}
	}

	List<Venda> venda = new ArrayList<Venda>();
	String data;

	@SuppressWarnings("unused")
	void vendaMes(int mes, int ano) {

		String sql = "SELECT codVendedor, total FROM venda WHERE data " + " = " + (mes + "/" + ano) + " ";

		while (true) {
			venda.setCodvendedor(getInt("codvendedor"));
			venda.setmes_ano(getString("mes_ano"));
			venda.setvalor(getDouble("valor"));
		}
		data = ((mes + 1) + "/" + ano);
	}

	@SuppressWarnings("unused")
	void proxMeta() {

		for (int i = 0; i < venda.size(); i++) {
			String sql = "INSERT INTO meta " + "(codvendedor, mes_ano,valor)" + " values ('" + Venda.getCodvendedor() + "','" + data + "', '" + (Venda.getValor() + 0.05) + "')";
		}

	}
}