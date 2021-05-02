package com.nickmafra.projetosimples.dto;

import java.time.LocalDateTime;

public class MensagemDto {

    private Integer id;

    private String nomeAutor;

    private String titulo;

    private String conteudo;

    private LocalDateTime dataPostagem;

    public MensagemDto() {
    }

    public MensagemDto(Integer id, String nomeAutor, String titulo, String conteudo, LocalDateTime dataPostagem) {
        this.id = id;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
}
