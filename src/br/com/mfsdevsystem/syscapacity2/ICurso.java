package br.com.mfsdevsystem.syscapacity2;

import br.com.mfsdevsystem.syscapacity.Curso;

public interface ICurso {
	
public void adicionarCurso();
	
	public void listarCurso();
	
    public void listarCurso(int matricula);
    
    public void excluirCurso(int matricula);
    
	public void alterarCurso(Curso servidorAlterado);

	public void adicionarServidorCurso(int idcurso, int matricula);
	
	public void excluirServidorCurso(int idcurso, int matricula);
    
	public void listarServidoresCurso(int idcurso);


}
