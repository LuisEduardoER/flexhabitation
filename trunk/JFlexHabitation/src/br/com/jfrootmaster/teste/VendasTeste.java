package br.com.jfrootmaster.teste;

import java.sql.Date;
import java.sql.Timestamp;

import br.com.jfrootmaster.modelo.Cadastro.CadImoveis;
import br.com.jfrootmaster.rpc.*;


public class VendasTeste {

	public static void main(String[] args) {

//////////////CRIANDO UM OBJETO DE CADCLIENTE E PREENCHENDO DADOS/////////////
		
//			   System.out.println("Preenchendo Dados.....");
//			   CadImoveis ci = new CadImoveis();
//			   ci.setArea_construida("500");
//			   ci.setArea_servico(1);
//			   ci.setArea_util("500");
//			   ci.setBairro("JD SAO CAETANO");
//			   ci.setChurrasqueira(1);
//			   ci.setCidade("SAO CAETANO DO SUL");
//			   ci.setComplemento(null);
//			   ci.setCond_pgto(null);
//			   ci.setCopa(0);
//			   ci.setCozinha(1);
//			   ci.setData_cadastro(new java.util.Date());
//			   ci.setDep_empregada(1);
//			   ci.setEmail_contato("EMAIL@EMAIL.COM.BR");
//			   ci.setEndereco("AV GUIDO ALIBERTTI");
//			   ci.setEstado("SAO PAULO");
//			   ci.setFinalidade("COMERCIAL");
//			   ci.setFinanciado(0);
//			   ci.setGaragem(1);
//			   ci.setNum_dormitorios(0);
//			   ci.setNum_suites(0);
//			   ci.setNum_vagas_garagem(30);
//			   ci.setNumero("3099");
//			   ci.setObjetivo("LOCAÇÃO");
//			   ci.setObservacao(null);
//			   ci.setPermite_placa(1);
//			   ci.setPscina(0);
//			   ci.setSala_estar(0);
//			   ci.setSala_jantar(0);
//			   ci.setSala_tv(0);
//			   ci.setTipo_imovel("GALPÃO");
//			   ci.setTopografia("PLANO");
//			   ci.setValor_condominio(0.00);
//			   ci.setValor_iptu(350.00);
//			   ci.setValor_locacao(3600.55);
//			   ci.setValor_venda(0.00);
//			   
//			   ci.incluir(ci);
//			   System.out.println("Dados Incluidos no Banco");
  
		///////////////////////////////TESTE BUSCAR IMOVEIS/////////////////////////
		   
			   System.out.println("Listando apos incluir....");
			   CadImoveis ci = new CadImoveis();
			   ci.buscarImovel(0, "", "", "SAO CAETANO DO SUL", "", "", "",0,0,0,0,0,0);
			   
			}
		  }
			   
		///////////////////////////////ALTERANDO/////////////////////////////////////
////			   
////			   System.out.println("Alterando....");
////			   cc.setNome("Nome Mudado");
////			   id.CadClienteAlterar(cc);
////			   System.out.println("Nome Alterado");
////			   
		///////////////////////////////LISTANDO APOS ALTERAR/////////////////////////
////			   
////			   System.out.println("Listando apos alterar....");
////			   id.CadClienteListar();
////			   
		///////////////////////////////DELETANDO/////////////////////////////////////
////			   
////			   System.out.println("Deletando...");
////			// cc.setId(5); //Informa o ID do Cliente a Excluir (somente testes)
////			   id.CadClienteExcluir(cc.getId());
////			   System.out.println("Cliente Deletado");
////			   
		///////////////////////////////LISTANDO APOS EXCLUIR////////////////////////
////			   
////			   System.out.println("Listando apos excluir...");
////			   id.CadClienteListar();
////			   
////			}
		////	
		//	
//	}

//}