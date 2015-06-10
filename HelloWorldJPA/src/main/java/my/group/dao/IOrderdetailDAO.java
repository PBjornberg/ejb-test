package my.group.dao;

import java.util.List;

import my.group.entity.Orderdetail;
import my.group.entity.OrderdetailId;

/**
 * Interface for OrderdetailDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IOrderdetailDAO {
	/**
	 * Perform an initial save of a previously unsaved Orderdetail entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IOrderdetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Orderdetail entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Orderdetail entity);

	/**
	 * Delete a persistent Orderdetail entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IOrderdetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Orderdetail entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Orderdetail entity);

	/**
	 * Persist a previously saved Orderdetail entity and return it or a copy of
	 * it to the sender. A copy of the Orderdetail entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IOrderdetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Orderdetail entity to update
	 * @return Orderdetail the persisted Orderdetail entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Orderdetail update(Orderdetail entity);

	public Orderdetail findById(OrderdetailId id);

	/**
	 * Find all Orderdetail entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Orderdetail property to query
	 * @param value
	 *            the property value to match
	 * @return List<Orderdetail> found by query
	 */
	public List<Orderdetail> findByProperty(String propertyName, Object value);

	public List<Orderdetail> findByQuantityordered(Object quantityordered);

	public List<Orderdetail> findByPriceeach(Object priceeach);

	public List<Orderdetail> findByOrderlinenumber(Object orderlinenumber);

	/**
	 * Find all Orderdetail entities.
	 * 
	 * @return List<Orderdetail> all Orderdetail entities
	 */
	public List<Orderdetail> findAll();
}