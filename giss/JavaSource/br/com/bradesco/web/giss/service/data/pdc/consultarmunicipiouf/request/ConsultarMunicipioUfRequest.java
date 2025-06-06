/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request;

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
 * Class ConsultarMunicipioUfRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarMunicipioUfRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorrencia
     */
    private int _maxOcorrencia = 0;

    /**
     * keeps track of state for field: _maxOcorrencia
     */
    private boolean _has_maxOcorrencia;

    /**
     * Field _codUf
     */
    private int _codUf = 0;

    /**
     * keeps track of state for field: _codUf
     */
    private boolean _has_codUf;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipioUfRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUf
     * 
     */
    public void deleteCodUf()
    {
        this._has_codUf= false;
    } //-- void deleteCodUf() 

    /**
     * Method deleteMaxOcorrencia
     * 
     */
    public void deleteMaxOcorrencia()
    {
        this._has_maxOcorrencia= false;
    } //-- void deleteMaxOcorrencia() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

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
     * Returns the value of field 'maxOcorrencia'.
     * 
     * @return int
     * @return the value of field 'maxOcorrencia'.
     */
    public int getMaxOcorrencia()
    {
        return this._maxOcorrencia;
    } //-- int getMaxOcorrencia() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

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
     * Method hasMaxOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorrencia()
    {
        return this._has_maxOcorrencia;
    } //-- boolean hasMaxOcorrencia() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

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
     * Sets the value of field 'maxOcorrencia'.
     * 
     * @param maxOcorrencia the value of field 'maxOcorrencia'.
     */
    public void setMaxOcorrencia(int maxOcorrencia)
    {
        this._maxOcorrencia = maxOcorrencia;
        this._has_maxOcorrencia = true;
    } //-- void setMaxOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarMunicipioUfRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.request.ConsultarMunicipioUfRequest unmarshal(java.io.Reader) 

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
