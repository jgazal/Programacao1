package visao.controle;

import javax.swing.JFrame;

import visao.Tela01;
import visao.TelaPrincipal;

public class VisaoControlePrincipal {
	//cada Janela da aplicação deve ter uma variável para ela
	private TelaPrincipal telaPrincipal = null;
	private Tela01 tela01 = null;
	// para saber quem está sendo exibido no momento
	private JFrame telaExibindo = null;
	
	//no construtor somente a janela principal é criada as outras serão criadas quando necessário
	public VisaoControlePrincipal() {
		telaPrincipal = new TelaPrincipal(this);
	}

	public void fecharTelaExibindo() {
		if(telaExibindo!=null) {
			telaExibindo.dispose();
		}
	}
	public void exibirTelaPrincipal() {
		this.fecharTelaExibindo();
		telaExibindo = telaPrincipal;
		telaExibindo.setVisible(true);
	}
	
	public void exibirTela01() {
		this.fecharTelaExibindo();
		this.tela01 = new Tela01(this);
		telaExibindo = tela01;
		telaExibindo.setVisible(true);
	}
	public static void main(String[] args) {
		VisaoControlePrincipal ctl = new VisaoControlePrincipal();
		ctl.exibirTelaPrincipal();
	}
}
