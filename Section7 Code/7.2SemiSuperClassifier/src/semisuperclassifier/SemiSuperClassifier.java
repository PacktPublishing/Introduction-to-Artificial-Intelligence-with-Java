/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semisuperclassifier;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.collective.functions.LLGC;
/**
 *
 * @author nisheethjoshi
 */
public class SemiSuperClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            DataSource src = new DataSource("weather.arff");
            Instances dt = src.getDataSet();
            dt.setClassIndex(dt.numAttributes()-1);
            
            LLGC model = new LLGC();
            model.buildClassifier(dt);
            System.out.println(model.getCapabilities());
        }
        catch(Exception e){
            System.out.println("Error!!!!\n" + e.getMessage());
        }
    }
    
}
