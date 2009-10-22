package br.com.jfrootmaster.dao.Cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.jfrootmaster.dao.BaseDao;
import br.com.jfrootmaster.modelo.Cadastro.CadImoveis;

public class CadImoveisDAO extends BaseDao<Object> {

	public static CadImoveisDAO instance;

	public static CadImoveisDAO getInstance() {
		try {
			if (null == instance) instance = new CadImoveisDAO();
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return instance;
		
	}
	
	@SuppressWarnings("unchecked")
	public void saveInsert(CadImoveis obj) {
		
		super.create(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void saveUpdate(CadImoveis obj) {
		
		super.update(obj);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void delete(CadImoveis obj) {
		
		super.delete(obj);
		
	}

	@SuppressWarnings("unchecked")
	public void delete(String key) {

		super.delete( load(key) );
		
	}
	
	@SuppressWarnings("unchecked")
	public CadImoveis load(String key) {
		
		CadImoveis obj;
		obj =  getEntityManager().find(CadImoveis.class, key);
		return obj;
		
	}

	
	@SuppressWarnings("unchecked")
	public List<CadImoveis> listAll() {
		
		List<CadImoveis> lista = new ArrayList<CadImoveis>();

		String hql = null;
		
		hql = "from CadImoveis";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		lista.addAll(query.getResultList());
			
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<CadImoveis> buscarImoveis(Integer id_imovel, String tipo_imovel, String finalidade, String cidade, String bairro, String estado,
			String objetivo,Integer num_dormitorios_min,Integer num_dormitorios_max, Integer num_suites_min,Integer num_suites_max, Integer num_vagas_garagem_min, Integer num_vagas_garagem_max) {
		
		List<CadImoveis> lista = new ArrayList<CadImoveis>();

		String hql = null;
		String where = null;
		String whereBuscaAvancada = null;
		Integer buscaAvancada = null;
		String condicaoAdicional = null;
		
		hql = "from CadImoveis";
		whereBuscaAvancada = " where id_imovel <> 0";
		
		if(id_imovel != null && !id_imovel.equals(0)){
			where = " where id_imovel = :idImovel";
			hql = hql + where;
			buscaAvancada = 0;
		}
			if(id_imovel.equals(0)){
				buscaAvancada = 1;
				hql = hql + whereBuscaAvancada;
				if(tipo_imovel != null && !tipo_imovel.equals(""))
				{
					String andTipoImovel = " and tipo_imovel = '" + tipo_imovel + "'";
					hql = hql + andTipoImovel;
				}
				 if(finalidade != null && !finalidade.equals("")){
					String andFinalidade = " and finalidade = '" + finalidade + "'";
					hql = hql + andFinalidade; 
				}
				 if(cidade != null && !cidade.equals("")){
					String andCidade = " and cidade = '" + cidade + "'";
					hql = hql + andCidade;
				}
				 if(bairro != null && !bairro.equals("")){
					String andBairro = " and bairro = '" + bairro + "'";
					hql = hql + andBairro;
				}
				 if(estado != null && !estado.equals("")){
					String andEstado = " and estado = '" + estado + "'";
					hql = hql + andEstado;
				}
				 if(objetivo != null && !objetivo.equals("")){
					String andObjetivo = " and objetivo = '" + objetivo + "'";
					hql = hql + andObjetivo;
						if(objetivo.equals("LOCAÇÃO")){
							condicaoAdicional = " order by valor_locacao asc";
							hql = hql + condicaoAdicional;
						}else{
							condicaoAdicional = " order by valor_venda asc";
							hql = hql + condicaoAdicional;
					}
				}
				 if(num_dormitorios_min != null && !num_dormitorios_min.equals(0) && num_dormitorios_max != null && !num_dormitorios_max.equals(0)){
					 String andNumDormitorios = " and num_dormitorios >= '" + num_dormitorios_min + "' and num_dormitorios <= '" + num_dormitorios_max + "'";	
					 hql = hql + andNumDormitorios;
				 }
				 if(num_suites_min != null && !num_suites_min.equals(0) && num_suites_max != null && !num_suites_max.equals(0)){
					 String andNumSuites = " and num_suites >= '" + num_suites_min + "' and num_suites <= '" + num_suites_max + "'";	
					 hql = hql + andNumSuites;
				 }
				 if(num_vagas_garagem_min != null && !num_vagas_garagem_min.equals(0) && num_vagas_garagem_max != null && !num_vagas_garagem_max.equals(0)){
					 String andNumVagasGaragem = " and num_vagas_garagem >= '" + num_vagas_garagem_min + "' and num_vagas_garagem <= '" + num_vagas_garagem_max + "'";	
					 hql = hql + andNumVagasGaragem;
				 }
			}

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		if(buscaAvancada.equals(1)){
			//buscaAvançada//
		}else{
			query.setParameter("idImovel",id_imovel);
		}
		lista.addAll(query.getResultList());
			
		return lista;
	}
}

