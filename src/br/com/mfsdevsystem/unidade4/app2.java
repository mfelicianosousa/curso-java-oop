package br.com.mfsdevsystem.unidade4;

public class app2 implements IServidorPublico {
	
	public static void verificarTipoServidorPublico(ServidorPublico servidor) {
		if (servidor instanceof Estatutario)
			System.out.println("Estatutario");
		else if (servidor instanceof Comissionado)
		     System.out.println("Comissionado");
		else if (servidor instanceof Temporario)
		     System.out.println("Temporario");
		else
			 System.out.println("Não foi especializado. Permanece Servidor Público");

	}

	public static void main(String[] args) {
		ServidorPublico isabela = new Comissionado(5000, 3000, 1, "Isabela Sampaio");
		System.out.println(isabela);
		
		verificarTipoServidorPublico( isabela );	
		System.out.println("=================================================================================");

		isabela = new Estatutario(0,15000,1,"Isabela Sampaio");
	
		System.out.println(isabela);
		// Cast de objeto
		System.out.println(((Estatutario) isabela).getTempoServico());
		System.out.println(((Estatutario) isabela).getSalarioBase());
		verificarTipoServidorPublico( isabela );
		isabela.exibirInformacoes();
		
		//
		System.out.println("================================================================================");
		ServidorPublico pedro = new Temporario(1,"Pedro Oliveira", "10101", 3000 );
		System.out.println(pedro);
		System.out.println(pedro.calcularSalarioHorasExtras(40));
		System.out.println("===============================================================================");
	}

	@Override
	public void adicionarServidoresPublico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarServidorPublico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarServidorPublico(int matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirServidorPublico(int matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarServidorPublico(br.com.mfsdevsystem.syscapacity.ServidorPublico servidorAlterado) {
		// TODO Auto-generated method stub
		
	}

}
