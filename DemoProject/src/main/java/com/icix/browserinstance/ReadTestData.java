package com.icix.browserinstance;

public class ReadTestData {
	public static String vUsername;
	public static String vPassword;

	public static void ReadData() {
		String sheetPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test_Data\\Product.xlsx";
		Xls_Reader xlr = new Xls_Reader(sheetPath);
		int i = 0;
		int rCount = xlr.getRowCount("Login SPU");
		for (i = 2; i <= rCount; i++) {
			// get the value of "RUN"
			vUsername = xlr.getCellData("Login SPU", "UserName", i);
			vPassword = xlr.getCellData("Login SPU", "Password", i);
		}
	}
}
