package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.BillingAddressDao;
import com.niit.model.BillingAddress;

@Repository("BillingAddressDao")
public class BillingAddressDaoImpl implements BillingAddressDao {

	public BillingAddressDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
@Autowired
private  SessionFactory sessionFactory;


@Transactional
	public List<BillingAddress> list() {
	@SuppressWarnings({ "unchecked" })
	List<BillingAddress> listBillingAddress = (List<BillingAddress>) sessionFactory.getCurrentSession().createCriteria(BillingAddress.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	return listBillingAddress;
}

@Transactional
	public BillingAddress getByBillId(int billid) {
	String hql = "from BillingAddress where BillId ='" + billid + "'";
	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<BillingAddress> listBillingAddress = (List<BillingAddress>) (query).list();

	if (listBillingAddress != null && !listBillingAddress.isEmpty()) {
		return listBillingAddress.get(0);
	}
		return null;
	}

@Transactional
	public BillingAddress getByBillingAddress(String billingaddress) {
	String hql = "from BillingAddress where BillingAddress ='" + billingaddress + "'";
	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<BillingAddress> listBillingAddress = (List<BillingAddress>) (query).list();

	if (listBillingAddress != null && !listBillingAddress.isEmpty()) {
		return listBillingAddress.get(0);
	}
		return null;
	}

@Transactional
	public BillingAddress getByContactNumber(int contactnumber) {
	String hql = "from BillingAddress where ContactNumber ='" + contactnumber + "'";
	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<BillingAddress> listBillingAddress = (List<BillingAddress>) (query).list();

	if (listBillingAddress != null && !listBillingAddress.isEmpty()) {
		return listBillingAddress.get(0);
	}
		return null;
	}


@Transactional
	public void delete(String BillingAddress) {
	BillingAddress billingaddressToDelete = new BillingAddress();
	billingaddressToDelete.setAddress(BillingAddress);
	sessionFactory.getCurrentSession().delete(billingaddressToDelete);
		
	}

@Transactional
public void editBillingAddress(BillingAddress billingaddress) {
	// TODO Auto-generated method stub
	
}

@Transactional
public void saveOrUpdate(BillingAddress billingaddress) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().saveOrUpdate(billingaddress);
}
}