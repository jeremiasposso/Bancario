package br.com.bancario.negocio;

import br.com.bancario.entidade.ContaCorrente;

/**
 *
 * @author jeremias.posso
 */
public class ContaNegocio {
    
    public void salvarCorrentista(ContaCorrente conta){
        String senha = gerarSenha();
        conta.setSenha(senha);
        conta.setNumero(gerarNumeroConta());
    }
    
    private String gerarNumeroConta(){
        String numeroAleatorio = "";
        for (int i = 0; i < 5; i++) {
             int numero = (int) (Math.random() * 10);
             numeroAleatorio += numero;
        }
        
        return numeroAleatorio;
        
    }
    
    private String gerarSenha(){
        String[] letras = {"a","b","c",
            "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K",
            "L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1",
            "2","3","4","5","6","7","8","9",};
        int tamanho = letras.length;
        String senha = "";
        int indice;
        for (int i = 0; i < 4; i++) {
            indice = (int) (Math.random() * tamanho);
            senha += letras[indice];
        }
        
        return senha;
    }
    
    public static void main(String[] args) {
        ContaNegocio cn = new ContaNegocio();
        String senha = cn.gerarSenha();
        
    }
}
