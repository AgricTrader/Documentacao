package AgricTrader;
import java.time.LocalDate;

public class Estoque {
	
	//atributos da classe
	private int usuario_id;
	private int produto_id;
	private float qtd;
	private float vlr;
	private String observacao;
	private String condicao_armazenamento;
	private LocalDate data_disponibilidade;

	//construtor
	public Estoque(int usuario_id, int produto_id, float qtd, float vlr, String observacao,
			String condicao_armazenamento, LocalDate data_disponibilidade) {
		super();
		this.usuario_id = usuario_id;
		this.produto_id = produto_id;
		this.qtd = qtd;
		this.vlr = vlr;
		this.observacao = observacao;
		this.condicao_armazenamento = condicao_armazenamento;
		this.data_disponibilidade = data_disponibilidade;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		this.qtd = qtd;
	}

	public float getVlr() {
		return vlr;
	}

	public void setVlr(float vlr) {
		this.vlr = vlr;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCondicao_armazenamento() {
		return condicao_armazenamento;
	}

	public void setCondicao_armazenamento(String condicao_armazenamento) {
		this.condicao_armazenamento = condicao_armazenamento;
	}

	public LocalDate getData_disponibilidade() {
		return data_disponibilidade;
	}

	public void setData_disponibilidade(LocalDate data_disponibilidade) {
		this.data_disponibilidade = data_disponibilidade;
	}
	
	//consultar estoque
	public void Consultar() {
		
	}
	
	//inserir produto no estoque
	public void Inserir() {
		
	}
	
	//atualizar o estoque
	public void Atualizar() {
		
	}

}
