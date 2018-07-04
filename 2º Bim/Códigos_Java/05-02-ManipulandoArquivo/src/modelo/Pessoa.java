package modelo;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable{
	private int id;
	private String nome;
	private Date dataNascimento;
	private boolean viva;
	
	public Pessoa(int id, String nome, Date dataNascimento, boolean viva) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.viva = viva;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento.getDay()+"/"+dataNascimento.getMonth()+"/"+dataNascimento.getYear() + ", viva=" + viva + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isViva() {
		return viva;
	}
	public void setViva(boolean viva) {
		this.viva = viva;
	}
}
