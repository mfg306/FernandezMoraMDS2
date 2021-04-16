/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateHitoDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(Base_de_Datos.HitoPersistentManager.instance());
			Base_de_Datos.HitoPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
