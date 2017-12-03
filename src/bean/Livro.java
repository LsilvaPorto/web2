package bean;

public class Livro {

	private int codigo, ano, paginas;
	private String titulo, imagem;
	private double preco;
	private char status;

	public Livro(int codigo, int ano, int paginas, String titulo, String imagem, char status, double preco){
		
		this.codigo = codigo;
		this.ano = ano;
		this.paginas = paginas;
		this.titulo = titulo;
		this.imagem = imagem;
		this.status = status;
		this.preco = preco;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
