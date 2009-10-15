////testes de inclusao,alteração,listagem e exclusão.
package br.com.jfrootmaster.teste;

import br.com.jfrootmaster.modelo.Cadastro.*;





public class teste2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		CadStatusTrack user = new CadStatusTrack();

///////////////////////////LISTANDO PRIMEIRA VEZ//////////////////////////
	   System.out.println("Listando Primeira vez...");
	   user.listar();
	   
	}
}
	
   
//////////////CRIANDO UM OBJETO DE CADCLIENTE E PREENCHENDO DADOS/////////////
//
//	   System.out.println("Preenchendo Dados.....");
//	   Ocorrencia cc = new Ocorrencia();
//	   cc.setId_ocorrencia(2);
//	   cc.setDatainit("1");
//	   cc.setDescricao("1");
//	   cc.setHorainit("1");
//	   cc.setIddefeito("1");
//	   cc.setIdtipodef("1");
//	   cc.setIduser("1");
//	   cc.setStatus("1");
//	   id.incluir(cc);
//	   System.out.println("Dados Incluidos no Banco");
//
//   
///////////////////////////////LISTANDO APOS INCLUIR/////////////////////////
	   
//	   System.out.println("Listando apos incluir....");
//	   id.listar();
//	}
//}
//	   
///////////////////////////////ALTERANDO/////////////////////////////////////
////	   
////	   System.out.println("Alterando....");
////	   cc.setNome("Nome Mudado");
////	   id.CadClienteAlterar(cc);
////	   System.out.println("Nome Alterado");
////	   
///////////////////////////////LISTANDO APOS ALTERAR/////////////////////////
////	   
////	   System.out.println("Listando apos alterar....");
////	   id.CadClienteListar();
////	   
///////////////////////////////DELETANDO/////////////////////////////////////
////	   
////	   System.out.println("Deletando...");
////	// cc.setId(5); //Informa o ID do Cliente a Excluir (somente testes)
////	   id.CadClienteExcluir(cc.getId());
////	   System.out.println("Cliente Deletado");
////	   
///////////////////////////////LISTANDO APOS EXCLUIR////////////////////////
////	   
////	   System.out.println("Listando apos excluir...");
////	   id.CadClienteListar();
////	   
////	}
////	
//
