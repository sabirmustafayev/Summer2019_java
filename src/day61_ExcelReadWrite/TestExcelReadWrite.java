package day61_ExcelReadWrite;

public class TestExcelReadWrite {

	 public static void main(String[] args) {
	        String path = "C:\\Users\\choci\\Desktop\\Untitled spreadsheet.xlsx";
	        String sheetName = "Sheet1";
	        
	        ExcelReadWrite obj = new ExcelReadWrite(path, sheetName);
	        
	        String data1 = obj.readData(1, 0);
	        System.out.println(data1);
	        
	        obj.WriteData(1, 0, "Mehmet");
	        
	        String data2 =  obj.readData(1, 0);
	        System.out.println( data2 );  //
	        
	            
	    }
	}