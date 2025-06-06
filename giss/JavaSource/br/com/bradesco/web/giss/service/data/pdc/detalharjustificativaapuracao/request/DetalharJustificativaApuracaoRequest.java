/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request;

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
 * Class DetalharJustificativaApuracaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharJustificativaApuracaoRequest implements java.io.Serializable {


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
     * Field _mesAno
     */
    private int _mesAno = 0;

    /**
     * keeps track of state for field: _mesAno
     */
    private boolean _has_mesAno;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharJustificativaApuracaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteMaxOcorrencias
     * 
     */
    public void deleteMaxOcorrencias()
    {
        this._has_maxOcorrencias= false;
    } //-- void deleteMaxOcorrencias() 

    /**
     * Method deleteMesAno
     * 
     */
    public void deleteMesAno()
    {
        this._has_mesAno= false;
    } //-- void deleteMesAno() 

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
     * Returns the value of field 'mesAno'.
     * 
     * @return int
     * @return the value of field 'mesAno'.
     */
    public int getMesAno()
    {
        return this._mesAno;
    } //-- int getMesAno() 

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
     * Method hasMesAno
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAno()
    {
        return this._has_mesAno;
    } //-- boolean hasMesAno() 

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
     * Sets the value of field 'mesAno'.
     * 
     * @param mesAno the value of field 'mesAno'.
     */
    public void setMesAno(int mesAno)
    {
        this._mesAno = mesAno;
        this._has_mesAno = true;
    } //-- void setMesAno(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharJustificativaApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.request.DetalharJustificativaApuracaoRequest unmarshal(java.io.Reader) 

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
