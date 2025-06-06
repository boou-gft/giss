/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarLupaCnpjEmpRequest.java,v 1.1 2017/11/15 00:20:41 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request;

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
 * Class ConsultarLupaCnpjEmpRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/11/15 00:20:41 $
 */
public class ConsultarLupaCnpjEmpRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _cnpjPrincipal
     */
    private long _cnpjPrincipal = 0;

    /**
     * keeps track of state for field: _cnpjPrincipal
     */
    private boolean _has_cnpjPrincipal;

    /**
     * Field _cnpjFilial
     */
    private int _cnpjFilial = 0;

    /**
     * keeps track of state for field: _cnpjFilial
     */
    private boolean _has_cnpjFilial;

    /**
     * Field _cnpjControle
     */
    private int _cnpjControle = 0;

    /**
     * keeps track of state for field: _cnpjControle
     */
    private boolean _has_cnpjControle;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarLupaCnpjEmpRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCnpjControle
     * 
     */
    public void deleteCnpjControle()
    {
        this._has_cnpjControle= false;
    } //-- void deleteCnpjControle() 

    /**
     * Method deleteCnpjFilial
     * 
     */
    public void deleteCnpjFilial()
    {
        this._has_cnpjFilial= false;
    } //-- void deleteCnpjFilial() 

    /**
     * Method deleteCnpjPrincipal
     * 
     */
    public void deleteCnpjPrincipal()
    {
        this._has_cnpjPrincipal= false;
    } //-- void deleteCnpjPrincipal() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Returns the value of field 'cnpjControle'.
     * 
     * @return int
     * @return the value of field 'cnpjControle'.
     */
    public int getCnpjControle()
    {
        return this._cnpjControle;
    } //-- int getCnpjControle() 

    /**
     * Returns the value of field 'cnpjFilial'.
     * 
     * @return int
     * @return the value of field 'cnpjFilial'.
     */
    public int getCnpjFilial()
    {
        return this._cnpjFilial;
    } //-- int getCnpjFilial() 

    /**
     * Returns the value of field 'cnpjPrincipal'.
     * 
     * @return long
     * @return the value of field 'cnpjPrincipal'.
     */
    public long getCnpjPrincipal()
    {
        return this._cnpjPrincipal;
    } //-- long getCnpjPrincipal() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Method hasCnpjControle
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControle()
    {
        return this._has_cnpjControle;
    } //-- boolean hasCnpjControle() 

    /**
     * Method hasCnpjFilial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilial()
    {
        return this._has_cnpjFilial;
    } //-- boolean hasCnpjFilial() 

    /**
     * Method hasCnpjPrincipal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjPrincipal()
    {
        return this._has_cnpjPrincipal;
    } //-- boolean hasCnpjPrincipal() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
     * Sets the value of field 'cnpjControle'.
     * 
     * @param cnpjControle the value of field 'cnpjControle'.
     */
    public void setCnpjControle(int cnpjControle)
    {
        this._cnpjControle = cnpjControle;
        this._has_cnpjControle = true;
    } //-- void setCnpjControle(int) 

    /**
     * Sets the value of field 'cnpjFilial'.
     * 
     * @param cnpjFilial the value of field 'cnpjFilial'.
     */
    public void setCnpjFilial(int cnpjFilial)
    {
        this._cnpjFilial = cnpjFilial;
        this._has_cnpjFilial = true;
    } //-- void setCnpjFilial(int) 

    /**
     * Sets the value of field 'cnpjPrincipal'.
     * 
     * @param cnpjPrincipal the value of field 'cnpjPrincipal'.
     */
    public void setCnpjPrincipal(long cnpjPrincipal)
    {
        this._cnpjPrincipal = cnpjPrincipal;
        this._has_cnpjPrincipal = true;
    } //-- void setCnpjPrincipal(long) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarLupaCnpjEmpRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.request.ConsultarLupaCnpjEmpRequest unmarshal(java.io.Reader) 

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
