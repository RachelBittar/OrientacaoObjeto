
public class CalculadoraBonus {
	
	public int bonusDoDia=1;
	public int bonusDoUsuario;
	public boolean vip;

	public int bonus(Usuarios usuario) {
	int multiplicador = bonusDoDia;	
	if (usuario.vip) 
		multiplicador *= 5;
	return multiplicador;
	}
	
}
