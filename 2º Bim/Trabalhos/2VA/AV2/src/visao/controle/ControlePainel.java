package visao.controle;

import visao.TelaCadastro;
import visao.TelaInicial;
import visao.TelaTabela;

public class ControlePainel {
	private static ControlePainel instance;
	private TelaCadastro telaCadastro;
	private TelaTabela telaTabela;
	private TelaInicial telaInicial;
	
	private ControlePainel() {
		telaCadastro = new TelaCadastro();
		telaTabela = new TelaTabela(this);
		telaInicial = new TelaInicial();
	}
	
	public TelaCadastro getTelaCadastro() {
		return telaCadastro;
	}

	public TelaTabela getTelaTabela() {
		return telaTabela;
	}

	public TelaInicial getTelaInicial() {
		return telaInicial;
	}

	public static ControlePainel getInstance() {
		if (instance == null) {
			instance = new ControlePainel();
		}
		return instance;
	}
}
