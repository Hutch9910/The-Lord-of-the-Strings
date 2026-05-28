package models;

public abstract class ContatoreId {
	static int contatoreId = 0;
	
	int setId () {
	contatoreId++;
	return contatoreId;
	}
}	
