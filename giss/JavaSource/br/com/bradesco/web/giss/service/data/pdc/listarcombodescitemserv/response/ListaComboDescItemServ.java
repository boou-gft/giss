/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaComboDescItemServ.java,v 1.4 2017/11/15 22:17:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response;

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
 * Class ListaComboDescItemServ.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/15 22:17:10 $
 */
public class ListaComboDescItemServ implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemServ
     */
    private int _codItemServ = 0;

    /**
     * keeps track of state for field: _codItemServ
     */
    private boolean _has_codItemServ;

    /**
     * Field _descItemServ
     */
    private java.lang.String _descItemServ;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaComboDescItemServ() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemServ
     * 
     */
    public void deleteCodItemServ()
    {
        this._has_codItemServ= false;
    } //-- void deleteCodItemServ() 

    /**
     * Returns the value of field 'codItemServ'.
     * 
     * @return int
     * @return the value of field 'codItemServ'.
     */
    public int getCodItemServ()
    {
        return this._codItemServ;
    } //-- int getCodItemServ() 

    /**
     * Returns the value of field 'descItemServ'.
     * 
     * @return String
     * @return the value of field 'descItemServ'.
     */
    public java.lang.String getDescItemServ()
    {
        return this._descItemServ;
    } //-- java.lang.String getDescItemServ() 

    /**
     * Method hasCodItemServ
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemServ()
    {
        return this._has_codItemServ;
    } //-- boolean hasCodItemServ() 

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
     * Sets the value of field 'codItemServ'.
     * 
     * @param codItemServ the value of field 'codItemServ'.
     */
    public void setCodItemServ(int codItemServ)
    {
        this._codItemServ = codItemServ;
        this._has_codItemServ = true;
    } //-- void setCodItemServ(int) 

    /**
     * Sets the value of field 'descItemServ'.
     * 
     * @param descItemServ the value of field 'descItemServ'.
     */
    public void setDescItemServ(java.lang.String descItemServ)
    {
        this._descItemServ = descItemServ;
    } //-- void setDescItemServ(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaComboDescItemServ
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.response.ListaComboDescItemServ unmarshal(java.io.Reader) 

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
