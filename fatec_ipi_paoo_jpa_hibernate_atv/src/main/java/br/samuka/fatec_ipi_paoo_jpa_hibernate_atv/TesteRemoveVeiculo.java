package br.samuka.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.samuka.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.samuka.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;



public class TesteRemoveVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		manager.remove(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}
}
