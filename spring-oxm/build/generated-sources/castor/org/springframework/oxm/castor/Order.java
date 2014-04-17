/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package org.springframework.oxm.castor;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Order.
 * 
 * @version $Revision$ $Date$
 */
public class Order implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _orderItemList.
     */
    private java.util.List _orderItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Order() {
        super();
        this._orderItemList = new java.util.ArrayList();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOrderItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderItem(
            final org.springframework.oxm.castor.OrderItem vOrderItem)
    throws java.lang.IndexOutOfBoundsException {
        this._orderItemList.add(vOrderItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOrderItem(
            final int index,
            final org.springframework.oxm.castor.OrderItem vOrderItem)
    throws java.lang.IndexOutOfBoundsException {
        this._orderItemList.add(index, vOrderItem);
    }

    /**
     * Method enumerateOrderItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateOrderItem(
    ) {
        return java.util.Collections.enumeration(this._orderItemList);
    }

    /**
     * Method getOrderItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.springframework.oxm.castor.OrderItem at the given index
     */
    public org.springframework.oxm.castor.OrderItem getOrderItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderItemList.size()) {
            throw new IndexOutOfBoundsException("getOrderItem: Index value '" + index + "' not in range [0.." + (this._orderItemList.size() - 1) + "]");
        }
        
        return (org.springframework.oxm.castor.OrderItem) _orderItemList.get(index);
    }

    /**
     * Method getOrderItem.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.springframework.oxm.castor.OrderItem[] getOrderItem(
    ) {
        org.springframework.oxm.castor.OrderItem[] array = new org.springframework.oxm.castor.OrderItem[0];
        return (org.springframework.oxm.castor.OrderItem[]) this._orderItemList.toArray(array);
    }

    /**
     * Method getOrderItemCount.
     * 
     * @return the size of this collection
     */
    public int getOrderItemCount(
    ) {
        return this._orderItemList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateOrderItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateOrderItem(
    ) {
        return this._orderItemList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllOrderItem(
    ) {
        this._orderItemList.clear();
    }

    /**
     * Method removeOrderItem.
     * 
     * @param vOrderItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeOrderItem(
            final org.springframework.oxm.castor.OrderItem vOrderItem) {
        boolean removed = _orderItemList.remove(vOrderItem);
        return removed;
    }

    /**
     * Method removeOrderItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.springframework.oxm.castor.OrderItem removeOrderItemAt(
            final int index) {
        java.lang.Object obj = this._orderItemList.remove(index);
        return (org.springframework.oxm.castor.OrderItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vOrderItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOrderItem(
            final int index,
            final org.springframework.oxm.castor.OrderItem vOrderItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._orderItemList.size()) {
            throw new IndexOutOfBoundsException("setOrderItem: Index value '" + index + "' not in range [0.." + (this._orderItemList.size() - 1) + "]");
        }
        
        this._orderItemList.set(index, vOrderItem);
    }

    /**
     * 
     * 
     * @param vOrderItemArray
     */
    public void setOrderItem(
            final org.springframework.oxm.castor.OrderItem[] vOrderItemArray) {
        //-- copy array
        _orderItemList.clear();
        
        for (int i = 0; i < vOrderItemArray.length; i++) {
                this._orderItemList.add(vOrderItemArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.springframework.oxm.castor.Order
     */
    public static org.springframework.oxm.castor.Order unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.springframework.oxm.castor.Order) Unmarshaller.unmarshal(org.springframework.oxm.castor.Order.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
