/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateHitoDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(base_de_datos.HitoPersistentManager.instance());
			base_de_datos.HitoPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
