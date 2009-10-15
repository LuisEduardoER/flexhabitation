package br.com.jfrootmaster.rpc;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import br.com.jfrootmaster.modelo.Cadastro.*;

import br.com.jfrootmaster.utilitarios.Cryptography;

public class Cadastro {

//Inicio CadUsuario//
	public List<CadUsuario> CadUsuarioListar() {
		return new CadUsuario().listar();
	}

//	public List<CadUsuario> CadUsuarioIncluir(CadUsuario id) {
//		try {
//			id.setPassword(Cryptography.encrypt(id.getPassword()));
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		new CadUsuario().incluir(id);
//		return CadUsuarioListar();
//	}
	private CadUsuario cu = new CadUsuario();
	public CadUsuario CadUsuarioIncluir(CadUsuario id) {
	try {
		id.setSenha(Cryptography.encrypt(id.getSenha()));
	} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
	
	CadUsuario = cu.incluir(id);
	return CadUsuario();
}
	
	private CadUsuario CadUsuario() {
		// TODO Auto-generated method stub
		return CadUsuario;
	}

	public CadUsuario Login(CadUsuario u) {
		
		try {
			u.setSenha(Cryptography.encrypt(u.getSenha()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return new CadUsuario().login(u);
		
	}
	
	public List<CadUsuario> CadUsuarioAlterar(CadUsuario obj) {
		if(obj.getSenha() != ""){
			try {
				obj.setSenha(Cryptography.encrypt(obj.getSenha()));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		new CadUsuario().alterar(obj);
		return CadUsuarioListar();
	}
	
	public List<CadUsuario> CadUsuarioExcluir(Integer key)  {
		try {
			new CadUsuario().excluir(key);
			return CadUsuarioListar();
		} catch (Exception e) {
			return null;
		}
	}
//Fim CadUsuario//
	
//Inicio CadPosition//	
	public List<CadCargo> CadCargoListar() {
		return new CadCargo().listar();
	}
	
	private CadCargo cp = new CadCargo();
	public CadCargo CadCargoIncluir(CadCargo obj) {
		
		CadCargo CadCargo = cp.incluir(obj); 
		
		return CadCargo;
	}
	
	public List<CadCargo> CadCargoAlterar(CadCargo id) {
		new CadCargo().alterar(id);

		return CadCargoListar();
	}
	
	public List<CadCargo> CadCargoExcluir(CadCargo obj) {
		try{
			new CadCargo().excluir(obj);
			return CadCargoListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadCargo//

	//Inicio CadKeyMessenger//	
	public List<CadMensagemChave> CadMensagemChaveListar() {
		return new CadMensagemChave().listar();
	}
	
	private CadMensagemChave ckm = new CadMensagemChave();
	public CadMensagemChave CadMensagemChaveIncluir(CadMensagemChave obj) {
		
		CadMensagemChave CadMensagemChave = ckm.incluir(obj); 
		
		return CadMensagemChave;
	}
	
	public List<CadMensagemChave> CadMensagemChaveAlterar(CadMensagemChave id) {
		new CadMensagemChave().alterar(id);

		return CadMensagemChaveListar();
	}
	
	public List<CadMensagemChave> CadMensagemChaveExcluir(CadMensagemChave obj) {
		try{
			new CadMensagemChave().excluir(obj);
			return CadMensagemChaveListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadMensagemChave//
	
	//Inicio CadSector//	
	public List<CadSetor> CadSetorListar() {
		return new CadSetor().listar();
	}
	
	private CadSetor cs = new CadSetor();
	public CadSetor CadSetorIncluir(CadSetor obj) {
		
		CadSetor CadSetor = cs.incluir(obj); 
		
		return CadSetor;
	}
	
	public List<CadSetor> CadSetorAlterar(CadSetor id) {
		new CadSetor().alterar(id);

		return CadSetorListar();
	}
	
	public List<CadSetor> CadSetorExcluir(CadSetor obj) {
		try{
			new CadSetor().excluir(obj);
			return CadSetorListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadSetor//
	
	//Inicio CadStatusUser//	
	public List<CadStatusUsuario> CadStatusUsuarioListar() {
		return new CadStatusUsuario().listar();
	}
	
	private CadStatusUsuario csu = new CadStatusUsuario();
	public CadStatusUsuario CadStatusUsuarioIncluir(CadStatusUsuario obj) {
		
		CadStatusUsuario CadStatusUsuario = csu.incluir(obj); 
		
		return CadStatusUsuario;
	}
	
	public List<CadStatusUsuario> CadStatusUsuarioAlterar(CadStatusUsuario id) {
		new CadStatusUsuario().alterar(id);

		return CadStatusUsuarioListar();
	}
	
	public List<CadStatusUsuario> CadStatusUsuarioExcluir(CadStatusUsuario obj) {
		try{
			new CadStatusUsuario().excluir(obj);
			return CadStatusUsuarioListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadStatusUsuario//
	
	//Inicio CadStatusTrack//	
	public List<CadStatusTrack> CadStatusTrackListar() {
		return new CadStatusTrack().listar();
	}
	
	private CadStatusTrack cst = new CadStatusTrack();
	public CadStatusTrack CadStatusTrackIncluir(CadStatusTrack obj) {
		
		CadStatusTrack CadStatusTrack = cst.incluir(obj); 
		
		return CadStatusTrack;
	}
	
	public List<CadStatusTrack> CadStatusTrackAlterar(CadStatusTrack id) {
		new CadStatusTrack().alterar(id);

		return CadStatusTrackListar();
	}
	
	public List<CadStatusTrack> CadStatusTrackExcluir(CadStatusTrack obj) {
		try{
			new CadStatusTrack().excluir(obj);
			return CadStatusTrackListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadStatusTrack//
	
	//Inicio CadTask//	
	public List<CadTarefa> CadTarefaListar() {
		return new CadTarefa().listar();
	}
	
	private CadTarefa ct = new CadTarefa();
	private CadUsuario CadUsuario;
	public CadTarefa CadTarefaIncluir(CadTarefa obj) {
		
		CadTarefa CadTarefa = ct.incluir(obj); 
		
		return CadTarefa;
	}
	
	public List<CadTarefa> CadTarefaAlterar(CadTarefa id) {
		new CadTarefa().alterar(id);

		return CadTarefaListar();
	}
	
	public List<CadTarefa> CadTarefaExcluir(CadTarefa obj) {
		try{
			new CadTarefa().excluir(obj);
			return CadTarefaListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadTarefa//
	
	//Inicio CadCep//	
	public List<CadCep> CadCepListar() {
		return new CadCep().listar();
	}
	
	public List<CadCep> CadCepLocalizar(String cep) {
		return new CadCep().listar2(cep);
	}
	
	private CadCep cpep = new CadCep();
	public CadCep CadCepIncluir(CadCep obj) {
		
		CadCep CadCep = cpep.incluir(obj); 
		
		return CadCep;
	}
	
	public List<CadCep> CadCepAlterar(CadCep id) {
		new CadCep().alterar(id);

		return CadCepListar();
	}
	
	public List<CadCep> CadCepExcluir(CadCep obj) {
		try{
			new CadCep().excluir(obj);
			return CadCepListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadCep//
	
	//Inicio CadPriority//	
	public List<CadPrioridade> CadPrioridadeListar() {
		return new CadPrioridade().listar();
	}
	
	private CadPrioridade cpr = new CadPrioridade();
	public CadPrioridade CadPrioridadeIncluir(CadPrioridade obj) {
		
		CadPrioridade CadPrioridade = cpr.incluir(obj); 
		
		return CadPrioridade;
	}
	
	public List<CadPrioridade> CadPrioridadeAlterar(CadPrioridade id) {
		new CadPrioridade().alterar(id);

		return CadPrioridadeListar();
	}
	
	public List<CadPrioridade> CadPrioridadeExcluir(CadPrioridade obj) {
		try{
			new CadPrioridade().excluir(obj);
			return CadPrioridadeListar();
		} catch (Exception e) {
			return null;
		}

	}
	//Fim CadPrioridade//
}
