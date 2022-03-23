package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private final String groupSearchName;

	private final Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public String getHaskKey()
	{
		StringBuilder stringBuilder = new StringBuilder(String.valueOf(criteria.keySet()));
		stringBuilder.deleteCharAt(0);
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		return stringBuilder.toString();
	}

	public int  getSizeMap(){
		return criteria.size();
	}

	public boolean containMap(String key){
		return criteria.containsKey(key);
	}

	public Object getHashValue(String haskKey)
	{
		return criteria.get(haskKey);
	}

	public String getEntry()
	{
		StringBuilder stringBuilder = new StringBuilder(String.valueOf(criteria.entrySet()));
		stringBuilder.deleteCharAt(0);
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		return stringBuilder.toString();
	}

	@Override
	public String toString() {
		return "Criteria{" +
				"groupSearchName='" + groupSearchName + '\'' +
				", criteria=" + criteria +
				'}';
	}
}
