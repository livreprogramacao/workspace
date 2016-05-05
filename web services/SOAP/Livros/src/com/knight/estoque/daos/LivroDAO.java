package com.knight.estoque.daos;

import com.knight.estoque.modelos.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class LivroDAO {

    public List<Livro> listarLivros() {
        List<Livro> livros = new ArrayList<>();
        Livro livro = new Livro(1L, "Titulo Livro 01", "Assunto Livro 01");
        livros.add(livro);
        return livros;
    }
    
}
