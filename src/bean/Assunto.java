package bean;

public class Assunto {
	private int codigo;
	private String descricao;
	
	public Assunto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
