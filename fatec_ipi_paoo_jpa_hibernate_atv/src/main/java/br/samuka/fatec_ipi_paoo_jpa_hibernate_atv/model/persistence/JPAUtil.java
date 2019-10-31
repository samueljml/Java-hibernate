package br.samuka.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	
	//bloco inicializador estático
	static {
		factory = Persistence.createEntityManagerFactory("bossiniPU");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}
}
