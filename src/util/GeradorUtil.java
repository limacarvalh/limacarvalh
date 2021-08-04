/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author silvio.junior
 */
public class GeradorUtil {

    /**
     * Retorna um valor String conforme a quantidade de número solcitado
     *
     * @param qtde
     * @return
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int)(Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
    }
    
    public String gerarCpf(){
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" 
                + gerarNumero(2);
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }
    
    public String gerarCnpj (){
        
        return gerarNumero(3)+ "." + gerarNumero(2) + "." + gerarNumero(3) 
                + "." + "/0001-" + gerarNumero(2); 
    } 
    
    public String gerarTelefonefixo(){
        
        return "(48)3" + gerarNumero (4) + "-" + gerarNumero(4);
    }
    
    public String geradorDeNumeroCelular(){
        
        return "(48)9" + gerarNumero (4) + "-" 
                + gerarNumero (4);
    
    }

    public String gerarCEP (){
        
        return gerarNumero(4) + "." + gerarNumero(3);
   
    } 
    
    public String gerarNome(){
        String[] nomes = {"silvio","joão","maria", "pedro","lucas","vandre","josé"
        ,"marisa","tania","sueli","tati","antonio","francisco","giogio","hugo",
        "mariele","william","suelen","otavio","ana","claudia",};
        
        int tamanhoLista = nomes.length;
        int indice = (int)(Math.random()* tamanhoLista);
        String nome = nomes[indice];
       
        
        return nome + " " + geraSobrenome();
    } 

     private  String geraSobrenome(){
        String[] sobrenomes = {"silva","motto","mota", "oliveira","abravaneu","rocha","perreira"
        ,"pires","percicotte","santos","souza","zen","stark","peixes","alves",
        "fischer","smitch","tango","carvalho","peixoto","almeida",};
        
        int tamanhoLista = sobrenomes.length;
        int indice = (int)(Math.random()* tamanhoLista);
        return sobrenomes[indice];
     }
         
    
        public static void main (String[] args) {
        GeradorUtil util = new GeradorUtil();
        
        String nome = util.gerarNome();
        System.out.println("nome;" + nome); 
    }
}
