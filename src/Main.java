import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtoArrayList = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < x; i++) {
            System.out.println("Produto n# " + (i + 1) + ": ");
            System.out.print("Comum, usado ou importado? (c/u/i): ");
            String y = sc.nextLine();


            if (y.equals("c")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor: ");
                double preco = sc.nextDouble();

                Produto produto = new Produto(nome, preco);
                produtoArrayList.add(produto);

            } else if (y.equals("u")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor: ");
                double preco = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite a data de manufatura no formato dd/mm/aaaa: ");
                String dataString = sc.nextLine();
                Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                ProdutoUsado produtoUsado = new ProdutoUsado(nome, preco, dataString);
                produtoArrayList.add(produtoUsado);
            } else if (y.equals("i")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor: ");
                double preco = sc.nextDouble();
                sc.nextLine();
                System.out.print("Taxa de importação: ");
                double taxaImportacao = sc.nextDouble();

                ProdutoImportado produtoImportado = new ProdutoImportado(nome, preco, taxaImportacao);
                produtoArrayList.add(produtoImportado);
            }sc.nextLine();
        }sc.close();
    }
}