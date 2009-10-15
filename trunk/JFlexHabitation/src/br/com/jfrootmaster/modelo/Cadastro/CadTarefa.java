package br.com.jfrootmaster.modelo.Cadastro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.jfrootmaster.dao.Cadastro.CadTarefaDAO;

@Entity
@Table(name="cad_tarefa")
public class CadTarefa {

	public CadTarefa() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id_tarefa", nullable= false)
	private Integer id_tarefa;
	private String tarefa;
	
	/* Methods */
	
	public CadTarefa incluir(CadTarefa obj) {
		obj.setId_tarefa(null);
		CadTarefaDAO.getInstance().saveInsert(obj);
		return obj;
	}
	
	public void alterar(CadTarefa CadTarefa) {
		CadTarefaDAO.getInstance().saveUpdate(CadTarefa);
	}
	
	public void excluir(CadTarefa CadTarefa) {
		CadTarefaDAO.getInstance().delete(CadTarefa);
	}
	
	public List<CadTarefa> listar() {
		return CadTarefaDAO.getInstance().listAll();
	}
	
	/* Getters and Setters */

	public Integer getId_tarefa() {
		return id_tarefa;
	}

	public void setId_tarefa(Integer id_tarefa) {
		this.id_tarefa = id_tarefa;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
}
