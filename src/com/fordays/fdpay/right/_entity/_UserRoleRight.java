package com.fordays.fdpay.right._entity;



/**
 * UserRoleRight generated by hbm2java
 */


public class _UserRoleRight 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long userRightId;
     protected Long rightValue;
     protected Long roleId;
     protected Long rightKey;

     // Constructors
   
    // Property accessors


    public long getUserRightId() {
        return this.userRightId;
    }
    
    public void setUserRightId(long userRightId) {
        this.userRightId = userRightId;
    }
    


    public Long getRightValue() {
        return this.rightValue;
    }
    
    public void setRightValue(Long rightValue) {
        this.rightValue = rightValue;
    }
    


    public Long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    


    public Long getRightKey() {
        return this.rightKey;
    }
    
    public void setRightKey(Long rightKey) {
        this.rightKey = rightKey;
    }
    




  // The following is extra code specified in the hbm.xml files

  public Object clone()
  {
    Object o = null;
    try
    {
      o = super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return o;
}

private String thisAction="";
 public String getThisAction()
 {
     return thisAction;
 }


public void setThisAction(String thisAction)
 {
     this.thisAction=thisAction;
 }

private int index=0;
 public int getIndex()
 {
     return index;
 }


public void setIndex(int index)
 {
     this.index=index;
 }
 





  // end of extra code specified in the hbm.xml files


}


