package entities;

public final class ProdutoImportado extends Produto{
    private double taxaImportacao;

    public ProdutoImportado (){
        super();
    }
    public ProdutoImportado (String nome, double preco, double taxaImportacao){
        super(nome,preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao(){
        return taxaImportacao;
    }
    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularValorFinal(){
        return getPreco() + getTaxaImportacao();
    }
    @Override
    public String etiquetarPreco(){
        return "Etiquetas: \n" + getNome() + " $" +  calcularValorFinal() + (" Taxa de importação: $" + getTaxaImportacao());
    }

}
