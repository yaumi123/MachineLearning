package knn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.UndoableEditListener;

public class ReadFile {
	public static List<String> readCsvToString(String path) {
		try { 
            BufferedReader reader = new BufferedReader(new FileReader(path));
            
            String line = null; 
            List<String> uList = new ArrayList<>();
            int r=0,c=0;
            
            while((line=reader.readLine())!=null){ 
                String item[] = line.split(",");
                for(int i=0;i<item.length;i++) {
                	uList.add(item[i]);
                }
                c=item.length;
                r++;
                
            }
            uList.add(Integer.toString(r));
            uList.add(Integer.toString(c));
            return uList;
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
		return null;
		
	}
	
	public static List<double[]> readCsvToArray(String path,int items){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			 String line = null; 
	            List<double[]> dataList = new ArrayList<>();
	            
	            int a=0;
	            while((line=reader.readLine())!=null){
	            	if(a==0) {
	            		a++;
	            		continue;
	            	}
	            	double[] data = new double[items];
	                String item[] = line.split(",");
	                for(int i=0;i<item.length;i++) {
	                	data[i]=Double.parseDouble(item[i]);
	                	//System.out.print(data[i]+",");
	                }
	                //System.out.println();
	                
	                dataList.add(data);
	                a++;
	            }
	        return dataList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
