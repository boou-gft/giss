/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarItemComplementarRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarItemComplementarRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemLeiCompl
     */
    private int _itemLeiCompl = 0;

    /**
     * keeps track of state for field: _itemLeiCompl
     */
    private boolean _has_itemLeiCompl;

    /**
     * Field _status
     */
    private java.lang.String _status;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarItemComplementarRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteItemLeiCompl
     * 
     */
    public void deleteItemLeiCompl()
    {
        this._has_itemLeiCompl= false;
    } //-- void deleteItemLeiCompl() 

    /**
     * Returns the value of field 'itemLeiCompl'.
     * 
     * @return int
     * @return the value of field 'itemLeiCompl'.
     */
    public int getItemLeiCompl()
    {
        return this._itemLeiCompl;
    } //-- int getItemLeiCompl() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return String
     * @return the value of field 'status'.
     */
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Method hasItemLeiCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasItemLeiCompl()
    {
        return this._has_itemLeiCompl;
    } //-- boolean hasItemLeiCompl() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'itemLeiCompl'.
     * 
     * @param itemLeiCompl the value of field 'itemLeiCompl'.
     */
    public void setItemLeiCompl(int itemLeiCompl)
    {
        this._itemLeiCompl = itemLeiCompl;
        this._has_itemLeiCompl = true;
    } //-- void setItemLeiCompl(int) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarItemComplementarRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.request.ListarItemComplementarRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
