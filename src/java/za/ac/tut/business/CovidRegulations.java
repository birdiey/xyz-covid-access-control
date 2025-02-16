package za.ac.tut.business;

public class CovidRegulations {

    public CovidRegulations() {
    }
    
    
    public String determiningAccessToPremise(String wearingMask, String sanitizing,int temp){
        
        String output="You do NOT have access to the premises because you do not comply with the following COVID-19 regulations\n ";
               output += "1.You are not wearing a mask\n ";
               output += "2.You are not sanitized\n";
               output +=" 3.Your temperature is high";
                   
                
                
        
        if(wearingMask.equalsIgnoreCase("Yes") && sanitizing.equalsIgnoreCase("Yes")&& temp <38){
            output="You have access to the premises";
        }
        return output;
        
    
    }
        
    }

