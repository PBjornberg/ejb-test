package my.group.dao;

import java.util.List;

import my.group.entity.Productline;

/**
 * Interface for ProductlineDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IProductlineDAO {
	/**
	 * Perform an initial save of a previously unsaved Productline entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IProductlineDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Productline entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Productline entity);

	/**
	 * Delete a persistent Productline entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IProductlineDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Productline entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Productline entity);

	/**
	 * Persist a previously saved Productline entity and return it or a copy of
	 * it to the sender. A copy of the Productline entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IProductlineDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Productline entity to update
	 * @return Productline the persisted Productline entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Productline update(Productline entity);

	public Productline findById(String id);

	/**
	 * Find all Productline entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Productline property to query
	 * @param value
	 *            the property value to match
	 * @return List<Productline> found by query
	 */
	public List<Productline> findByProperty(String propertyName, Object value);

	public List<Productline> findByTextdescription(Object textdescription);

	public List<Productline> findByHtmldescription(Object htmldescription);

	/**
	 * Find all Productline entities.
	 * 
	 * @return List<Productline> all Productline entities
	 */
	public List<Productline> findAll();
}