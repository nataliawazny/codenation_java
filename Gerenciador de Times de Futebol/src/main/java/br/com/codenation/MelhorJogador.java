package br.com.codenation;

public class MelhorJogador implements Comparable<MelhorJogador> {

    private Long id;
    private Integer nivelHabilidade;

    public MelhorJogador(Long id, Integer nivelHabilidade) {
        this.id = id;
        this.nivelHabilidade = nivelHabilidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(Integer nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

    @Override
    public int compareTo(MelhorJogador o) {
        return  o.getNivelHabilidade() - this.getNivelHabilidade();
    }
}
