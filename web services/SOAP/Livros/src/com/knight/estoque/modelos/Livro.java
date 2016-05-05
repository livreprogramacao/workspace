package com.knight.estoque.modelos;

/**
 *
 * @author user
 */
public class Livro {

    public Livro(long l, String titulo_Livro_01, String assunto_Livro_01) {
        this.id = l;
        this.titulo = titulo_Livro_01;
        this.assunto = assunto_Livro_01;
    }

    private String titulo;

    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String assunto;

    /**
     * Get the value of assunto
     *
     * @return the value of assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * Set the value of assunto
     *
     * @param assunto new value of assunto
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    private Long id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(Long id) {
        this.id = id;
    }

}
