
public class RegistroPontos {
		
	private CalculadoraBonus bonus;
	
	//construtor 
	public RegistroPontos(CalculadoraBonus cb) {	
		bonus= cb;	
	}

	void fazerUmComentario(Usuarios usuario) {
		usuario.pontos+=3*bonus.bonus(usuario);
	}
	
	void criarUmtopico(Usuarios usuario) {
		usuario.pontos+=5*bonus.bonus(usuario);
		
	}
	void darUmLike(Usuarios usuario) {
		usuario.pontos+=1*bonus.bonus(usuario);	
	}

}
