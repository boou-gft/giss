/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response;

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
 * Class ListaItemComplementar.
 * 
 * @version $Revision$ $Date$
 */
public class ListaItemComplementar implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemItemCompl
     */
    private int _itemItemCompl = 0;

    /**
     * keeps track of state for field: _itemItemCompl
     */
    private boolean _has_itemItemCompl;

    /**
     * Field _descItemCompl
     */
    private java.lang.String _descItemCompl;

    /**
     * Field _status
     */
    private java.lang.String _status;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaItemComplementar() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListaItemComplementar()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteItemItemCompl
     * 
     */
    public void deleteItemItemCompl()
    {
        this._has_itemItemCompl= false;
    } //-- void deleteItemItemCompl() 

    /**
     * Returns the value of field 'descItemCompl'.
     * 
     * @return String
     * @return the value of field 'descItemCompl'.
     */
    public java.lang.String getDescItemCompl()
    {
        return this._descItemCompl;
    } //-- java.lang.String getDescItemCompl() 

    /**
     * Returns the value of field 'itemItemCompl'.
     * 
     * @return int
     * @return the value of field 'itemItemCompl'.
     */
    public int getItemItemCompl()
    {
        return this._itemItemCompl;
    } //-- int getItemItemCompl() 

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
     * Method hasItemItemCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasItemItemCompl()
    {
        return this._has_itemItemCompl;
    } //-- boolean hasItemItemCompl() 

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
     * Sets the value of field 'descItemCompl'.
     * 
     * @param descItemCompl the value of field 'descItemCompl'.
     */
    public void setDescItemCompl(java.lang.String descItemCompl)
    {
        this._descItemCompl = descItemCompl;
    } //-- void setDescItemCompl(java.lang.String) 

    /**
     * Sets the value of field 'itemItemCompl'.
     * 
     * @param itemItemCompl the value of field 'itemItemCompl'.
     */
    public void setItemItemCompl(int itemItemCompl)
    {
        this._itemItemCompl = itemItemCompl;
        this._has_itemItemCompl = true;
    } //-- void setItemItemCompl(int) 

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
     * @return ListaItemComplementar
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListaItemComplementar unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListaItemComplementar) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListaItemComplementar.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.response.ListaItemComplementar unmarshal(java.io.Reader) 

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
