/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ParametrizarMinMaxAliquotaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ParametrizarMinMaxAliquotaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _percentMinimoAliquota
     */
    private java.math.BigDecimal _percentMinimoAliquota = new java.math.BigDecimal("0");

    /**
     * Field _percentMaximoAliquota
     */
    private java.math.BigDecimal _percentMaximoAliquota = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ParametrizarMinMaxAliquotaRequest() 
     {
        super();
        setPercentMinimoAliquota(new java.math.BigDecimal("0"));
        setPercentMaximoAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Returns the value of field 'percentMaximoAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentMaximoAliquota'.
     */
    public java.math.BigDecimal getPercentMaximoAliquota()
    {
        return this._percentMaximoAliquota;
    } //-- java.math.BigDecimal getPercentMaximoAliquota() 

    /**
     * Returns the value of field 'percentMinimoAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentMinimoAliquota'.
     */
    public java.math.BigDecimal getPercentMinimoAliquota()
    {
        return this._percentMinimoAliquota;
    } //-- java.math.BigDecimal getPercentMinimoAliquota() 

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
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'percentMaximoAliquota'.
     * 
     * @param percentMaximoAliquota the value of field
     * 'percentMaximoAliquota'.
     */
    public void setPercentMaximoAliquota(java.math.BigDecimal percentMaximoAliquota)
    {
        this._percentMaximoAliquota = percentMaximoAliquota;
    } //-- void setPercentMaximoAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentMinimoAliquota'.
     * 
     * @param percentMinimoAliquota the value of field
     * 'percentMinimoAliquota'.
     */
    public void setPercentMinimoAliquota(java.math.BigDecimal percentMinimoAliquota)
    {
        this._percentMinimoAliquota = percentMinimoAliquota;
    } //-- void setPercentMinimoAliquota(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ParametrizarMinMaxAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.request.ParametrizarMinMaxAliquotaRequest unmarshal(java.io.Reader) 

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
