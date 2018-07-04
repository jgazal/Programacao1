package controle;

public class ControleExemplo {
	public String fazAlgumaCoisa(String parametro) {
		parametro=parametro!=null?parametro:"";
		/*if(parametro!=null) {
			parametro = parametro;
		}else {
			parametro = "";
		}*/
		return parametro.toUpperCase();
	}
}
