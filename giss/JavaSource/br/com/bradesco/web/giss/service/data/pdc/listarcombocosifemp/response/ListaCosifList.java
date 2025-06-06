/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response;

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
 * Class ListaCosifList.
 * 
 * @version $Revision$ $Date$
 */
public class ListaCosifList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codCosif
     */
    private long _codCosif = 0;

    /**
     * keeps track of state for field: _codCosif
     */
    private boolean _has_codCosif;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaCosifList() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosifList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodCosif
     * 
     */
    public void deleteCodCosif()
    {
        this._has_codCosif= false;
    } //-- void deleteCodCosif() 

    /**
     * Returns the value of field 'codCosif'.
     * 
     * @return long
     * @return the value of field 'codCosif'.
     */
    public long getCodCosif()
    {
        return this._codCosif;
    } //-- long getCodCosif() 

    /**
     * Method hasCodCosif
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodCosif()
    {
        return this._has_codCosif;
    } //-- boolean hasCodCosif() 

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
     * Sets the value of field 'codCosif'.
     * 
     * @param codCosif the value of field 'codCosif'.
     */
    public void setCodCosif(long codCosif)
    {
        this._codCosif = codCosif;
        this._has_codCosif = true;
    } //-- void setCodCosif(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaCosifList
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosifList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosifList) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosifList.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.response.ListaCosifList unmarshal(java.io.Reader)

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
