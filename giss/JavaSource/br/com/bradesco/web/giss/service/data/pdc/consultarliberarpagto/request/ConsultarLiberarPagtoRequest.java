/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request;

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
 * Class ConsultarLiberarPagtoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarLiberarPagtoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorrencias
     */
    private int _maxOcorrencias = 0;

    /**
     * keeps track of state for field: _maxOcorrencias
     */
    private boolean _has_maxOcorrencias;

    /**
     * Field _anoMes
     */
    private int _anoMes = 0;

    /**
     * keeps track of state for field: _anoMes
     */
    private boolean _has_anoMes;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarLiberarPagtoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMes
     * 
     */
    public void deleteAnoMes()
    {
        this._has_anoMes= false;
    } //-- void deleteAnoMes() 

    /**
     * Method deleteMaxOcorrencias
     * 
     */
    public void deleteMaxOcorrencias()
    {
        this._has_maxOcorrencias= false;
    } //-- void deleteMaxOcorrencias() 

    /**
     * Returns the value of field 'anoMes'.
     * 
     * @return int
     * @return the value of field 'anoMes'.
     */
    public int getAnoMes()
    {
        return this._anoMes;
    } //-- int getAnoMes() 

    /**
     * Returns the value of field 'maxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'maxOcorrencias'.
     */
    public int getMaxOcorrencias()
    {
        return this._maxOcorrencias;
    } //-- int getMaxOcorrencias() 

    /**
     * Method hasAnoMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMes()
    {
        return this._has_anoMes;
    } //-- boolean hasAnoMes() 

    /**
     * Method hasMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorrencias()
    {
        return this._has_maxOcorrencias;
    } //-- boolean hasMaxOcorrencias() 

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
     * Sets the value of field 'anoMes'.
     * 
     * @param anoMes the value of field 'anoMes'.
     */
    public void setAnoMes(int anoMes)
    {
        this._anoMes = anoMes;
        this._has_anoMes = true;
    } //-- void setAnoMes(int) 

    /**
     * Sets the value of field 'maxOcorrencias'.
     * 
     * @param maxOcorrencias the value of field 'maxOcorrencias'.
     */
    public void setMaxOcorrencias(int maxOcorrencias)
    {
        this._maxOcorrencias = maxOcorrencias;
        this._has_maxOcorrencias = true;
    } //-- void setMaxOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarLiberarPagtoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.request.ConsultarLiberarPagtoRequest unmarshal(java.io.Reader) 

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
