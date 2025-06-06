/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaComboEstado.java,v 1.2 2017/12/18 11:45:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response;

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
 * Class ListaComboEstado.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/18 11:45:59 $
 */
public class ListaComboEstado implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codUf
     */
    private int _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

    /**
     * Field _codSiglaUf
     */
    private java.lang.String _codSiglaUf;

    /**
     * Field _descUf
     */
    private java.lang.String _descUf;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaComboEstado() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Returns the value of field 'codSiglaUf'.
     * 
     * @return String
     * @return the value of field 'codSiglaUf'.
     */
    public java.lang.String getCodSiglaUf()
    {
        return this._codSiglaUf;
    } //-- java.lang.String getCodSiglaUf() 

    /**
     * Returns the value of field 'codUf'.
     * 
     * @return int
     * @return the value of field 'codUf'.
     */
    public int getCodUf()
    {
        return this._codUf;
    } //-- int getCodUf() 

    /**
     * Returns the value of field 'descUf'.
     * 
     * @return String
     * @return the value of field 'descUf'.
     */
    public java.lang.String getDescUf()
    {
        return this._descUf;
    } //-- java.lang.String getDescUf() 

    /**
     * Method hasCodUf
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUf()
    {
        return this._has_codUf;
    } //-- boolean hasCodUf() 

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
     * Sets the value of field 'codSiglaUf'.
     * 
     * @param codSiglaUf the value of field 'codSiglaUf'.
     */
    public void setCodSiglaUf(java.lang.String codSiglaUf)
    {
        this._codSiglaUf = codSiglaUf;
    } //-- void setCodSiglaUf(java.lang.String) 

    /**
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(int codUf)
    {
        this._codUf = codUf;
        this._has_codUf = true;
    } //-- void setCodUf(int) 

    /**
     * Sets the value of field 'descUf'.
     * 
     * @param descUf the value of field 'descUf'.
     */
    public void setDescUf(java.lang.String descUf)
    {
        this._descUf = descUf;
    } //-- void setDescUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaComboEstado
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.response.ListaComboEstado unmarshal(java.io.Reader) 

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
