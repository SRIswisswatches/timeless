package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.RoleDao;
import com.niit.model.Role;

@Repository("RoleDao")
@Transactional
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public RoleDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Role> list() {
		@SuppressWarnings({ "unchecked" })
		List<Role> listRole = (List<Role>) sessionFactory.getCurrentSession().createCriteria(Role.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listRole;
	}

	public Role getByFullname(String fullname) {
		String hql = "from Role where fullname ='" + fullname + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) (query).list();

		if (listRole != null && !listRole.isEmpty()) {
			return listRole.get(0);
		}
		return null;
	}

	public Role getByEmail(String email) {
		String hql = "from Role where email ='" + email + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) (query).list();

		if (listRole != null && !listRole.isEmpty()) {
			return listRole.get(0);
		}
		return null;
	}

	

	public void saveOrUpdate(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);
		
	}

	public void delete(String fullname) {
		Role roleToDelete = new Role();
		roleToDelete.setUsername(fullname);
		sessionFactory.getCurrentSession().delete(roleToDelete);
		
	}

	public Role getByUName(String fullname) {
		// TODO Auto-generated method stub
		return null;
	}

}