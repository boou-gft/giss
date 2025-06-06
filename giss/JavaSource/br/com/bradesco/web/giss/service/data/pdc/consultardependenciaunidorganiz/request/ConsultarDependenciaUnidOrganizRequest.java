/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarDependenciaUnidOrganizRequest.java,v 1.1 2017/04/11 14:11:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request;

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
 * Class ConsultarDependenciaUnidOrganizRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:57 $
 */
public class ConsultarDependenciaUnidOrganizRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoDependencia
     */
    private int _codigoDependencia = 0;

    /**
     * keeps track of state for field: _codigoDependencia
     */
    private boolean _has_codigoDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaUnidOrganizRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoDependencia
     * 
     */
    public void deleteCodigoDependencia()
    {
        this._has_codigoDependencia= false;
    } //-- void deleteCodigoDependencia() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return int
     * @return the value of field 'codigoDependencia'.
     */
    public int getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- int getCodigoDependencia() 

    /**
     * Method hasCodigoDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependencia()
    {
        return this._has_codigoDependencia;
    } //-- boolean hasCodigoDependencia() 

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
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(int codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
        this._has_codigoDependencia = true;
    } //-- void setCodigoDependencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaUnidOrganizRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.request.ConsultarDependenciaUnidOrganizRequest unmarshal(java.io.Reader) 

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
