package pl.sda.ex8;

import java.util.ArrayList;
import java.util.List;

public class ParcelValidator implements Validator{
    @Override
    public boolean validate(Parcel p) {
        List<String> ruleViolation = new ArrayList<>();
        if(p.getxLength()+p.getyLength()+p.getzLength()>300){
            ruleViolation.add("Sum of lengths is over the limit of 300");
            //System.out.println("Sum of lengths is over the limit of 300");
            //return false;
        }
        if(p.getxLength()<30 || p.getyLength()<30 || p.getzLength()<30){
            ruleViolation.add("One of dimensions is less than 30");
            //System.out.println("One of dimensions is less than 30");
            //return false;
        }
        if(p.isExpress())
        {
            if(p.getWeight()>15.0){
                ruleViolation.add("Weight exceeds 15");
                //System.out.println("Weight exceeds 15");
                //return false;
            }
        } else {
            if(p.getWeight()>30.0){
                ruleViolation.add("Weight exceeds 30");
                //System.out.println("Weight exceeds 30");
                //return false;
            }
        }
        if(!ruleViolation.isEmpty())
        {
            System.out.println(ruleViolation);
            return false;
        }
        return true;

    }
}
