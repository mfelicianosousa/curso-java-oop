package br.com.mfsdevsystem.unidade4;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.mfsdevsystem.syscapacity.ServidorPublico;

public interface IServidorPublico {

	public void adicionarServidoresPublico();
	
	public void listarServidorPublico();
	
    public void listarServidorPublico(int matricula) ;
    
    public void excluirServidorPublico(int matricula) ;
    
	public void alterarServidorPublico(ServidorPublico servidorAlterado);
    
}
