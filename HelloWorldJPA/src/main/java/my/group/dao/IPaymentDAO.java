package my.group.dao;

import java.util.Date;
import java.util.List;

import my.group.entity.Payment;
import my.group.entity.PaymentId;

/**
 * Interface for PaymentDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IPaymentDAO {
	/**
	 * Perform an initial save of a previously unsaved Payment entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPaymentDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Payment entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Payment entity);

	/**
	 * Delete a persistent Payment entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IPaymentDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Payment entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Payment entity);

	/**
	 * Persist a previously saved Payment entity and return it or a copy of it
	 * to the sender. A copy of the Payment entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IPaymentDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Payment entity to update
	 * @return Payment the persisted Payment entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Payment update(Payment entity);

	public Payment findById(PaymentId id);

	/**
	 * Find all Payment entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Payment property to query
	 * @param value
	 *            the property value to match
	 * @return List<Payment> found by query
	 */
	public List<Payment> findByProperty(String propertyName, Object value);

	public List<Payment> findByAmount(Object amount);

	/**
	 * Find all Payment entities.
	 * 
	 * @return List<Payment> all Payment entities
	 */
	public List<Payment> findAll();
}