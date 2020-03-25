/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familydata2;


/**
 *
 * @author brigh
 */
public class fam_data  {
    private int num;
    private String id;
    private String name;
    private String relationship;
    private String to_name;

    public fam_data(int num, String id, String name, String relationship, String to_name) {
        this.num = num;
        this.id = id;
        this.name = name;
        this.relationship = relationship;
        this.to_name = to_name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getTo_name() {
        return to_name;
    }

    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }
    
    
    
}
