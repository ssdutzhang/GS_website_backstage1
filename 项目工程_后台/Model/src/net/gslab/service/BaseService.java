package net.gslab.service;

import java.util.List;

import net.gslab.setting.Page;


public interface BaseService<T> {

	/**
	 * 查找实体对象
	 * 
	 * @param id
	 *            ID
	 * @return 实体对象，若不存在则返回null
	 */
	T find(int id);

	/**
	 * 查找所有实体对象集合
	 * 
	 * @return 所有实体对象集合
	 */
	List<T> findAll();

	/**
	 * 查找实体对象集合
	 * 
	 * @param ids
	 *            ID
	 * @return 实体对象集合
	 */
	List<T> findList(int... ids);


	Page<T> findPage(Page pageable);




	/**
	 * 判断实体对象是否存在
	 * 
	 * @param id
	 *            ID
	 * @return 实体对象是否存在
	 */
	boolean exists(int id);

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void save(T entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 *            实体对象
	 * @return 实体对象
	 */
	void update(T entity);

	/**
	 * 删除实体对象
	 * 
	 * @param id
	 *            ID
	 */
	void delete(int id);

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void delete(T entity);

}
