package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exeption.IncorrectSearchCriteriaExeption;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance>  find(Criteria criteria) throws IncorrectSearchCriteriaExeption {
		if (!Validator.criteriaValidator(criteria)) {
			throw new IncorrectSearchCriteriaExeption("Incorrect criteria! "+criteria.toString()+"\n Unable to search for this criteria");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
