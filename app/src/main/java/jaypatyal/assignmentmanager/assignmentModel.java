package jaypatyal.assignmentmanager;

import java.util.Date;

/**
 * Created by Hp-pc on 06-02-2018.
 */

public class assignmentModel {
    String name, description;
    long notifyTimemillis;
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public long getNotifyTime(){
        return notifyTimemillis;
    }
    public void setName(String Name){
        name = Name;
    }
    public void setDescription(String Description){
        description = Description;
    }
    public void setNotifyTime(Long time){
        notifyTimemillis = time;
    }
    public void assignmentModel(){
        name = "";
        description ="";
    }
     public void assignmentModel(String Name,String description1,long time ){
         name = Name;
         description = description1;
         notifyTimemillis = time;
    }
}
