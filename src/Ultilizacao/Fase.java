package Ultilizacao;
public class Fase {
    private String txt;
    private int erros, acertos, index, nivel, exercicio, i, j;
    private float duracao;
    private boolean concluida=false;
    
    private final String dado[][] = {
        {
            "1|1QAZWSX",
            "1|2ZAQXSW",
            "1|3EDCRFV",
            "1|4CDEVFR",
            "1|5TGBYHN",
            "1|6BGTNHY",
            "1|7OKMIJN",
            "1|8ESZRDX",
            "1|9TFCYGV",
            "1|10RTFGBV"
        },
        {   "2|1QWERTY",
            "2|2EWDSXC",
            "2|3TGVFBG",
            "2|4HTDESQ",
            "2|5ERFDSW",
            "2|6IRJFHG",
            "2|7ZQWXCE",
            "2|8WRVDCH",
            "2|9RFDEWS",
            "2|10ERFRVF"            
        },
        {   "3|1",
            "3|2",
            "3|3",
            "3|4",
            "3|5",
            "3|6",
            "3|7",
            "3|8",
            "3|9",
            "3|10",
        },
        {   "4|1",
            "4|2",
            "4|3",
            "4|4",
            "4|5",
            "4|6",
            "4|7",
            "4|8",
            "4|9",
            "4|10"
        }
    };
    //Contrutora        
    public Fase(int i, int j){
        this.txt = dado[i][i];
        this.nivel = i+1;
        this.exercicio = j+1;
        this.i = i;
        this.j = j;
    }
    
    //Getes e Setes
    public String getTxt() {
        return txt;
    }
    
    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
        concluida = true;
    }
    
    public boolean isConcluida() {
        return concluida;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }  

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExercicio() {
        return exercicio;
    }

    public void setExercicio(int exercicio) {
        this.exercicio = exercicio;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setTxt(int nv, int exe) {
        this.txt = dado[nv][exe];
    }
    
    
}
