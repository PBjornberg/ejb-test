package my.group.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import my.group.entity.Purchaseorder;

/**
 * Interface for PurchaseorderDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IPurchaseorderDAO {
	/**
	 * Perform an initial save of a previously unsaved Purchaseorder entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPurchaseorderDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Purchaseorder entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Purchaseorder entity);

	/**
	 * Delete a persistent Purchaseorder entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPurchaseorderDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Purchaseorder entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Purchaseorder entity);

	/**
	 * Persist a previously saved Purchaseorder entity and return it or a copy
	 * of it to the sender. A copy of the Purchaseorder entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IPurchaseorderDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Purchaseorder entity to update
	 * @return Purchaseorder the persisted Purchaseorder entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Purchaseorder update(Purchaseorder entity);

	public Purchaseorder findById(Integer id);

	/**
	 * Find all Purchaseorder entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Purchaseorder property to query
	 * @param value
	 *            the property value to match
	 * @return List<Purchaseorder> found by query
	 */
	public List<Purchaseorder> findByProperty(String propertyName, Object value);

	public List<Purchaseorder> findByStatus(Object status);

	public List<Purchaseorder> findByComments(Object comments);

	public List<Purchaseorder> findByCustomernumber(Object customernumber);

	/**
	 * Find all Purchaseorder entities.
	 * 
	 * @return List<Purchaseorder> all Purchaseorder entities
	 */
	public List<Purchaseorder> findAll();
}