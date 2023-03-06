package entities;

public class ProdutoUsado extends Produto{
    private String dataString;

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, double preco, String dataString) {
        super(nome, preco);
        this.dataString = dataString;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public String etiquetarPreco(){
        return "Etiquetas: \n" + getNome() + " $" + getPreco() + " Data de manufatura: " + getDataString();
    }
}

