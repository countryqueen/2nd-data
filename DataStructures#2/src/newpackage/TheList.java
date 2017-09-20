/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 *  Class Name TheList
 * Class Author Angelica Jones
 * Purpose of the class To learn how to use the linked list and recursion
 * Date 9/19/19
 */
public class TheList 
{
    //first we need to set up the instance variables
    //here are the private instance variables
    private int value;
    
    private TheList nextLink;  
    
    //this is my getter
    public int getValue()
    {
        
        return value;

    }
    
    //this is my getter
    public TheList getLinkList()
    {
        return getNextLink();
        
    }
    
    //create a setter
    public void setValue(int value)
    {
        this.value = value;
    }
    
    //create another setter
    public void setLinkList(TheList nextLink)
    {
        this.setNextLink(nextLink);
    }

    //java created this when I wanted to add the 500 numbers to the list in my GUI.
    void AddToList(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nextLink
     */
    protected TheList getNextLink() {
        return nextLink;
    }

    /**
     * @param nextLink the nextLink to set
     */
    protected void setNextLink(TheList nextLink) {
        this.nextLink = nextLink;
    }

}
    

