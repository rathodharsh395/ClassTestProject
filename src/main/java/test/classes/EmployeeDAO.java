package test.classes;

public class EmployeeDAO {
	private DBConfig dbConfig;

	@Override
	public String toString() {
		return "EmployeeDAO [dbConfig=" + dbConfig + "]";
	}

	public DBConfig getDbConfig() {
		return dbConfig;
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}
	
	

}
