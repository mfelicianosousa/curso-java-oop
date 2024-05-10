package br.com.mfsdevsystem.syscapacity2;

import br.com.mfsdevsystem.syscapacity.ServidorPublico;

public interface IServidorPublico {

	public void adicionarServidorPublico();
	
	public void listarServidorPublico();
	
    public void listarServidorPublico(int matricula);
    
    public void excluirServidorPublico(int matricula);
    
	public void alterarServidorPublico(ServidorPublico servidorAlterado);
	
	public void calcularFolhaServidorPublicos();
	
	public void adicionarCursoServidorPublico(int matricula,int idcurso);
	
	public void excluirCursoServidorPublico(int matricula, int idcurso) ;
	
	public void listarCursoServidorPublico(int matricula);
}
