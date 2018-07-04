package visao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Dinossauro;

@SuppressWarnings("serial")
public class TelaTabelaModelo extends AbstractTableModel {

	// Constantes representando o índice das colunas
	private static final int CODIGO = 0;
	private static final int NOME = 1;
	private static final int NOME_CIENTIFICO = 2;
	private static final int PERIODO = 3;
	private static final int PESO = 4;
	private static final int TAMANHO = 5;
	private static final int ALIMENTACAO = 6;
	private static final int DESCRICAO = 7;

	// Lista de Dinossauros a serem exibidos na tabela
	private List<Dinossauro> linhas;

	// Nome das colunas.
	private String[] colunas = new String[] { "Código", "Nome", "Nome Científico", "Período", 
			"Peso", "Tamanho", "Alimentação", "Descrição"};

	// Cria tabela sem linhas
	public TelaTabelaModelo() {
		linhas = new ArrayList<Dinossauro>();
	}

	// Cria tabela contendo a lista recebida por parâmetro
	public TelaTabelaModelo(List<Dinossauro> listaDinossauros) {
		linhas = new ArrayList<Dinossauro>(listaDinossauros);
	}

	@Override
	public int getRowCount() {
		return linhas.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case CODIGO:
			return String.class;
		case NOME:
			return String.class;
		case NOME_CIENTIFICO:
			return String.class;
		case PERIODO:
			return String.class;
		case PESO:
			return String.class;
		case TAMANHO:
			return String.class;
		case ALIMENTACAO:
			return String.class;
		case DESCRICAO:
			return String.class;
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Dinossauro dinossauro = linhas.get(rowIndex);

		switch (columnIndex) {
		case CODIGO:
			return dinossauro.getCodigo();
		case NOME:
			return dinossauro.getNome();
		case NOME_CIENTIFICO:
			return dinossauro.getNome_cientifico();
		case PERIODO:
			return dinossauro.getPeriodo();
		case PESO:
			return dinossauro.getPeso();
		case TAMANHO:
			return dinossauro.getTamanho();
		case ALIMENTACAO:
			return dinossauro.getAlimentacao();
		case DESCRICAO:
			return dinossauro.getDescricao();
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		@SuppressWarnings("unused")
		Dinossauro dinossauro = linhas.get(rowIndex);
		fireTableCellUpdated(rowIndex, columnIndex);
	}

	public Dinossauro getDinossauro(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addDinossauro(Dinossauro dinossauro) {
		linhas.add(dinossauro);

		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	
	public void removeDinossauro(int indiceLinha) {
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}

	public void addListaDeDinossauros(List<Dinossauro> dinossauros) {
		int indice = getRowCount();
		linhas.addAll(dinossauros);
		fireTableRowsInserted(indice, indice + dinossauros.size());
	}

	public void limpar() {
		linhas.clear();
		fireTableDataChanged();
	}
}