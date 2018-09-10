package knn;

import java.util.ArrayList;
import java.util.List;
import knn.ReadFile;
public class Pima {
	static int columns = 9;//columns of input file.
	static List<double[]> trainingdata = new ArrayList<>();
	static List<double[]> testingdata = new ArrayList<>();
	static double[] impurities = new double[columns];
	static void pimaDemo() {
		trainingdata = ReadFile.readCsvToArray("src/knn/data_Pima.csv",columns);//input training data.
		
		//System.out.println(trainingdata.get(2)[8]);//test if every item in datalist is correct.
		//printList(trainingdata);//test if the datalist is correct.
		
		//Todo:pre-process data:evaluate each feature then order them by impurities.
		
	}
	
	static double[] calculateImpurities(List<double[]> data) {
		double[] avrg = new double[columns];
		double sum=0;
		for(int i=0;i<columns;i++) {
			for(int j=0;j<trainingdata.size();j++) {
				sum += trainingdata.get(j)[i];
			}
			avrg[i] = sum/trainingdata.size();
		}
		return null;
	}
	
	static void printList(List<double[]> t) {
		int i=0,j=0;
		
		while(i<t.size()) {
			double[] d1 = t.get(i);
			for(j=0;j<d1.length;j++) {
				System.out.print(d1[j]+" ");
			}
			System.out.println();
			i++;
		}
	}
}
