package AP_Exam;

public class LinkedList
{
   private String opaqueObject;
   private LinkedList prevNode;
   private LinkedList nextNode;

  /**
   *  Constructs a new element with object objValue,
   *  followed by object address
   *
   * @param  opaqueObject  Address of Object
   */
  public LinkedList(String opaqueObject, LinkedList node)
  {
	setObject(opaqueObject);
	setPrevNode(node);
	setNextNode(null);
  }

  /**
   *  Setter for opaqueObjecg in LinkedList object
   *
   * @param  opaqueObject2  Address of Object
   */
  public void setObject(String opaqueObject2)
  {
    this.opaqueObject = opaqueObject2;
  }
  
  /**
   *  Setter for prevNode in LinkedList object
   *
   * @node    A LinkedList object that is prevNode to current Object
   */
  public void setPrevNode(LinkedList node)
  {
    this.prevNode = node;
  }
  
  /**
   *  Setter for nextNode in LinkedList object
   *
   * @node    A LinkedList object that is nextNode to current Object
   */
  public void setNextNode(LinkedList node)
  {
    this.nextNode = node;
  }
  
  /**
   *  Returns opaqueObject for this element
   *
   * @return    The opaqueObject associated with this element
   */
  public String getObject()
  {
    return opaqueObject;
  }

  /**
   *  Returns reference to previous object in list
   *
   * @return    The pointer is to the previous object in the list
   */
  public LinkedList getPrevious()
  {
    return prevNode;
  }
  
  /**
   *  Returns reference to next object in list
   *
   * @return    The pointer is to the next object in the list
   */
  public LinkedList getNext()
  {
    return nextNode;
  }
}