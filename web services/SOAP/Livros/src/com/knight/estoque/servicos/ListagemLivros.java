package com.knight.estoque.servicos;

import com.knight.estoque.daos.LivroDAO;
import com.knight.estoque.modelos.Livro;
import java.util.List;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ListagemLivros {

    public List<Livro> listarLivros() {
        LivroDAO livroDAO = obterDAO();
        return livroDAO.listarLivros();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/livros",
                new ListagemLivros());
        System.out.println("Serviço inicializado!");
    }

    private LivroDAO obterDAO() {
        return new LivroDAO();
    }
}
