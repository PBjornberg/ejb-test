package my.group.dao;

import java.util.List;
import java.util.Set;

import my.group.entity.Office;

/**
 * Interface for OfficeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IOfficeDAO {
	/**
	 * Perform an initial save of a previously unsaved Office entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IOfficeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Office entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Office entity);

	/**
	 * Delete a persistent Office entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IOfficeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Office entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Office entity);

	/**
	 * Persist a previously saved Office entity and return it or a copy of it to
	 * the sender. A copy of the Office entity parameter is returned when the
	 * JPA persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IOfficeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Office entity to update
	 * @return Office the persisted Office entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Office update(Office entity);

	public Office findById(String id);

	/**
	 * Find all Office entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Office property to query
	 * @param value
	 *            the property value to match
	 * @return List<Office> found by query
	 */
	public List<Office> findByProperty(String propertyName, Object value);

	public List<Office> findByCity(Object city);

	public List<Office> findByPhone(Object phone);

	public List<Office> findByAddressline1(Object addressline1);

	public List<Office> findByAddressline2(Object addressline2);

	public List<Office> findByState(Object state);

	public List<Office> findByCountry(Object country);

	public List<Office> findByPostalcode(Object postalcode);

	public List<Office> findByTerritory(Object territory);

	/**
	 * Find all Office entities.
	 * 
	 * @return List<Office> all Office entities
	 */
	public List<Office> findAll();
}