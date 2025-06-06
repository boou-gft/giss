/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request;

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
 * Class ListarComboCosifEmpRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarComboCosifEmpRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoEmpresa
     */
    private int _codigoEmpresa = 0;

    /**
     * keeps track of state for field: _codigoEmpresa
     */
    private boolean _has_codigoEmpresa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboCosifEmpRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoEmpresa
     * 
     */
    public void deleteCodigoEmpresa()
    {
        this._has_codigoEmpresa= false;
    } //-- void deleteCodigoEmpresa() 

    /**
     * Returns the value of field 'codigoEmpresa'.
     * 
     * @return int
     * @return the value of field 'codigoEmpresa'.
     */
    public int getCodigoEmpresa()
    {
        return this._codigoEmpresa;
    } //-- int getCodigoEmpresa() 

    /**
     * Method hasCodigoEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoEmpresa()
    {
        return this._has_codigoEmpresa;
    } //-- boolean hasCodigoEmpresa() 

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
     * Sets the value of field 'codigoEmpresa'.
     * 
     * @param codigoEmpresa the value of field 'codigoEmpresa'.
     */
    public void setCodigoEmpresa(int codigoEmpresa)
    {
        this._codigoEmpresa = codigoEmpresa;
        this._has_codigoEmpresa = true;
    } //-- void setCodigoEmpresa(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboCosifEmpRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.request.ListarComboCosifEmpRequest unmarshal(java.io.Reader) 

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
