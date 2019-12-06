package Ultilizacao;
public class Fase {
    private String txt;
    private int erros, acertos, index, nivel, exercicio, i, j;
    private float duracao;
    private boolean concluida=false;
    
    private final String dado[][] = {
        {   "aa bb cc dd ee ff gg hh ii jj kk ll mm nn oo pp qq rr ss tt uu vv xx ww yy zz",
            "aaa bbb ccc ddd fff ggg hhh iii jjj kkk lll mmm nnn ooo ppp qqq rr sss ttt uuu vvv xxx www yyy zzz",
            "ab cd ef gh ij kl mn op qr st uv xw yz ab cd ef gh ij kl mn op qr st uv xw yz",
            "abab cdcd efef ghgh ijij klkl mnmn opop qrqr stst uvuv xwxw yzyz abab cdcd efef ghgh ijij klkl mnmn opop qrqr stst uvuv xwxw yzyz",
            "az qsc wdv efb rgn thm yj uk il o pç az qsc wdv efb rgn thm yj uk il o pç.",
            "! @ # $ % &  % $ & * % $ & * + = _ - .,  + = _ - ., ; ? || //",
            "qw er ty ui op as df gh jk lç zx cv bnm qw er ty ui op as df gh jk lç zx cv bnm",
            "qwqw erer tyty uiui opop as dfdf dfdf jkjk lç zxzx zxzx bnmbnm qwqw erer erer uiui opop asas dfdf ghgh jk lç zx cv bnm",
            "çp lo ki mju nhy bgt vfr cde xsw zaq çp lo ki mju nhy bgt vfr cde xsw zaq",
            "çpçp lolo kiki mjumju nhynhy bgtbgt vfr vfr  cde xsw zaq çp lo ki mju nhy bgt vfr cde xsw zaq"
            
        },
        {
            "&Seja& &Muito& &Bem&-&Vindo& &ao& &nivel& &AMA&DOR Aqui& você vai aprender& a digitar mais rápido!!",
            "atoa ajos aiaj asak azoj alig ato ajjo aika atag agih amof azoj alih ajok aiaj ali ajoh aia ajo aia",
            "bem bom balAo bis bar bis bar bel boy bip bau bei bit bel boy bip bau bei bit",
            "com cpf cor cia Cal cem cio cru cá coC ce chO cau cao cachorro careca cerca chocolate cartola",
            "dodum eta elu eva emu efi dal dag doa doe dos duz dez num var float int double zebra zeca",
            "the walking dead fear, the walKinG DEaD ThE 100 !_  LOPP=1 for EhT DaED GniKlaw eht ,raef daed gniklaw eht",
            "luizito pimentinha preço do sucesso zeca henrique SeLvA AvLeS euqirneh acez ossecus od oçerp ahnitnemip otiziul",
            "a aticni euq otrepse atseomdA Admoesta esperto que incita a guerra Belicoso zurrar;; zanga- zangão zoológico proeza dureza",
            "Nesta semana estou me sentindo muito disposto. Disposto a continuar deitado em minha cama sem fazer nada.",
            "Sua opinião é muito importante para mim, vou até guardá-la aqui na caixa do esquecimento."
        },
        {   "Ensaia um sorriso"+
				"e oferece-o a quem não teve nenhum."+
				"Agarra um raio de sol"+
				"e desprende-o onde houver noite."+
				"Descobre uma nascente"+
				"e nela limpa quem vive na lama."+
				"Toma uma lágrima"+
				"e pousa-a em quem nunca chorou."+
				"Ganha coragem"+
				"e dá-a a quem não sabe lutar.",
            "Inventa a vida"+
				"e conta-a a quem nada compreende."+
				"Enche-te de esperança"+
				"e vive á sua luz."+
				"Enriquece-te de bondade"+
				"e oferece-a a quem não sabe dar."+
				"Vive com amor"+
				"e fá-lo conhecer ao Mundo.",
            "Acredite sempre no amor."+
				"Não fomos feitos para a solidão."+
				"Se você está sofrendo por amor,"+
				"está com a pessoa errada ou"+
				"amando de uma forma ruim para você. Caso tenha se separado,"+
				"curta a dor, mas se abra para outro amor."+
				"E se estiver amando, declare o seu amor.",
            "Cada vez mais, devemos exercer o"+
				"nosso direito de buscar o que queremos (sobretudo no amor)."+
				"Mas atenção: elegância e bom senso são fundamentais."+
				"Arrisque!"+
				"O amor não é para covardes.",
            "Quem fica a noite em casa sozinho, só terá que decidir que pizza pedir."+
				"E o único risco será o de engordar, mas"+
				"lembre-se. Curta muito a sua companhia."+
				"Casamento dá certo"+
				"para quem não é dependente.",
            "Aprenda a viver feliz - mesmo sem homem/mulher ao lado."+
				"Se não tiver com quem ir ao cinema,"+
				"vá com a pessoa mais fascinante:"+
				"VOCÊ!",
            "Não chame o meu amor de idolatria"+
				"Nem de ídolo realce a quem eu amo,"+
				"Pois todo o meu cantar a um só se alia,"+
				"E de uma só maneira eu o proclamo."+
				"É hoje e sempre o meu amor galante,"+
				"Inalterável, em grande excelência;",
            "Por isso a minha rima é tão constante"+
				"A uma só coisa e exclui a diferença."+
				"'Beleza, Bem, Verdade', eis o que exprimo;"+
				"'Beleza, Bem, Verdade', todo o acento;"+
				"E em tal mudança está tudo o que primo,"+
				"Em um, três temas, de amplo movimento."+
				"'Beleza, Bem, Verdade' sós, outrora;"+
				"Num mesmo ser vivem juntos agora.",
            "Saberás que não te amo e que te amo"+
				"posto que de dois modos é a vida,"+
				"a palavra é uma asa do silêncio,"+
				"o fogo tem uma metade de frio."+
				"Eu te amo para começar a amar-te,"+
				"para recomeçar o infinito"+
				"e para não deixar de amar-te nunca:"+
				"por isso não te amo ainda.",
            "Te amo e não te amo como se tivesse"+
				"em minhas mãos as chaves da fortuna"+
				"e um incerto destino desafortunado."+
				"Meu amor tem duas vidas para amar-te."+
				"Por isso te amo quando não te amo"+
				"e por isso te amo quando te amo.",
        },
        {   "Matéria-prima: Em marcenaria compreende-se por matéria-prima, todo o"
	            + "material que entra na confecção dos móveis, tendo por substância essencial a"
	            + "madeira. Definição da madeira. Madeira é uma substância compacta e sólida, que"
	            + "compõe as raízes, o tronco e as ramas das árvores e dos arbustos. E um conjunto de"
	            + "tecidos (parte sólida de um corpo organizado). Seu elemento fundamental é o tecido"
	            + "vascular, constituído de vasos compostos de longas células (pequenas cavidades"
	            + "sobrepostas topo a topo, em filas longitudinais ininterruptas).",
            "Rudimentos de Botânica. A água é o elemento mais necessário à vida vegetal.\n"
	            + "As raízes, que são órgãos de absorção, sugam da terra o alimento necessário à nutrição\n"
	            + "da planta. A raiz divide-se em três partes: corpo, que é a parte central, prolongamento\n"
	            + "do caule; colo ou nó vital, ponto em que o caule se separa da raiz, e as radículas, cujas\n"
	            + "extremidades, chamadas espongíolos, são os órgãos ativos da absorção.",
            "Caule é a parte da planta que cresce em sentido inverso ao da raiz e que-"
	            + "sustenta os galhos, as folhas, as flores e os frutos. Folha é o órgão respiratório das-"
	            + "plantas. Divide-se em duas partes: limbo e pecíolo. No limbo, que é uma lâmina verde-"
	            + "e chata, de várias formas, notam-se duas faces, uma superior, mais colorida, e outra"
	            + "inferior; a base, o vértice, a orla. As folhas transpiram pela face superior e absorvem a"
	            + "umidade pela face inferior. Realizam assim as suas duas importantes funções de",
            "Pecíolo. É assim chamada a parte da folha que prende o limbo ao galho ou ramo. Talo. Chama-se assim a fibra grossa que se estende pelo meio da folha,prolongando-se, às vezes, até confundir-se com o pecíolo.\n"
	            + "Nervuras são fibras salientes que percorrem a superfície das folhas de algumas"
	            + "plantas. E uma ramificação do talo. Parênquima. É o tecido que ocupa os espaços"
	            + "existentes entre as nervuras. Clorofila. É como se chama a matéria que determina a"
	            + "coloração das folhas. Seiva. Líquido que as raízes absorvem do seio da terra e que"
	            + "serve para a nutrição do vegetal a que pertencem. A seiva circula nos tecidos das"
	            + "plantas. Há duas espécies de seiva: a ascendente ou bruta, e a descendente ou"
	            + "elaborada. Esta é que alimenta o vegetal. Resina. Matéria inflamável, consistente e"
	            + "untuosa, de cor amarelada, que corre de certas árvores, tais como o pinheiro, a aroeira"
	            + "e, particularmente, as coníferas. Primeiro correm fluidas e depois se concretizam,"
	            + "oxidando-se em massas sólidas, quebradiças e translúcidas. Fibras são filamentos que"
	            + "se enc ontra em todos os vegetais, dispostos de diversas maneiras, constituindo as"
	            + "partes lenhosas.",
            "Crescimento das plantas. As camadas de lenho desenvolvem-se durante cada período de vegetação da planta, que começa na primavera e termina no outono. A madeira de primavera é fraca e mole; a de outono, pelo contrário, é consistente e dura. O número de camadas concêntcamadas internas constituem o cerne, e as periféricas, o alburno. No Brasil, o descanso das plantas é, a bem dizer, fictício, porque a natureza obriga-as quase que à mesma atividade. Em todas as estações do ano. As plantas, como as pessoas, estão sujeitas ao sono, à vigília, a amores e a repulsões, tanto como à sensação do frio, do calor e da luz.",
            "Um dia descobrimos que beijar uma pessoa para esquecer outra, é bobagem."+
				"Você não só não esquece a outra pessoa como pensa muito mais nela..."+
				"Um dia nós percebemos que as mulheres têm instinto 'caçador' e fazem qualquer homem sofrer ..."+
				"Um dia descobrimos que se apaixonar é inevitável..."+
				"Um dia percebemos que as melhores provas de amor são as mais simples..."+
				"Um dia percebemos que o comum não nos atrai..."+
				"Um dia saberemos que ser classificado como 'bonzinho' não é bom..."+
				"Um dia perceberemos que a pessoa que nunca te liga é a que mais pensa em você...",
            "Um dia percebemos que somos muito importante para alguém, mas não damos valor a isso..."+
				"Um dia percebemos como aquele amigo faz falta, mas ai já é tarde demais..."+
				"Enfim..."+
				"Um dia descobrimos que apesar de viver quase um século esse tempo todo não é suficiente para realizarmos todos os nossos sonhos, para beijarmos todas as bocas que nos atraem, para dizer o que tem de ser dito..."+
				"O jeito é: ou nos conformamos com a falta de algumas coisas na nossa vida ou lutamos para realizar todas as nossas loucuras...",
            "Não acredite em algo simplesmente porque ouviu. Não acredite em algo simplesmente porque todos falam a respeito. Não acredite em algo simplesmente porque está escrito em seus livros religiosos. Não acredite em algo só porque seus professores e mestres dizem que é verdade. Não acredite em tradições só porque foram passadas de geração em geração. Mas, depois de muita análise e observação, se você vê que algo concorda com a razão e que conduz ao bem e benefício de todos, aceite-o e viva-o.",
            "Desejo que você\n" +
                "Não tenha medo da vida, tenha medo de não vivê-la." +
                "Não há céu sem tempestades, nem caminhos sem acidentes." +
                "Só é digno do pódio quem usa as derrotas para alcançá-lo." +
                "Só é digno da sabedoria quem usa as lágrimas para irrigá-la." +
                "Os frágeis usam a força; os fortes, a inteligência." +
                "Seja um sonhador, mas una seus sonhos com disciplina," +
                "Pois sonhos sem disciplina produzem pessoas frustradas." +
                "Seja um debatedor de ideias. Lute pelo que você ama.",
            ".sasohnel setrap" +            
				"sa odniutitsnoc ,sarienam sasrevid ed sotsopsid ,siategev so sodot me artno cne es" +            
				"euq sotnemalif oãs sarbiF .sadicúlsnart e saçidarbeuq ,sadilós sassam me es-odnadixo" +            
				",mazitercnoc es sioped e sadiulf merroc oriemirP .sarefínoc sa ,etnemralucitrap ,e" +            
				"arieora a ,oriehnip o omoc siat ,serovrá satrec ed erroc euq ,adalerama roc ed ,asoutnu" +            
				"e etnetsisnoc ,levámalfni airétaM .aniseR .lategev o atnemila euq é atsE .adarobale" +            
				"uo etnednecsed a e ,aturb uo etnednecsa a :avies ed seicépse saud áH .satnalp" +            
				"sad sodicet son alucric avies A .mecnetrep euq a lategev od oãçirtun a arap evres" +            
				"euq e arret ad oies od mevrosba sezíar sa euq odiuqíL .avieS .sahlof sad oãçaroloc" +            
				"a animreted euq airétam a amahc es omoc É .aliforolC .saruvren sa ertne setnetsixe" +            
				"soçapse so apuco euq odicet o É .amiuqnêraP .olat od oãçacifimar amu E .satnalp" +            
				"samugla ed sahlof sad eicífrepus a merrocrep euq setneilas sarbif oãs saruvreN" +            
				".oloícep o moc es-ridnufnoc éta ,sezev sà ,es-odnagnolorp,ahlof ad oiem olep ednetse es euq assorg arbif a missa es-amahC .olaT .omar uo ohlag oa obmil o ednerp euq ahlof ad etrap a adamahc missa É .oloíceP"
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
