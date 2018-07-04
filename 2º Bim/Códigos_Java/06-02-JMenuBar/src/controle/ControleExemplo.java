package controle;

public class ControleExemplo {
	public String fazAlgumaCoisa(String parametro) {
		parametro=parametro!=null?parametro:"";
		return parametro.toUpperCase();
	}
}
