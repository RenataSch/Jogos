public class Jogo {
    private jokenpo usuario;
    private jokenpo computador;
    
    public Jogo(byte jogadaUsuario){
        this.usuario = new jokenpo(jogadaUsuario);
    
    byte sorteio = (byte)(Math.random()*3+1);
    this.computador = new jokenpo(sorteio);

}
public String verificarVencedor() {
    byte usu = this.usuario.getJogada();
    byte comp = this.computador.getJogada();
    if(usu ==comp) {
        return "Empate";
    } else if (usu == 1 && comp == 3 || usu == 2 && comp == 1 || comp == 1 && usu == 3 && comp ==2) {
        return "Usuario vence!!";
    } else {
        return "Computador vence!!";
    }
}
public String toString(){
    return "Usuário jogou " + this.usuario + "\nComputador jogou " + this.computador;
}
}
