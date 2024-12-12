package com.nt.service;

public interface PersonManageMentService {
	void saveDataUsingParent();
	void saveDataUsingChild();
	void loadDataUsingParent();
	void loadDataUsingChild();
	void addChildToExistParent(Integer id);
	String deleteByParent(Integer id);
	void deleteAllChildOfparent(Integer id);

}
