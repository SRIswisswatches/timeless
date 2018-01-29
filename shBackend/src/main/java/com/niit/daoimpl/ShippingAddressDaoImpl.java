package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ShippingAddressDao;
import com.niit.model.ShippingAddress;

@Repository("ShippingAddressDao")

public class ShippingAddressDaoImpl implements ShippingAddressDao {

	public ShippingAddressDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<ShippingAddress> list() {
		@SuppressWarnings({ "unchecked" })
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) sessionFactory.getCurrentSession().createCriteria(ShippingAddress.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listShippingAddress;
	}

	@Transactional
	public ShippingAddress getByShippingAddress(String shippingaddress) {
		String hql = "from ShippingAddress where ShippingAddress ='" + shippingaddress + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();

		if (listShippingAddress != null && !listShippingAddress.isEmpty()) {
			return listShippingAddress.get(0);
		}
		return null;
	}

	@Transactional
	public ShippingAddress getByShippingId(int shippingid) {
		String hql = "from ShippingAddress where ShippingId='" + shippingid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();

		if (listShippingAddress != null && !listShippingAddress.isEmpty()) {
			return listShippingAddress.get(0);
		}
		return null;
	}

	@Transactional
	public ShippingAddress getByUserName(String username) {
		String hql = "from ShippingAddress where UserName='" + username + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();

		if (listShippingAddress != null && !listShippingAddress.isEmpty()) {
			return listShippingAddress.get(0);
		}
		return null;
	}

	@Transactional
	public ShippingAddress getByUserId(int userid) {
		String hql = "from ShippingAddress where UserId='" + userid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> listShippingAddress = (List<ShippingAddress>) (query).list();

		if (listShippingAddress != null && !listShippingAddress.isEmpty()) {
			return listShippingAddress.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(ShippingAddress shippingaddress) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(shippingaddress);

	}

	@Transactional
	public void delete(int shippingId) {
		ShippingAddress shippingaddressToDelete = new ShippingAddress();
		shippingaddressToDelete.setShippingId(shippingId);
		sessionFactory.getCurrentSession().delete(shippingaddressToDelete);
		
	}

	@Transactional
	public void editShippingAddress(ShippingAddress shippingaddress) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public List<ShippingAddress> list(String EmailId) {
		String hql = "from ShippingAddress where EmailId ='" + EmailId +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<ShippingAddress> list = (List<ShippingAddress>) query.list();
		
		return list;
	}
}
