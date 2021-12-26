public class Musicas {
    protected String tipo,titulo, album, compositor, interprete, ano, tamanho, velocidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public Musicas(String tipo,String titulo, String album, String compositor, String interprete, String ano, String tamanho, String velocidade) {
        this.tipo= tipo;
        this.titulo = titulo;
        this.album = album;
        this.compositor = compositor;
        this.interprete = interprete;
        this.ano = ano;
        this.tamanho = tamanho;
        this.velocidade = velocidade;

    }

    @Override
    public String toString() {
        return " Musicas " +
                "tipo= '" + tipo + '\'' +
                ", titulo= '" + titulo + '\'' +
                ", album= '" + album + '\'' +
                ", compositor= '" + compositor + '\'' +
                ", interprete= '" + interprete + '\'' +
                ", ano= '" + ano + '\'' +
                ", tamanho= '" + tamanho + '\'' +
                ", velocidade= '" + velocidade + '\'' +"\n";
    }
}
    class CD extends Musicas {

        public CD(String titulo, String album, String compositor, String interprete, String ano) {
            super("CD",titulo, album, compositor, interprete, ano,"NULL", "NULL");
        }
    }

    class LP extends Musicas{

        public LP(String titulo, String album, String compositor, String interprete, String ano, String velocidade) {
            super("LP", titulo, album, compositor, interprete, ano,"NULL", velocidade);
        }
    }

    class MP3 extends Musicas{

        public MP3(String titulo, String album, String compositor, String interprete, String ano, String tamanho) {
            super("MP3", titulo, album, compositor, interprete, ano, tamanho,"NULL");
        }
    }

